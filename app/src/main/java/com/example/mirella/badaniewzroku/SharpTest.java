package com.example.mirella.badaniewzroku;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
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
    int width;
    int height;
    int newWidth;
    int newHeight;

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

//        final String image = "e_" + rnd.nextInt(3);
//        imageE.setImageDrawable
//                (
//                        getResources().getDrawable(getResourceID(image, "drawable",
//                                getApplicationContext()))
//                );

        if(count>3) {
            width = imageE.getWidth();
            height = imageE.getHeight();
            newWidth = width/2;
            newHeight = height/2;
            Toast.makeText(SharpTest.this,"count -3",
                    Toast.LENGTH_SHORT).show();
        }
        else if(count >7)
        {
            width = imageE.getWidth();
            height = imageE.getHeight();
            newWidth = width/2;
            newHeight = height/2;
        }
        else if(count >11)
        {
            width = imageE.getWidth();
            height = imageE.getHeight();
            newWidth = width/2;
            newHeight = height/2;
        }
        else if(count >15)
        {
            width = imageE.getWidth();
            height = imageE.getHeight();
            newWidth = width/2;
            newHeight = height/2;
        }
        else if (count>19)
        {
            Toast.makeText(SharpTest.this,"Badanie zakończone!",
                    Toast.LENGTH_SHORT).show();
            Intent intent  = new Intent(this,MainView.class);
            startActivity(intent);
        }

         btn_left.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (number==0) {
                     sum += 1;
                     count=count+1;
                     Toast.makeText(SharpTest.this,"0 - if",
                             Toast.LENGTH_SHORT).show();
                 }
                 else {
                     sum += 0;
                     count+=1;
                     Toast.makeText(SharpTest.this,"0 - else",
                             Toast.LENGTH_SHORT).show();
                 }
                 number=rnd.nextInt(3);
                 imageE.setImageResource(images[number]);
             }
         });

         btn_up.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (number==1) {
                     sum += 1;
                     count+=1;
                     Toast.makeText(SharpTest.this,"1 - if",
                             Toast.LENGTH_SHORT).show();
                 } else {
                     sum += 0;
                     count+=1;
                     Toast.makeText(SharpTest.this,"1 - else",
                             Toast.LENGTH_SHORT).show();
                 }
                 number=rnd.nextInt(3);
                 imageE.setImageResource(images[number]);
             }
         });

         btn_right.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (number==2) {
                     sum += 1;
                     count+=1;
                     Toast.makeText(SharpTest.this,"2 - if",
                             Toast.LENGTH_SHORT).show();
                 } else {
                     sum += 0;
                     count+=1;
                     Toast.makeText(SharpTest.this,"2 - else",
                             Toast.LENGTH_SHORT).show();
                 }
                 number=rnd.nextInt(3);
                 imageE.setImageResource(images[number]);
             }
         });

         btn_down.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (number==3) {
                     sum += 1;
                     count+=1;
                     Toast.makeText(SharpTest.this,"3 - if",
                             Toast.LENGTH_SHORT).show();
                 }
                 else {
                     sum += 0;
                     count+=1;
                     Toast.makeText(SharpTest.this,"3 - else",
                             Toast.LENGTH_SHORT).show();
                 }

             }
         });
    }

//    protected final static int getResourceID (final String resName, final String resType, final Context ctx)
//    {
//            final int ResourceID =
//                    ctx.getResources().getIdentifier(resName, resType,
//                            ctx.getApplicationInfo().packageName);
//            if (ResourceID == 0) {
//                throw new IllegalArgumentException
//                        (
//                                "No resource string found with name " + resName
//                        );
//            }
//            else {
//                return ResourceID;
//            }
//    }
}
