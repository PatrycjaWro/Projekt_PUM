package com.example.mirella.badaniewzroku;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mirella on 18.04.2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context) {
        super(context, "database.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table Badania_Okulistyczne (" +
                "id integer primary key autoincrement," +
                "imie text," +
                "nazwisko text," +
                "wiek integer," +
                "data data," +
                "test_ostrosci integer," +
                "test_kontrastu integer," +
                "test_daltonizmu integer," +
                "test_ogolny integer);" +
                "");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }


    public long insert(String dbDataTable, Object o, ContentValues newDataValues) {
    }

    public int delete(String dbDataTable, String where, Object o) {
    }

    public int update(String dbDataTable, ContentValues updateTodoValues, String where, Object o) {
    }
}

