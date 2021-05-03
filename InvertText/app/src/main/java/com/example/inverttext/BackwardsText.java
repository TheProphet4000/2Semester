package com.example.inverttext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class BackwardsText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backwards_text);

        ArrayList<String> userInput =  getIntent().getParcelableExtra("DataToSend");
        String convertedList = userInput.toString();


        TextView mainTekst = findViewById(R.id.textView);
        mainTekst.setText(convertedList);
    }
}