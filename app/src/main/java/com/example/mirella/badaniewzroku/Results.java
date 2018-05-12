package com.example.mirella.badaniewzroku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mirella on 12.05.2018.
 */

public class Results extends AppCompatActivity {

    protected TextView u_name;
    protected TextView u_surname;
    protected TextView u_age;
    protected TextView test1;
    protected TextView test2;
    protected TextView test3;
    protected TextView test4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        u_name = (TextView) findViewById(R.id.u_name);
        u_surname = (TextView) findViewById(R.id.u_surname);
        u_age = (TextView) findViewById(R.id.u_age);
        test1 = (TextView) findViewById(R.id.test1);
        test2 = (TextView) findViewById(R.id.test2);
        test3 = (TextView) findViewById(R.id.test3);
        test4 = (TextView) findViewById(R.id.test4);


        Intent getData = getIntent();

        String GetName = getData.getStringExtra("Name");
        String GetSurname = getData.getStringExtra("Surname");
        String GetAge = getData.getStringExtra("Age");

        u_name.setText(GetName);
        u_surname.setText(GetSurname);
        u_age.setText(GetAge);
    }
}
