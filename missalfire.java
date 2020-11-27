package com.example.kucatholic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

public class missalfire extends AppCompatActivity {

    DatabaseReference databaseReference;

    date date1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missalfire);

        Intent myIntent=getIntent();
        Bundle extras = myIntent.getExtras();




        String dateweek = extras.getString("dateweek");
        String datemyst = extras.getString("datemyst");
        String datecol = extras.getString("datecol");
        String dateentr = extras.getString("dateentr");
        String dateant = extras.getString("dateant");
        String datecoll = extras.getString("datecoll");
        String datefread = extras.getString("datefread");
        String datefiread = extras.getString("datefiread");
        String dateresppsalm = extras.getString("dateresppsalm");
        String dateresp = extras.getString("dateresp");
        String datesread = extras.getString("datesread");
        String datesecread = extras.getString("datesecread");
        String datepsa1 = extras.getString("datepsa1");
        String datepsa2 = extras.getString("datepsa2");
        String datepsa3 = extras.getString("datepsa3");
        String datepsa4 = extras.getString("datepsa4");
        String datepsa5 = extras.getString("datepsa5");
        String datealle = extras.getString("datealle");
        String dategosp = extras.getString("dategosp");
        String dategospel = extras.getString("dategospel");
        myIntent.putExtras(extras);




    }}