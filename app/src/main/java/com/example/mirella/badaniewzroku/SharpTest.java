package com.example.mirella.badaniewzroku;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class SharpTest extends AppCompatActivity {

    private ImageView imageE;
    private final Random rnd = new Random();
    private int sum = 0;
    private int count = 0;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharptest);

        ImageButton btn_down = findViewById(R.id.btn_down);
        ImageButton btn_up = findViewById(R.id.btn_up);
        ImageButton btn_right = findViewById(R.id.btn_right);
        ImageButton btn_left = findViewById(R.id.btn_left);
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
                    String a=Integer.toString(sum);
                    writeNext(a);
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
                    String a=Integer.toString(sum);
                    writeNext(a);
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
                    String a=Integer.toString(sum);
                    writeNext(a);
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
                    String a=Integer.toString(sum);
                    writeNext(a);
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
        alertDialog.setMessage("Wynik twojego badania to " + sum + "/20");
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

    private void writeNext(String sum)  {
        File sdcard= new File(Environment.getExternalStorageDirectory()+ "/DCIM/dane.csv");
        try
        {
            FileWriter writer = new FileWriter(sdcard,true);
            writer.append("Wynik testu ostrości:");
            writer.append(',');
            writer.append(sum);
            writer.append('\n');
            writer.flush();
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
