package com.example.jeff.tuber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Tutors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutors);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button tutorSubmit = (Button)findViewById(R.id.tutorSubmit);

        tutorSubmit.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        TextView editText = (TextView)findViewById(R.id.editText);
                        String name = editText.toString();
                    }
                }
        );
    }
}