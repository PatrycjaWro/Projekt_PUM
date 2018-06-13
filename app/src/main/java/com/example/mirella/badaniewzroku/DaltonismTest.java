package com.example.mirella.badaniewzroku;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.NumberPicker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class DaltonismTest extends AppCompatActivity {

    private ImageView imageD;
    private NumberPicker numberPicker;
    private final Random rnd = new Random();
    private int sum = 0;
    private int count = 0;
    private int number_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daltonism_test);
        Button btn_ready = findViewById(R.id.btn_ready);
        imageD = findViewById(R.id.imageD);
        numberPicker = findViewById(R.id.numberPicker);
        numberPicker.setMaxValue(15);
        numberPicker.setMinValue(0);

        final int[] images_1 = {R.drawable.i1, R.drawable.i2, R.drawable.i3,
                R.drawable.i4, R.drawable.i5, R.drawable.i6, R.drawable.i66, R.drawable.i7, R.drawable.i8, R.drawable.i88,
                R.drawable.i9, R.drawable.i99};
        number_1 = rnd.nextInt(9);
        imageD.setImageResource(images_1[number_1]);

        btn_ready.setOnClickListener(new View.OnClickListener() {


            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {
                int value = numberPicker.getValue();
                if (count < 10) {
                    int a = images_1[number_1];
                    String imageName = getResources().getResourceName(a);
                    imageName = imageName.substring(imageName.lastIndexOf("/") + 1);
                    imageName = imageName.substring(imageName.length() - 1);
                    String val = "" + value;

                    if (imageName.equals(val)) {
                        sum += 1;
                    }
                    number_1 = rnd.nextInt(9);
                    imageD.setImageResource(images_1[number_1]);
                    count += 1;
                } else {
                    imageD.setVisibility(View.INVISIBLE);
                    numberPicker.setVisibility(View.INVISIBLE);
                    AlertDialog alertDialog = new AlertDialog.Builder(DaltonismTest.this).create();
                    alertDialog.setTitle(getString(R.string.result_of_test));
                    alertDialog.setMessage(getString(R.string.result_from_test) + sum + "/10");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, getString(R.string.ok),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    Intent intent = new Intent(DaltonismTest.this, MainView.class);
                                    startActivity(intent);
                                }
                            });
                    alertDialog.show();
                    String a = Integer.toString(sum);
                    writeNext(a);
                }
            }
        });
    }

    private void writeNext(String sum) {
        File sdcard = new File(Environment.getExternalStorageDirectory() + getString(R.string.path));
        try {
            FileWriter writer = new FileWriter(sdcard, true);
            writer.append(getString(R.string.daltonism_result));
            writer.append(',');
            writer.append(sum);
            writer.append('\n');
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
