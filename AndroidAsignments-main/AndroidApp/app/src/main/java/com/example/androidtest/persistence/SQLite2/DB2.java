package com.example.androidtest.persistence.SQLite2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB2 extends SQLiteOpenHelper {

    private static final String DB_NAME = "trackKeeper";
    private static final int DB_VERSION = 1;

    public DB2(Context context){
        super(context,DB_NAME, null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db2) { //laver tabels
        String sqlDataTrack = "CREATE TABLE track (id PRIMARY KEY, AUROINCREMENT, track VARCHAR);";
        db2.execSQL(sqlDataTrack); //udføre sqlDataTrack
    }

    public boolean addName(String track){
        SQLiteDatabase db2 = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("track", track);
        db2.insert("track",null,contentValues);
        db2.close();
        return true;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db2, int oldVersion, int newVersion) {
        String sqlDataName = "DROP TABLE IF EXISTS track"; //udføre ikke kommandoen hvis DB findes
        onCreate(db2);
    }
}