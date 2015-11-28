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

        tutorSubmit.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        TextView textView = (TextView)findViewById(R.id.textView);
                        TextView textView3 = (TextView)findViewById(R.id.textView3);
                        EditText editTextName = (EditText)findViewById(R.id.editTextName);
                        EditText editTextRate = (EditText)findViewById(R.id.editTextRate);

                        Editable name = editTextName.getText();
                        Editable rate = editTextRate.getText();

                        textView.setText(name);
                        textView3.setText(rate);

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