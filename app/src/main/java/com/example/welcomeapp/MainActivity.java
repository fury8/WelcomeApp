package com.example.welcomeapp;

import static com.example.welcomeapp.R.*;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        EditText myedttxt = findViewById(R.id.editTextTextPersonNameid);

        TextView mytextview = findViewById(R.id.txtVid);

        Button mybttn = findViewById(id.btnid);
        mybttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mytxtinput = myedttxt.getText().toString();

                Toast.makeText(MainActivity.this,
                        "Welcome to our app "+mytxtinput,
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}