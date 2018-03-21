package com.example.mirella.badaniewzroku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    public class Glowna extends AppCompatActivity {

        protected Button testOstr_btn;
        protected Button testKontrastu_btn;
        protected Button testWidzenia_btn;
        protected Button testOgolny_btn;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glowna);

        testOstr_btn = (Button) findViewById(R.id.testOstr_btn);
        testKontrastu_btn = (Button) findViewById(R.id.testKontrastu_btn);
        testWidzenia_btn = (Button) findViewById(R.id.testWidzenia_btn);
        testOgolny_btn = (Button) findViewById(R.id.testOgolny_btn);

            testOstr_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Glowna.this, TestOstrosci.class);
                    startActivity(intent);
                }
            });

            testKontrastu_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Glowna.this, TestKontrastu.class);
                    startActivity(intent);
                }
            });

            testWidzenia_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Glowna.this, TestWidzeniaBarw.class);
                    startActivity(intent);
                }
            });

//            testOgolny_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(this, TestOstrosci.class);
//                    startActivity(intent);
//                }
//            });
        }
}
