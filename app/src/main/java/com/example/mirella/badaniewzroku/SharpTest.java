package com.example.mirella.badaniewzroku;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

public class SharpTest extends AppCompatActivity {

    protected ImageButton btn_up;
    protected ImageButton btn_down;
    protected ImageButton btn_left;
    protected ImageButton btn_right;
    protected ImageView imageE;
    final Random rnd = new Random();
    int sum = 0;
    int count = 0;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharptest);

        btn_down = findViewById(R.id.btn_down);
        btn_up = findViewById(R.id.btn_up);
        btn_right = findViewById(R.id.btn_right);
        btn_left = findViewById(R.id.btn_left);
        imageE = findViewById(R.id.imageE);

        final int[] images = {R.drawable.e_0, R.drawable.e_1, R.drawable.e_2, R.drawable.e_3};
        number = rnd.nextInt(4);
        imageE.setImageResource(images[number]);

        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (number) {
                    case 0:
                        sum += 1;
                        count += 1;
                        break;
                    default:
                        sum += 0;
                        count += 1;
                        break;
                }
                number = rnd.nextInt(4);
                imageE.setImageResource(images[number]);

                if (count > 3 && count <= 7) {
                    SetLayout(180,180);
                } else if (count > 7 && count <= 11) {
                   SetLayout(140,140);
                } else if (count > 11 && count <= 15) {
                    SetLayout(100,100);
                } else if (count > 15 && count <= 19) {
                    SetLayout(70,70);
                } else if (count > 19) {
                   AlertDialog();
                }
            }
        });

        btn_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (number) {
                    case 1:
                        sum += 1;
                        count += 1;
                        break;
                    default:
                        sum += 0;
                        count += 1;
                        break;
                }
                number = rnd.nextInt(4);
                imageE.setImageResource(images[number]);

                if (count > 3 && count <= 7) {
                    SetLayout(180,180);
                } else if (count > 7 && count <= 11) {
                    SetLayout(140,140);
                } else if (count > 11 && count <= 15) {
                    SetLayout(100,100);
                } else if (count > 15 && count <= 19) {
                    SetLayout(70,70);
                } else if (count > 19) {
                    AlertDialog();
                }
            }
        });

        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (number) {
                    case 2:
                        sum += 1;
                        count += 1;

                        break;
                    default:
                        sum += 0;
                        count += 1;
                        break;
                }
                number = rnd.nextInt(4);
                imageE.setImageResource(images[number]);
                if (count > 3 && count <= 7) {
                    SetLayout(180,180);
                } else if (count > 7 && count <= 11) {
                    SetLayout(140,140);
                } else if (count > 11 && count <= 15) {
                    SetLayout(100,100);
                } else if (count > 15 && count <= 19) {
                    SetLayout(70,70);
                } else if (count > 19) {
                    AlertDialog();
                }
            }
        });

        btn_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (number) {
                    case 3:
                        sum += 1;
                        count += 1;
                        break;
                    default:
                        sum += 0;
                        count += 1;
                        break;
                }
                number = rnd.nextInt(4);
                imageE.setImageResource(images[number]);
                if (count > 3 && count <= 7) {
                    SetLayout(180,180);
                } else if (count > 7 && count <= 11) {
                    SetLayout(140,140);
                } else if (count > 11 && count <= 15) {
                    SetLayout(100,100);
                } else if (count > 15 && count <= 19) {
                    SetLayout(70,70);
                } else if (count > 19) {
                   AlertDialog();
                }
            }
        });
    }

    private void SetLayout(int height, int width) {
        RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(height,width);
        parms.addRule(RelativeLayout.CENTER_HORIZONTAL);
        parms.addRule(RelativeLayout.CENTER_VERTICAL);
        imageE.setLayoutParams(parms);
    }

    private void AlertDialog (){
        AlertDialog alertDialog = new AlertDialog.Builder(SharpTest.this).create();
        alertDialog.setTitle("Wynik badania");
        alertDialog.setMessage("Wynik twojego badania to " + sum + "/19");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        Intent intent = new Intent(SharpTest.this, MainView.class);
                        startActivity(intent);
                    }
                });
        alertDialog.show();
    }
}
