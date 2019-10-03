package com.example.myapplication;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //@TODO: Setup your drawing tools
        ImageView ivFrame = (ImageView) findViewById(R.id.imageView);
        Bitmap b = Bitmap.createBitmap(300, 500, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(b);
        Paint paintbrush = new Paint();

        // @TODO: Set the color of your background & paintbrush
        canvas.drawColor(Color.BLACK);
        paintbrush.setColor(Color.argb(255,255,255,255));

        // @TODO: Add your code to draw things


        canvas.drawLine(10,50,200,50,paintbrush);
        canvas.drawLine(10,100,200,100,paintbrush);



        // @TODO: Put canvas in the frame
        ivFrame.setImageBitmap(b);

    }
}
