package com.example.kucatholic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int SELECT_PICTURE = 0;
    private ImageView imageView;
    public ImageButton imageButton1;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(android.R.id.icon);
        ImageButton next = (ImageButton) findViewById(R.id.image1);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"UPCOMING!",Toast.LENGTH_LONG).show();
            }
        });
        ImageButton imageButton = (ImageButton) findViewById(R.id.image2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"UPCOMING!",Toast.LENGTH_LONG).show();
            }
        });
        ImageButton imageButton8 = (ImageButton) findViewById(R.id.image8);
        imageButton8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"UPCOMING!",Toast.LENGTH_LONG).show();
            }
        });
        ImageButton imageButton40 = (ImageButton) findViewById(R.id.image4);
        imageButton40.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"UPCOMING!",Toast.LENGTH_LONG).show();
            }
        });
        ImageButton imageButton9 = (ImageButton) findViewById(R.id.image9);
        imageButton9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"UPCOMING!",Toast.LENGTH_LONG).show();            }

        });
        ImageButton imageButton7 = (ImageButton) findViewById(R.id.image7);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"The Parish calendar will be out at the beginning of the semester!",Toast.LENGTH_LONG).show();            }

        });
        ImageButton imagebutton2 = (ImageButton) findViewById(R.id.image3);
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), newcalendar.class);
                startActivityForResult(intent, 0);
            }
        });
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.image5);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"UPCOMING!",Toast.LENGTH_LONG).show();
            }
        });
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.image6);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"UPCOMING!",Toast.LENGTH_LONG).show();
            }
        });

    }





}