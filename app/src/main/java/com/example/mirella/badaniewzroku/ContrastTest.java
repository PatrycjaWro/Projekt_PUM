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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ContrastTest extends AppCompatActivity {
    private ImageView imageC;
    private final Random rnd = new Random();
    private int sum = 0;
    private int count = 0;
    private int number_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrast_test);
        ImageButton btn_down = findViewById(R.id.btn_down);
        ImageButton btn_up = findViewById(R.id.btn_up);
        ImageButton btn_right = findViewById(R.id.btn_left);
        ImageButton btn_left = findViewById(R.id.btn_right);
        imageC = findViewById(R.id.imageC);
        final int[] images_1 = {R.drawable.c_0, R.drawable.c_1, R.drawable.c_2, R.drawable.c_3};
        final int[] images_2 = {R.drawable.c_01, R.drawable.c_11, R.drawable.c_21, R.drawable.c_31};
        final int[] images_3 = {R.drawable.c_02, R.drawable.c_12, R.drawable.c_22, R.drawable.c_32};
        final int[] images_4 = {R.drawable.c_03, R.drawable.c_13, R.drawable.c_23, R.drawable.c_33};
        number_1 = rnd.nextInt(4);
        imageC.setImageResource(images_1[number_1]);
        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count >= 0 && count <= 3) {
                    Case_2();
                    number_1 = rnd.nextInt(4);
                    imageC.setImageResource(images_1[number_1]);
                }
                if (count > 3 && count <= 7) {
                    Case_2();
                    number_1 = rnd.nextInt(4);
                    imageC.setImageResource(images_2[number_1]);
                } else if (count > 7 && count <= 11) {
                    Case_2();
                    number_1 = rnd.nextInt(4);
                    imageC.setImageResource(images_3[number_1]);
                } else if (count > 11 && count <= 15) {
                    Case_2();
                    number_1 = rnd.nextInt(4);
                    imageC.setImageResource(images_4[number_1]);
                } else if (count > 15) {
                    String a = Integer.toString(sum);
                    writeNext(a);
                    AlertDialog();
                }
            }
        });
        btn_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count >= 0 && count <= 3) {
                    Case_1();
                    number_1 = rnd.nextInt(4);
                    imageC.setImageResource(images_1[number_1]);
                }
                if (count > 3 && count <= 7) {
                    Case_1();
                    number_1 = rnd.nextInt(4);
                    imageC.setImageResource(images_2[number_1]);
                } else if (count > 7 && count <= 11) {
                    Case_1();
                    number_1 = rnd.nextInt(4);
                    imageC.setImageResource(images_3[number_1]);
                } else if (count > 11 && count <= 15) {
                    Case_1();
                    number_1 = rnd.nextInt(4);
                    imageC.setImageResource(images_4[number_1]);
                } else if (count > 15) {
                    String a = Integer.toString(sum);
                    writeNext(a);
                    AlertDialog();
                }
            }
        });
        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count >= 0 && count <= 3) {
                    Case_0();
                    number_1 = rnd.nextInt(4);
                    imageC.setImageResource(images_1[number_1]);
                }
                if (count > 3 && count <= 7) {
                    Case_0();
                    number_1 = rnd.nextInt(4);
                    imageC.setImageResource(images_2[number_1]);
                } else if (count > 7 && count <= 11) {
                    Case_0();
                    number_1 = rnd.nextInt(4);
                    imageC.setImageResource(images_3[number_1]);
                } else if (count > 11 && count <= 15) {
                    Case_0();
                    number_1 = rnd.nextInt(4);
                    imageC.setImageResource(images_4[number_1]);
                } else if (count > 15) {
                    String a = Integer.toString(sum);
                    writeNext(a);
                    AlertDialog();
                }
            }
        });
        btn_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count >= 0 && count <= 3) {
                    Case_3();
                    number_1 = rnd.nextInt(4);
                    imageC.setImageResource(images_1[number_1]);
                }
                if (count > 3 && count <= 7) {
                    Case_3();
                    number_1 = rnd.nextInt(4);
                    imageC.setImageResource(images_2[number_1]);
                } else if (count > 7 && count <= 11) {
                    Case_3();
                    number_1 = rnd.nextInt(4);
                    imageC.setImageResource(images_3[number_1]);
                } else if (count > 11 && count <= 15) {
                    Case_3();
                    number_1 = rnd.nextInt(4);
                    imageC.setImageResource(images_4[number_1]);
                } else if (count > 15) {
                    String a = Integer.toString(sum);
                    writeNext(a);
                    AlertDialog();
                }
            }
        });
    }

    private void Case_0() {
        switch (number_1) {
            case 0:
                sum += 1;
                count += 1;
                break;
            default:
                sum += 0;
                count += 1;
                break;
        }
    }

    private void Case_1() {
        switch (number_1) {
            case 1:
                sum += 1;
                count += 1;
                break;
            default:
                sum += 0;
                count += 1;
                break;
        }
    }

    private void Case_2() {
        switch (number_1) {
            case 2:
                sum += 1;
                count += 1;
                break;
            default:
                sum += 0;
                count += 1;
                break;
        }
    }

    private void Case_3() {
        switch (number_1) {
            case 3:
                sum += 1;
                count += 1;
                break;
            default:
                sum += 0;
                count += 1;
                break;
        }
    }

    private void AlertDialog() {

        AlertDialog alertDialog = new AlertDialog.Builder(ContrastTest.this).create();
        alertDialog.setTitle(getString(R.string.result_of_test));
        alertDialog.setMessage(getString(R.string.result_from_test) + sum + "/15");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, getString(R.string.ok),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        Intent intent = new Intent(ContrastTest.this, MainView.class);
                        startActivity(intent);
                    }
                });
        alertDialog.show();

    }

    private void writeNext(String sum) {
        File sdcard = new File(Environment.getExternalStorageDirectory() + getString(R.string.path));
        try {
            FileWriter writer = new FileWriter(sdcard, true);
            writer.append("Wynik testu kontrastu:");
            writer.append(',');
            writer.append(sum);
            writer.append('\n');
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
