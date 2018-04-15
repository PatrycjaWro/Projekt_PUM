package com.example.mirella.badaniewzroku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainView extends AppCompatActivity {

    protected Button SharpTest_btn;
    protected Button ContrastTest_btn;
    protected Button testWidzenia_btn;
    protected Button testOgolny_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view);

        SharpTest_btn = (Button) findViewById(R.id.testOstr_btn);
        ContrastTest_btn = (Button) findViewById(R.id.testKontrastu_btn);
        testWidzenia_btn = (Button) findViewById(R.id.testWidzenia_btn);
        testOgolny_btn = (Button) findViewById(R.id.testOgolny_btn);

        SharpTest_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainView.this, SharpTest.class);
                startActivity(intent);
            }
        });

        ContrastTest_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainView.this, ContrastTest.class);
                startActivity(intent);
            }
        });

        testWidzenia_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainView.this, TestWidzeniaBarw.class);
                startActivity(intent);
            }
        });

//            testOgolny_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(this, SharpTest.class);
//                    startActivity(intent);
//                }
//            });
    }
}
