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
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class TestWidzeniaBarw extends AppCompatActivity {


    protected Button btn_ready;
    protected ImageView imageD;
    protected NumberPicker numberPicker;
    protected TextView textView2;
    final Random rnd = new Random();
    int sum=0;
    int count=0;
    int number_1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_widzenia_barw);

        btn_ready=(Button)findViewById(R.id.btn_ready);
        imageD=(ImageView)findViewById(R.id.imageD);
        numberPicker=(NumberPicker)findViewById(R.id.numberPicker);
        numberPicker.setMaxValue(100);
        numberPicker.setMinValue(0);
        textView2 = (TextView)findViewById(R.id.textView2);

        final int [] images_1 = {R.drawable.i_3,R.drawable.i_5,R.drawable.i_7,
                R.drawable.i_9,R.drawable.i_18,R.drawable.i_29,R.drawable.i_35,R.drawable.i_42,R.drawable.i_74,R.drawable.i_96};
        number_1=rnd.nextInt(9);
        imageD.setImageResource(images_1[number_1]);



        btn_ready.setOnClickListener(new View.OnClickListener() {


            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {

                int value=numberPicker.getValue();



                if (count>=0 && count <=9)
                {
                    if (number_1==0 & value==3)
                    {
                        sum+=1;
                    }
                    else if (number_1==1 & value==5)
                    {
                        sum+=1;
                    }
                    else if (number_1==2 & value==7)
                    {
                        sum+=1;
                    }
                    else if (number_1==3 & value==9)
                    {
                        sum+=1;
                    }
                    else if (number_1==4 & value==18)
                    {
                        sum+=1;
                    }
                    else if (number_1==5 & value==29)
                    {
                        sum+=1;
                    }
                    else if (number_1==6 & value==35)
                    {
                        sum+=1;
                    }
                    else if (number_1==7 & value==42)
                    {
                        sum+=1;
                    }
                    else if (number_1==8 & value==74)
                    {
                        sum+=1;
                    }
                    else if (number_1==9 & value==96)
                    {
                        sum+=1;
                    }
                    textView2.setText(Integer.toString(sum));


                       number_1 = rnd.nextInt(9);
                       imageD.setImageResource(images_1[number_1]);

                        count += 1;

                        if (count==9){
                            imageD.setVisibility(View.INVISIBLE);
                            numberPicker.setVisibility(View.INVISIBLE);
                            btn_ready.setText("Gotowe!");
                            count+=1;
                        }

                }
                else
                {
                    Toast.makeText(TestWidzeniaBarw.this,"Badanie zakończone!",
                            Toast.LENGTH_SHORT).show();
                    Intent intent  = new Intent(TestWidzeniaBarw.this,MainView.class);
                    startActivity(intent);
                }



            }
        });

    }
}
