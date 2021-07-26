package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    Button btnReg;
    TextView result;
    EditText edtFirst, edtLast, edtUser, edtPass, edtConfPass, edtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialization of all editText
        edtFirst = (EditText) findViewById(R.id.edtfirstname);
        edtLast = (EditText) findViewById(R.id.edtlastname);
        edtUser = (EditText) findViewById(R.id.edtUsername);
        edtPass = (EditText) findViewById(R.id.edtPass);
        edtConfPass = (EditText) findViewById(R.id.edtConfirmPass);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        //Initialization of Register Button
        btnReg = (Button) findViewById(R.id.button1);

        //Registration button functionality
        btnReg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String fname = edtFirst.getText().toString();
                String password = edtPass.getText().toString();
                result.setText("Name: \t" + fname + "\nPassword:\t" + password);
            }


        });
    }
}