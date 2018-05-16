package com.example.mirella.badaniewzroku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    protected Button btn_ready;
    protected EditText name;
    protected EditText surname;
    protected EditText age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ready = findViewById(R.id.btn_ready);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        age = findViewById(R.id.age);

        btn_ready = findViewById(R.id.btn_ready);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        age = findViewById(R.id.age);


        final String user_name = name.getText().toString();
        final String user_surname = surname.getText().toString();
        final String user_age = age.getText().toString();

        btn_ready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(user_name) || TextUtils.isEmpty(user_surname) || TextUtils.isEmpty(user_age)) {
                    name.setHint("Wpisz swoje imię!");
                    surname.setHint("Wpisz swoje nazwisko!");
                    age.setHint("Wpisz swój wiek!");
                    Intent intent = new Intent(MainActivity.this, MainView.class);
                    startActivity(intent);

                }
                else {


                }
            }
        });
    }
}
