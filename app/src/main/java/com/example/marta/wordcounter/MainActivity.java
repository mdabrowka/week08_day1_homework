package com.example.marta.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView wordCounter;
    private EditText inputText;
    private Button countButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.wordCounter = (TextView) findViewById(R.id.counter);
        this.inputText = (EditText) findViewById(R.id.inputText);
        this.countButton = (Button) findViewById(R.id.wordCount);
    }




}
