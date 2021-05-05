package com.example.inverttext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> userInput = new ArrayList<>(); //opretter en tom arraylist ved navn userInput

    public void TextHandler(View v){
        TextView U = findViewById(R.id.Input);
        String getString = U.getText().toString();

        userInput.add(getString); //smider brugerens text ind i arraylist


        Intent intent = new Intent(this, BackwardsText.class);
        intent.putExtra("DataToSend", userInput);
        startActivity(intent);

        switchActivities();
    };

    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, BackwardsText.class);
        startActivity(switchActivityIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = new ArrayList<>(); //instaciere Arraylist kaldt userInput
    }
}