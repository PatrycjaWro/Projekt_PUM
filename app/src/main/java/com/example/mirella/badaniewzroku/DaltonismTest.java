package com.example.mirella.badaniewzroku;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.Toast;

import java.util.Random;

public class DaltonismTest extends AppCompatActivity {


    protected Button btn_ready;
    protected ImageView imageD;
    protected NumberPicker numberPicker;
    final Random rnd = new Random();
    int sum = 0;
    int count = 0;
    int number_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daltonism_test);

        btn_ready = (Button) findViewById(R.id.btn_ready);
        imageD = (ImageView) findViewById(R.id.imageD);
        numberPicker = (NumberPicker) findViewById(R.id.numberPicker);
        numberPicker.setMaxValue(15);
        numberPicker.setMinValue(0);

        final int[] images_1 = {R.drawable.i_1, R.drawable.i_2, R.drawable.i_3,
                R.drawable.i_4, R.drawable.i_5, R.drawable.i_6, R.drawable.i_6a, R.drawable.i_7, R.drawable.i_8, R.drawable.i_8a,
                R.drawable.i_9, R.drawable.i_99, R.drawable.i_10a, R.drawable.i_10a};
        number_1 = rnd.nextInt(9);
        imageD.setImageResource(images_1[number_1]);


        btn_ready.setOnClickListener(new View.OnClickListener() {


            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {

                int value = numberPicker.getValue();


                if (count >= 0 && count <= 10) {
                    if (number_1 == 0 & value == 1) {
                        sum += 1;
                    } else if (number_1 == 1 & value == 2) {
                        sum += 1;
                    } else if (number_1 == 2 & value == 3) {
                        sum += 1;
                    } else if (number_1 == 3 & value == 4) {
                        sum += 1;
                    } else if (number_1 == 4 & value == 5) {
                        sum += 1;
                    } else if (number_1 == 5 || number_1 == 6 & value == 6) {
                        sum += 1;
                    } else if (number_1 == 7 & value == 7) {
                        sum += 1;
                    } else if (number_1 == 8 || number_1 == 9 & value == 8) {
                        sum += 1;
                    } else if (number_1 == 10 || number_1 == 11 & value == 9) {
                        sum += 1;
                    } else if (number_1 == 12 || number_1 == 13 & value == 10) {
                        sum += 1;
                    }


                    number_1 = rnd.nextInt(9);
                    imageD.setImageResource(images_1[number_1]);

                    count += 1;

                    if (count == 10) {
                        imageD.setVisibility(View.INVISIBLE);
                        numberPicker.setVisibility(View.INVISIBLE);
                        Toast.makeText(DaltonismTest.this, "Badanie zakończone!",
                                Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(DaltonismTest.this, MainView.class);
                        startActivity(intent);
                    }

                }


            }
        });

    }
}
