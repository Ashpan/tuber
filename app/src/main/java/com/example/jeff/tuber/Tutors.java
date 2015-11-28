package com.example.jeff.tuber;

import android.location.Criteria;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.parse.LocationCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseGeoPoint;
import com.parse.ParseObject;
import com.parse.SaveCallback;

public class Tutors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "LTMmNYruiHWZXuxU0zz2RJKrPEPTj7JlhjvyD4K6", "zajyFctNhiIgZjHSkl6fnmoXM8PIRlkdl18ujUpL");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutors);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button tutorSubmit = (Button)findViewById(R.id.tutorSubmit);

        tutorSubmit.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        final EditText editTextName = (EditText)findViewById(R.id.editTextName);
                        final EditText editTextRate = (EditText)findViewById(R.id.editTextRate);

//                        Editable name = editTextName.getText();
//                        Editable rate = editTextRate.getText();

                        CheckBox checkMath = (CheckBox)findViewById(R.id.checkMath);
                        CheckBox checkScience = (CheckBox)findViewById(R.id.checkScience);
                        CheckBox checkEnglish = (CheckBox)findViewById(R.id.checkEnglish);
                        CheckBox checkProgramming = (CheckBox)findViewById(R.id.checkProgramming);

                        ParseGeoPoint.getCurrentLocationInBackground(20000, new LocationCallback() {
                            @Override
                            public void done(ParseGeoPoint geoPoint, ParseException e) {
                                Criteria criteria = new Criteria();
                                criteria.setAccuracy(Criteria.ACCURACY_LOW);
                                criteria.setAltitudeRequired(false);
                                criteria.setBearingRequired(false);
                                criteria.setCostAllowed(true);
                                criteria.setPowerRequirement(Criteria.POWER_LOW);
                                if (e == null) {

                                    ParseObject tutorInfo = new ParseObject("TutorInfo");
                                    tutorInfo.put("name", editTextName.getText().toString());
                                    tutorInfo.put("rate", Double.parseDouble(editTextRate.getText().toString()));
                                    tutorInfo.put("geoPoint", geoPoint);
                                    tutorInfo.put("cheatMode", false);
                                    tutorInfo.saveInBackground(new SaveCallback() {
                                        @Override
                                        public void done(ParseException e) {
                                            //this means it finished saving
                                            Log.d("", "done");
                                        }
                                    });
                                } else {
                                    System.out.println("Error" + e.toString());
                                }
                            }
                        });


                    }
                }
        );
    }



}