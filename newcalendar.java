package com.example.kucatholic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class newcalendar extends AppCompatActivity {
    DatePicker simpleDatePicker;
    Button submit;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newcalendar);
        ListView listView;
        String week_list = null,myst_list= null,col_list= null,entr_list= null,ant_list= null,coll_list= null,fread_list= null,fir_list= null,
        sec_list= null,sread_list= null,resp_list= null,resppsalm_list= null,psa1_list= null,psa2_list= null,psa3_list= null,psa4_list= null,psa5_list= null,
        alle_list= null,gosp_list= null,gospel_list = null;
        ArrayAdapter<String> arrayAdapter;
        date datey= new date();
        simpleDatePicker = findViewById(R.id.simpleDatePicker);


        submit = (Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int day = simpleDatePicker.getDayOfMonth();
                int month = simpleDatePicker.getMonth();
                int year = simpleDatePicker.getYear();
                String tarehe = day + "-" + month + "-" + year;

                databaseReference = FirebaseDatabase.getInstance().getReference().child("date");
                databaseReference.orderByChild("dates").equalTo(tarehe).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot Snapshot) {
                        int day = simpleDatePicker.getDayOfMonth();
                        int month = simpleDatePicker.getMonth();
                        int year = simpleDatePicker.getYear();
                        String tarehe = day + "-" + month + "-" + year;
                        if (Snapshot.exists()) {
                            for (DataSnapshot dat : Snapshot.getChildren()) {
                                String dateweek = String.valueOf(dat.child("week").getValue());
                                TextView mweek= findViewById(R.id.week);
                                mweek.setText(dateweek);
                                String datemyst = String.valueOf(dat.child("mysteries").getValue());
                                TextView mmyst= findViewById(R.id.mysteries);
                                mmyst.setText(datemyst);

                                String datecol = String.valueOf(dat.child("color").getValue());
                                TextView mcol= findViewById(R.id.color);
                                mcol.setText(datecol);
                                String dateentr = String.valueOf(dat.child("entrance").getValue());
                                TextView ment= findViewById(R.id.entrance);
                                ment.setText(dateentr);
                                String dateant = String.valueOf(dat.child("antiphon").getValue());
                                TextView manti= findViewById(R.id.antiphon);
                                manti.setText(dateant);
                                String datecoll = String.valueOf(dat.child("collect").getValue());
                                TextView mcolle= findViewById(R.id.collect);
                                mcolle.setText(datecoll);

                                String datefiread = String.valueOf(dat.child("firstread").getValue());
                                TextView mfirread= findViewById(R.id.firstread);
                                mfirread.setText(datefiread);
                                String datefread = String.valueOf(dat.child("fread").getValue());
                                TextView mfread= findViewById(R.id.fread);
                                mfread.setText(datefread);
                                String datesecread = String.valueOf(dat.child("secondread").getValue());
                                TextView msecread= findViewById(R.id.secondread);
                                msecread.setText(datesecread);
                                String datesread = String.valueOf(dat.child("sread").getValue());
                                TextView msread= findViewById(R.id.sread);
                                msread.setText(datesread);
                                String dateresp = String.valueOf(dat.child("resp").getValue());
                                TextView mres= findViewById(R.id.resp);
                                mres.setText(dateresp);
                                String dateresppsalm = String.valueOf(dat.child("resppsalm").getValue());
                                TextView mresp= findViewById(R.id.resppsalm);
                                mresp.setText(dateresppsalm);
                                String datepsa1 = String.valueOf(dat.child("psalm1").getValue());
                                TextView mpsal1= findViewById(R.id.psalm1);
                                mpsal1.setText(datepsa1);
                                String datepsa2 = String.valueOf(dat.child("psalm2").getValue());
                                TextView mpsal2= findViewById(R.id.psalm2);
                                mpsal2.setText(datepsa2);
                                String datepsa3 = String.valueOf(dat.child("psalm3").getValue());
                                TextView mpsal3= findViewById(R.id.psalm3);
                                mpsal3.setText(datepsa3);
                                String datepsa4 = String.valueOf(dat.child("psalm4").getValue());
                                TextView mpsal4= findViewById(R.id.psalm4);
                                mpsal4.setText(datepsa4);
                                String datepsa5 = String.valueOf(dat.child("psalm5").getValue());
                                TextView mpsal5= findViewById(R.id.psalm5);
                                mpsal5.setText(datepsa5);
                                String datealle = String.valueOf(dat.child("alleluia").getValue());
                                TextView malle= findViewById(R.id.allel);
                                malle.setText(datealle);
                                String dategosp = String.valueOf(dat.child("gosp").getValue());
                                TextView mgos= findViewById(R.id.gosp);
                                mgos.setText(dategosp);
                                String dategospel = String.valueOf(dat.child("gospel").getValue());
                                TextView mgosp= findViewById(R.id.gospel);
                                mgosp.setText(dategospel);




                                Bundle extras = new Bundle();
                                extras.putString(datemyst, datemyst);
                                extras.putString(dateweek, dateweek);
                                extras.putString(dategospel, dategospel);
                                extras.putString(dategosp, dategosp);
                                extras.putString(datealle, datealle);
                                extras.putString(datepsa5, datepsa5);
                                extras.putString(datepsa4, datepsa4);
                                extras.putString(datepsa3, datepsa3);
                                extras.putString(datepsa2, datepsa2);
                                extras.putString(datepsa1, datepsa1);
                                extras.putString(dateresppsalm, dateresppsalm);
                                extras.putString(dateresp, dateresp);
                                extras.putString(datesecread, datesecread);
                                extras.putString(datesread, datesread);
                                extras.putString(datefiread, datefiread);
                                extras.putString(datefread, datefread);
                                extras.putString(datecoll, datecoll);
                                extras.putString(dateant, dateant);
                                extras.putString(dateentr, dateentr);
                                extras.putString(datecol, datecol);





                                Intent myIntent = new Intent(view.getContext(), missalfire.class);
                                myIntent.putExtras(extras);
                                Toast.makeText(newcalendar.this, datemyst, Toast.LENGTH_LONG).show();

                                startActivityForResult(myIntent, 0);



                            }
                        } else {
                            Toast.makeText(newcalendar.this, "UPCOMING!", Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });
    }}

