package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity6<button> extends AppCompatActivity {
    private TextView text;
    private TextInputEditText inputField;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        text = findViewById(R.id.intro);
        inputField = findViewById(R.id.inputext);
        submitButton = findViewById(R.id.submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable inputText =inputField.getText();
                        text.setText(inputText);
                Toast toast = Toast.makeText(Relativelayout.this,
                        inputText + "has been displayed");
            }
        });


    }
}