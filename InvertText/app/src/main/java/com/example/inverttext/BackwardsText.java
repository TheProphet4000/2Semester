package com.example.inverttext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class BackwardsText extends AppCompatActivity {

    TextView F = findViewById(R.id.textView); //finder text og laver en genvej til det

    ArrayList<String> userInput =  getIntent().getParcelableExtra("DataToSend"); //modtager info
    String convertedList = userInput.toString(); //laver det om til en string


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backwards_text);

        reverseString(convertedList); //kalder reversString, med converted list som input
    }

    public void reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse(); //omvender tekst

        F.setText(sb.toString()); //smider det formateret text ind i view
    }
}