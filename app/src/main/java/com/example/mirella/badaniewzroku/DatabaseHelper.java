package com.example.mirella.badaniewzroku;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.mirella.badaniewzroku.DataBase.DB_CREATE_DATA_TABLE;
import static com.example.mirella.badaniewzroku.DataBase.DROP_DATA_TABLE;

/**
 * Created by Mirella on 18.04.2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(Context context, String name,
                          SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DB_CREATE_DATA_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_DATA_TABLE);
        onCreate(db);
    }


}

