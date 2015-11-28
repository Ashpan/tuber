package com.example.jeff.tuber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tutors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutors);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button tutorSubmit = (Button)findViewById(R.id.tutorSubmit);
        EditText editTextName = (EditText)findViewById(R.id.editTextName);

        tutorSubmit.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        TextView textView = (TextView)findViewById(R.id.textView);
                        EditText editTextName = (EditText)findViewById(R.id.editTextName);
                        EditText editTextRate = (EditText)findViewById(R.id.editTextRate);
                        Button tutorSubmit = (Button)findViewById(R.id.tutorSubmit);
                        Editable name = editTextName.getText();

                        textView.setText(name);

                        //ParseObject tutorInfo = new ParseObject("TutorInfo");
                        //gameScore.put("name", name);
                        //gameScore.put("rate", rate);
                        //gameScore.put("cheatMode", false);
                        //gameScore.saveInBackground();
                    }
                }
        );
    }
}