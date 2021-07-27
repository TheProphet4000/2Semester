package com.example.androidtest.persistence.SQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB extends SQLiteOpenHelper {

    private static final String DB_NAME = "datakeeper";
    private static final int DB_VERSION = 1;

    public DB(Context context){
        super(context,DB_NAME, null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) { //laver tabels
        String sqlDataName = "CREATE TABLE name (id PRIMARY KEY, AUROINCREMENT, name VARCHAR);";
        db.execSQL(sqlDataName); //udføre sqlDataName
    }

    public boolean addName(String name){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        db.insert("names",null,contentValues);
        db.close();
        return true;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sqlDataName = "DROP TABLE IF EXISTS name"; //udføre ikke kommandoen hvis DB findes
        onCreate(db);
    }
}
