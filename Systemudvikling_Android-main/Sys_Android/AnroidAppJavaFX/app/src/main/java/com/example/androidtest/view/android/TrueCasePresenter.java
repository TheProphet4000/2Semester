package com.example.androidtest.view.android;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidtest.R;
import com.example.androidtest.model.Model;
import com.example.androidtest.persistence.SQLite.DB;
import com.example.androidtest.persistence.SQLite2.DB2;

public class TrueCasePresenter extends  AppCompatActivity {


    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Clicked2(View v)
    {
        Model modelContent = new Model(); //wrapper Model class
        String getUppercase = modelContent.uppercase; //finder uppercase variablen i modelContent

        TextView txt = (TextView)findViewById(R.id.Text1);
        txt.setText(getUppercase); //viser lowerCase
    }
}