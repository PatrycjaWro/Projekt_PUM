package com.example.mirella.badaniewzroku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class TestOstrosci extends AppCompatActivity {

    protected Button btn_up;
    protected Button btn_down;
    protected Button btn_left;
    protected Button btn_right;
    protected ImageView imageE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_ostrosci);
    }
}
