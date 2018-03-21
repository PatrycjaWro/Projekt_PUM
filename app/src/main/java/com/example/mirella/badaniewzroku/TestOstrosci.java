package com.example.mirella.badaniewzroku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class TestOstrosci extends AppCompatActivity {

    protected ImageButton btn_up;
    protected ImageButton btn_down;
    protected ImageButton btn_left;
    protected ImageButton btn_right;
    protected ImageView imageE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_ostrosci);

        btn_down = (ImageButton) findViewById(R.id.btn_down);
        btn_up = (ImageButton) findViewById(R.id.btn_up);
        btn_right = (ImageButton) findViewById(R.id.btn_left);
        btn_left = (ImageButton) findViewById(R.id.btn_right);
        imageE = (ImageView) findViewById(R.id.imageE);

    }
}
