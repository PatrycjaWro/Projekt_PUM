package com.example.mirella.badaniewzroku;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText surname;
    private EditText age;

    private void isReadStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 3);
            }
        } else { //permission is automatically granted on sdk<23 upon installation
        }
    }

    private void isWriteStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 2);
            }
        } else { //permission is automatically granted on sdk<23 upon installation
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        isReadStoragePermissionGranted();
        isWriteStoragePermissionGranted();
        setContentView(R.layout.activity_main);
        Button btn_ready = findViewById(R.id.btn_ready);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        age = findViewById(R.id.age);
        btn_ready = findViewById(R.id.btn_ready);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        age = findViewById(R.id.age);

        btn_ready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String user_name = name.getText().toString();
                final String user_surname = surname.getText().toString();
                final String user_age = age.getText().toString();
                if (TextUtils.isEmpty(user_name) || TextUtils.isEmpty(user_surname) || TextUtils.isEmpty(user_age)) {
                    name.setHint(R.string.alert_name);
                    surname.setHint(R.string.alert_surname);
                    age.setHint(R.string.alert_age);
                } else {
                    Intent intent = new Intent(MainActivity.this, MainView.class);
                    startActivity(intent);
                    String dane = user_name + "\r\n" + user_surname + user_age;
                    Save(user_name, user_surname, user_age);
                }
            }
        });
    }

    private void Save(String name, String surname, String age) {
        String timeStamp = new SimpleDateFormat(getString(R.string.date_format)).format(Calendar.getInstance().getTime());
        try {
            File root = Environment.getExternalStoragePublicDirectory(
                    Environment.DIRECTORY_DCIM);
            File gpxfile = new File(root, getString(R.string.file_name));
            FileWriter writer = new FileWriter(gpxfile);
            writer.append(getString(R.string.name));
            writer.append(',');
            writer.append(getString(R.string.surname));
            writer.append(',');
            writer.append(getString(R.string.age));
            writer.append(',');
            writer.append(getString(R.string.date));
            writer.append('\n');
            writer.append(name);
            writer.append(',');
            writer.append(surname);
            writer.append(',');
            writer.append(age);
            writer.append(',');
            writer.append(timeStamp);
            writer.append('\n');
            writer.append('\n');
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
