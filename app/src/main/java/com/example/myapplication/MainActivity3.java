package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private TextView linearTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle extras = getIntent().getExtras();
        if(extras!= null){
            String statePassedFromMainActivity=extras.getString("destination");
         linearTextView = findViewById(R.id.textView4);
         linearTextView.setText(statePassedFromMainActivity);
        }
    }
}