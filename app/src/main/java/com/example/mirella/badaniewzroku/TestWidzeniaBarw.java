package com.example.mirella.badaniewzroku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class TestWidzeniaBarw extends AppCompatActivity {


    protected Button btn_ready;
    protected ImageView imageD;
    Random r;

    Integer[]images={
            R.drawable.i_5,
            R.drawable.i_18,
            R.drawable.i_35,
            R.drawable.i_42,
            R.drawable.i_96,
            R.drawable.i_5,
            R.drawable.i_18,
            R.drawable.i_35,
            R.drawable.i_42,
            R.drawable.i_96
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_widzenia_barw);

        btn_ready=(Button)findViewById(R.id.btn_ready);
        imageD=(ImageView)findViewById(R.id.imageD);

        r=new Random();
        btn_ready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageD.setImageResource(images[r.nextInt(images.length)]);
            }
        });

    }
}
