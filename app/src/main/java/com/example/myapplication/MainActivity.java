package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
TextView myName;
TextView myContact;
TextView myEmail;
TextView myDisplay;
Button myButton;
EditText myInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myName = (TextView) findViewById(R.id.myName);
        myContact = (TextView) findViewById(R.id.myContact);
        myEmail = (TextView) findViewById(R.id.myEmail);
        myDisplay = (TextView) findViewById(R.id.myDisplay);
        myButton = (Button) findViewById(R.id.myButton);
        myInput = (EditText) findViewById(R.id.myInput);

        //Hello.setText("Meow :3");

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myValue = myInput.getText().toString();
                myDisplay.setText("Hello " + myValue +"!");
                    }
                });
            }
        }