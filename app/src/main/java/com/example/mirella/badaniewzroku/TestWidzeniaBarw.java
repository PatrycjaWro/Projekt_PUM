package com.example.mirella.badaniewzroku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class TestWidzeniaBarw extends AppCompatActivity {


    protected Button btn_ready;
    protected ImageView imageD;
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

        final int [] images_1 = {R.drawable.i_96,R.drawable.i_42,R.drawable.i_35,R.drawable.i_5,R.drawable.i_18};
        number_1=rnd.nextInt(4);
        imageD.setImageResource(images_1[number_1]);



        btn_ready.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (count>=0 && count <=5)
                {
                    number_1=rnd.nextInt(4);
                    imageD.setImageResource(images_1[number_1]);
                    count+=1;

                }
                else if(count==6)
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
