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
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainActivity extends AppCompatActivity {

    protected Button btn_ready;
    protected EditText name;
    protected EditText surname;
    protected EditText age;

    public boolean isReadStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v("TAG", "Permission is granted1");
                return true;
            } else {

                Log.v("TAG", "Permission is revoked1");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 3);
                return false;
            }
        } else { //permission is automatically granted on sdk<23 upon installation
            Log.v("TAG", "Permission is granted1");
            return true;
        }
    }

    public boolean isWriteStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v("TAG", "Permission is granted2");
                return true;
            } else {

                Log.v("TAG", "Permission is revoked2");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 2);
                return false;
            }
        } else { //permission is automatically granted on sdk<23 upon installation
            Log.v("TAG", "Permission is granted2");
            return true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        isReadStoragePermissionGranted();
        isWriteStoragePermissionGranted();
        setContentView(R.layout.activity_main);

        btn_ready = findViewById(R.id.btn_ready);
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
                    name.setHint("Wpisz swoje imię!");
                    surname.setHint("Wpisz swoje nazwisko!");
                    age.setHint("Wpisz swój wiek!");
                } else {
                    Intent intent = new Intent(MainActivity.this, MainView.class);
                    startActivity(intent);
                    String dane = user_name + "\r\n" + user_surname + user_age;
                    Save("dane.csv", user_name, user_surname, user_age);
                }
            }
        });
    }

    private void Save(String filename, String name, String surname, String age) {
        try {
            File root = Environment.getExternalStoragePublicDirectory(
                    Environment.DIRECTORY_DCIM);
            File gpxfile = new File(root, filename);
            FileWriter writer = new FileWriter(gpxfile);
            writer.append(name);
            writer.append(',');
            writer.append(surname);
            writer.append(',');
            writer.append(age);
            writer.append('\n');
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeData(String data, String strFilePath) {
        PrintWriter csvWriter;
        try {
            File file = new File(strFilePath);
            csvWriter = new PrintWriter(new FileWriter(file, true));
            csvWriter.print(data + "," + "hello");
            csvWriter.append('\n');
            csvWriter.print("world");
            csvWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
