package com.example.tv2android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    NyhedsIndsamling nyhed = new NyhedsIndsamling();

    public String Debug() {
        Log.d("Debug", "hej");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}