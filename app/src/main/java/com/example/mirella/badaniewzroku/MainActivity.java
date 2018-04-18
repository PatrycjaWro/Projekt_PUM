package com.example.mirella.badaniewzroku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        btn_ready=(Button)findViewById(R.id.btn_ready);
        name = (EditText) findViewById(R.id.name);
        surname = (EditText) findViewById(R.id.surname);
        age = (EditText) findViewById(R.id.age);

        btn_ready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText() == null && surname.getText() == null && age.getText() == null) {
                    name.setText("Wpisz swoje imię!");
                    surname.setText("Wpisz swoje nazwisko!");
                    age.setText("Wpisz swój wiek!");
                }
                else {
                    Intent intent = new Intent(MainActivity.this, MainView.class);
                    startActivity(intent);
                }
            }
        });
    }
}
