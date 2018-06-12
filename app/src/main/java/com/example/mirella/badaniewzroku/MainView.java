package com.example.mirella.badaniewzroku;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view);

        Button sharpTest_btn = findViewById(R.id.SharpTest_btn);
        Button contrastTest_btn = findViewById(R.id.ContrastTest_btn);
        Button testWidzenia_btn = findViewById(R.id.testWidzenia_btn);
        Button testOgolny_btn = findViewById(R.id.testOgolny_btn);

        sharpTest_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(MainView.this).create();
                alertDialog.setTitle("Instrukcja");
                alertDialog.setMessage("Trzymaj telefon przed sobą na wyciągnięcie ręki. Zaznacz strzałkę pokazującą kierunek zwrotu literki E");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Rozumiem i przechodzę do badania.",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                Intent intent = new Intent(MainView.this, SharpTest.class);
                                startActivity(intent);
                            }
                        });
                alertDialog.show();
            }
        });

        contrastTest_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(MainView.this).create();
                alertDialog.setTitle("Instrukcja");
                alertDialog.setMessage("Trzymaj telefon przed sobą na wyciągnięcie ręki. Zaznacz strzałkę pokazującą kierunek zwrotu literki C");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Rozumiem i przechodzę do badania.",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                Intent intent = new Intent(MainView.this, ContrastTest.class);
                                startActivity(intent);
                            }
                        });
                alertDialog.show();
            }
        });

        testWidzenia_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(MainView.this).create();
                alertDialog.setTitle("Instrukcja");
                alertDialog.setMessage("Trzymaj telefon przed sobą na wyciągnięcie ręki. Wpisz w określone miejsce liczbę, którą zobaczysz na obrazku.");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Rozumiem i przechodzę do badania.",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                Intent intent = new Intent(MainView.this, DaltonismTest.class);
                                startActivity(intent);
                            }
                        });
                alertDialog.show();
            }
        });

        testOgolny_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(MainView.this).create();
                alertDialog.setTitle("Instrukcja");
                alertDialog.setMessage("Zaznacz opcje, które Ciebie dotyczą.");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Rozumiem i przechodzę do badania.",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                Intent intent = new Intent(MainView.this, GeneralTest.class);
                                startActivity(intent);
                            }
                        });
                alertDialog.show();
            }
        });
    }
}
