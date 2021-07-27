package com.example.androidtest.model;
import android.content.Context;
import android.widget.Toast;

import java.util.Observable;

public class Model extends Observable {

    public String uppercase = "HEJ";

    private Context Hej;

    public void notifyObservers() {
        Toast toast = Toast.makeText(Hej, "Noted", Toast.LENGTH_SHORT);
        toast.show();

    }

}