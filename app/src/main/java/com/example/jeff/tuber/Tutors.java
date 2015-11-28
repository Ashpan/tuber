package com.example.jeff.tuber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseGeoPoint;
import com.parse.ParseObject;

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
                        EditText editTextName = (EditText)findViewById(R.id.editTextName);
                        EditText editTextRate = (EditText)findViewById(R.id.editTextRate);

                        Editable name = editTextName.getText();
                        Editable rate = editTextRate.getText();

                        CheckBox checkMath = (CheckBox)findViewById(R.id.checkMath);
                        CheckBox checkScience = (CheckBox)findViewById(R.id.checkScience);
                        CheckBox checkEnglish = (CheckBox)findViewById(R.id.checkEnglish);
                        CheckBox checkProgramming = (CheckBox)findViewById(R.id.checkProgramming);

                        if(checkMath.equals(true)) {
                            name.append("aaa");
                        }

                        ParseObject tutorInfo = new ParseObject("TutorInfo");
                        //gameScore.put("name", name);
                        //gameScore.put("rate", rate);
                        //gameScore.put("cheatMode", false);
                        //gameScore.saveInBackground();

                        ParseGeoPoint point = new ParseGeoPoint(30.0, -20.0);
                        ParseObject object = new ParseObject("PlaceObject");
                        object.put("location", point);
                        try {
                            object.save();
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }


                    }
                }
        );
    }



}