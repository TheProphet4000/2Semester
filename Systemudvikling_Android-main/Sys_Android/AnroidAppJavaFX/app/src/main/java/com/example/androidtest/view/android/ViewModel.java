package com.example.androidtest.view.android;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidtest.R;
import com.example.androidtest.model.Model;
import com.example.androidtest.persistence.SQLite.DB;
import com.example.androidtest.persistence.SQLite2.DB2;

public class  ViewModel extends AppCompatActivity {

    DB db;
    DB2 db2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DB(this); //wrapper DB
        db2 = new DB2(this);

        db.addName("Klaus Port"); //putter Klaus ind i DB
        db2.addName("MASSIVE LUXERY OVERDOSE");

        Toast.makeText(this, "all values saved to database", Toast.LENGTH_LONG).show(); //viser en notifikation med text
    }

    @SuppressLint("SetTextI18n")

    public void Clicked1(android.view.View view) {
        Model modelContent = new Model(); //wrapper Model class
        String getUppercase = modelContent.uppercase; //finder uppercase variablen i modelContent
        String lowerCase = getUppercase.toLowerCase();//laver uppercase til lowercase

        TextView txt = (TextView)findViewById(R.id.Text1);
        txt.setText(lowerCase); //viser lowerCase

        modelContent.notifyObservers();

    }
}