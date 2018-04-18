package com.example.mirella.badaniewzroku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Random;

public class ContrastTest extends AppCompatActivity {

    protected ImageButton btn_up;
    protected ImageButton btn_down;
    protected ImageButton btn_left;
    protected ImageButton btn_right;
    protected ImageView imageC;
    final Random rnd = new Random();
    int sum=0;
    int count=0;
    int number_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrast_test);

        btn_down = (ImageButton) findViewById(R.id.btn_down);
        btn_up = (ImageButton) findViewById(R.id.btn_up);
        btn_right = (ImageButton) findViewById(R.id.btn_left);
        btn_left = (ImageButton) findViewById(R.id.btn_right);
        imageC = (ImageView) findViewById(R.id.imageC);

        final int [] images_1 = {R.drawable.c_0,R.drawable.c_1,R.drawable.c_2,R.drawable.c_3};
        number_1=rnd.nextInt(4);
        imageC.setImageResource(images_1[number_1]);

        final int [] images_2 = {R.drawable.c_01,R.drawable.c_11,R.drawable.c_21,R.drawable.c_31};
        final int [] images_3 = {R.drawable.c_02,R.drawable.c_12,R.drawable.c_22,R.drawable.c_32};
        final int [] images_4 = {R.drawable.c_03,R.drawable.c_13,R.drawable.c_23,R.drawable.c_33};

        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count>=0 && count <=3) {
                    switch (number_1) {
                        case 0:
                            sum += 1;
                            count += 1;
                            break;
                        default:
                            sum += 0;
                            count += 1;
                            break;
                    }
                    number_1=rnd.nextInt(4);
                    imageC.setImageResource(images_1[number_1]);
                }
                if(count>3 && count <=7) {
                    switch (number_1) {
                        case 0:
                            sum += 1;
                            count += 1;
                            break;
                        default:
                            sum += 0;
                            count += 1;
                            break;
                    }
                    number_1=rnd.nextInt(4);
                    imageC.setImageResource(images_2[number_1]);
                }
                else if(count >7 && count <=11)
                {
                    switch (number_1) {
                        case 0:
                            sum += 1;
                            count += 1;
                            break;
                        default:
                            sum += 0;
                            count += 1;
                            break;
                    }
                    number_1=rnd.nextInt(4);
                    imageC.setImageResource(images_3[number_1]);
                }
                else if(count >11 && count <=15)
                {
                    switch (number_1) {
                        case 0:
                            sum += 1;
                            count += 1;
                            break;
                        default:
                            sum += 0;
                            count += 1;
                            break;
                    }
                    number_1=rnd.nextInt(4);
                    imageC.setImageResource(images_4[number_1]);
                }
                else if(count >15)
                {
                    Toast.makeText(ContrastTest.this,"Badanie zakończone!",
                            Toast.LENGTH_SHORT).show();
                    Intent intent  = new Intent(ContrastTest.this,MainView.class);
                    startActivity(intent);
                }
            }
        });

        btn_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count>=0 && count <=3) {
                    switch (number_1) {
                        case 1:
                            sum += 1;
                            count += 1;
                            break;
                        default:
                            sum += 0;
                            count += 1;
                            break;
                    }
                    number_1=rnd.nextInt(4);
                    imageC.setImageResource(images_1[number_1]);
                }
                if(count>3 && count <=7) {
                    switch (number_1) {
                        case 1:
                            sum += 1;
                            count += 1;
                            break;
                        default:
                            sum += 0;
                            count += 1;
                            break;
                    }
                    number_1=rnd.nextInt(4);
                    imageC.setImageResource(images_2[number_1]);
                }
                else if(count >7 && count <=11)
                {
                    switch (number_1) {
                        case 1:
                            sum += 1;
                            count += 1;
                            break;
                        default:
                            sum += 0;
                            count += 1;
                            break;
                    }
                    number_1=rnd.nextInt(4);
                    imageC.setImageResource(images_3[number_1]);
                }
                else if(count >11 && count <=15)
                {
                    switch (number_1) {
                        case 1:
                            sum += 1;
                            count += 1;
                            break;
                        default:
                            sum += 0;
                            count += 1;
                            break;
                    }
                    number_1=rnd.nextInt(4);
                    imageC.setImageResource(images_4[number_1]);
                }
                else if(count >15)
                {
                    Toast.makeText(ContrastTest.this,"Badanie zakończone!",
                            Toast.LENGTH_SHORT).show();
                    Intent intent  = new Intent(ContrastTest.this,MainView.class);
                    startActivity(intent);
                }
            }
        });

        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count>=0 && count <=3) {
                    switch (number_1) {
                        case 2:
                            sum += 1;
                            count += 1;
                            break;
                        default:
                            sum += 0;
                            count += 1;
                            break;
                    }
                    number_1=rnd.nextInt(4);
                    imageC.setImageResource(images_1[number_1]);
                }
                if(count>3 && count <=7) {
                    switch (number_1) {
                        case 2:
                            sum += 1;
                            count += 1;
                            break;
                        default:
                            sum += 0;
                            count += 1;
                            break;
                    }
                    number_1=rnd.nextInt(4);
                    imageC.setImageResource(images_2[number_1]);
                }
                else if(count >7 && count <=11)
                {
                    switch (number_1) {
                        case 2:
                            sum += 1;
                            count += 1;
                            break;
                        default:
                            sum += 0;
                            count += 1;
                            break;
                    }
                    number_1=rnd.nextInt(4);
                    imageC.setImageResource(images_3[number_1]);
                }
                else if(count >11 && count <=15)
                {
                    switch (number_1) {
                        case 2:
                            sum += 1;
                            count += 1;
                            break;
                        default:
                            sum += 0;
                            count += 1;
                            break;
                    }
                    number_1=rnd.nextInt(4);
                    imageC.setImageResource(images_4[number_1]);
                }
                else if(count >15)
                {
                    Toast.makeText(ContrastTest.this,"Badanie zakończone!",
                            Toast.LENGTH_SHORT).show();
                    Intent intent  = new Intent(ContrastTest.this,MainView.class);
                    startActivity(intent);
                }
            }
        });

        btn_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count>=0 && count <=3) {
                    switch (number_1) {
                        case 3:
                            sum += 1;
                            count += 1;
                            break;
                        default:
                            sum += 0;
                            count += 1;
                            break;
                    }
                    number_1=rnd.nextInt(4);
                    imageC.setImageResource(images_1[number_1]);
                }
                if(count>3 && count <=7) {
                    switch (number_1) {
                        case 3:
                            sum += 1;
                            count += 1;
                            break;
                        default:
                            sum += 0;
                            count += 1;
                            break;
                    }
                    number_1=rnd.nextInt(4);
                    imageC.setImageResource(images_2[number_1]);
                }
                else if(count >7 && count <=11)
                {
                    switch (number_1) {
                        case 3:
                            sum += 1;
                            count += 1;
                            break;
                        default:
                            sum += 0;
                            count += 1;
                            break;
                    }
                    number_1=rnd.nextInt(4);
                    imageC.setImageResource(images_3[number_1]);
                }
                else if(count >11 && count <=15)
                {
                    switch (number_1) {
                        case 3:
                            sum += 1;
                            count += 1;
                            break;
                        default:
                            sum += 0;
                            count += 1;
                            break;
                    }
                    number_1=rnd.nextInt(4);
                    imageC.setImageResource(images_4[number_1]);
                }
                else if(count >15)
                {
                    Toast.makeText(ContrastTest.this,"Badanie zakończone!",
                            Toast.LENGTH_SHORT).show();
                    Intent intent  = new Intent(ContrastTest.this,MainView.class);
                    startActivity(intent);
                }
            }
        });
    }
}
