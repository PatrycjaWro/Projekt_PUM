package com.example.mirella.badaniewzroku;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Random;

public class SharpTest extends AppCompatActivity {

    protected ImageButton btn_up;
    protected ImageButton btn_down;
    protected ImageButton btn_left;
    protected ImageButton btn_right;
    protected ImageView imageE;
    final Random rnd = new Random();
    int sum=0;
    int count=0;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharptest);

        btn_down = (ImageButton) findViewById(R.id.btn_down);
        btn_up = (ImageButton) findViewById(R.id.btn_up);
        btn_right = (ImageButton) findViewById(R.id.btn_right);
        btn_left = (ImageButton) findViewById(R.id.btn_left);
        imageE = (ImageView) findViewById(R.id.imageE);


        final int [] images = {R.drawable.e_0,R.drawable.e_1,R.drawable.e_2,R.drawable.e_3};
        number=rnd.nextInt(3);
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

                 number=rnd.nextInt(3);
                 imageE.setImageResource(images[number]);

                 if(count>3 && count <=7) {
                    RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(180,180);
                    imageE.setLayoutParams(parms);
                 }
                 else if(count >7 && count <=11)
                 {
                     RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(140,140);
                     imageE.setLayoutParams(parms);
                 }
                 else if(count >11 && count <=15)
                 {
                     RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(100,100);
                     imageE.setLayoutParams(parms);
                 }
                 else if(count >15 && count <=19)
                 {
                     RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(70,70);
                     imageE.setLayoutParams(parms);
                 }
                 else if (count>19)
                 {
                     Toast.makeText(SharpTest.this,"Badanie zakończone!",
                             Toast.LENGTH_SHORT).show();
                     Intent intent  = new Intent(SharpTest.this,MainView.class);
                     startActivity(intent);
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

                 number=rnd.nextInt(3);
                 imageE.setImageResource(images[number]);

                 if(count>3 && count <=7) {
                     RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(180,180);
                     imageE.setLayoutParams(parms);
                 }
                 else if(count >7 && count <=11)
                 {
                     RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(140,140);
                     imageE.setLayoutParams(parms);
                 }
                 else if(count >11 && count <=15)
                 {
                     RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(100,100);
                     imageE.setLayoutParams(parms);
                 }
                 else if(count >15 && count <=19)
                 {
                     RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(70,70);
                     imageE.setLayoutParams(parms);
                 }
                 else if (count>19)
                 {
                     Toast.makeText(SharpTest.this,"Badanie zakończone!",
                             Toast.LENGTH_SHORT).show();
                     Intent intent  = new Intent(SharpTest.this,MainView.class);
                     startActivity(intent);
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
                 number=rnd.nextInt(3);
                 imageE.setImageResource(images[number]);

                 if(count>3 && count <=7) {
                     RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(180,180);
                     imageE.setLayoutParams(parms);
                 }
                 else if(count >7 && count <=11)
                 {
                     RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(140,140);
                     imageE.setLayoutParams(parms);
                 }
                 else if(count >11 && count <=15)
                 {
                     RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(100,100);
                     imageE.setLayoutParams(parms);
                 }
                 else if(count >15 && count <=19)
                 {
                     RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(70,70);
                     imageE.setLayoutParams(parms);
                 }
                 else if (count>19)
                 {
                     Toast.makeText(SharpTest.this,"Badanie zakończone!",
                             Toast.LENGTH_SHORT).show();
                     Intent intent  = new Intent(SharpTest.this,MainView.class);
                     startActivity(intent);
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
                 number=rnd.nextInt(3);
                 imageE.setImageResource(images[number]);

                 if(count>3 && count <=7) {
                     RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(180,180);
                    
                     imageE.setLayoutParams(parms);
                 }
                 else if(count >7 && count <=11)
                 {
                     RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(140,140);
                     parms.addRule(RelativeLayout.CENTER_HORIZONTAL);
                     parms.addRule(RelativeLayout.CENTER_VERTICAL);
                     imageE.setLayoutParams(parms);
                 }
                 else if(count >11 && count <=15)
                 {
                     RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(100,100);
                     parms.addRule(RelativeLayout.CENTER_HORIZONTAL);
                     parms.addRule(RelativeLayout.CENTER_VERTICAL);
                     imageE.setLayoutParams(parms);
                 }
                 else if(count >15 && count <=19)
                 {
                     RelativeLayout.LayoutParams parms = new RelativeLayout.LayoutParams(70,70);
                     parms.addRule(RelativeLayout.CENTER_HORIZONTAL);
                     parms.addRule(RelativeLayout.CENTER_VERTICAL);
                     imageE.setLayoutParams(parms);
                 }
                 else if (count>19)
                 {
                     Toast.makeText(SharpTest.this,"Badanie zakończone!",
                             Toast.LENGTH_SHORT).show();
                     Intent intent  = new Intent(SharpTest.this,MainView.class);
                     startActivity(intent);
                 }
             }
         });
    }
}
