package com.example.marta.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView counter;
    private EditText inputText;
    private Button countButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.counter = (TextView) findViewById(R.id.counter);
        this.inputText = (EditText) findViewById(R.id.inputText);
        this.countButton = (Button) findViewById(R.id.word_count);
        Log.d("MainActivity", "OnCreate called");
    }


    public void onButtonClicked(View button) {
        Log.d("MainActivity", "onButtonClicked");
        String text = this.inputText.getText().toString();
        Log.d(getClass().toString(), text);
        WordCounter calculator = new WordCounter();
        int answer = calculator.countWords(text);
        this.counter.setText(Integer.toString(answer));


    }


}




