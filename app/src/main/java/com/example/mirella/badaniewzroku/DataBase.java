package com.example.mirella.badaniewzroku;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.mirella.badaniewzroku.DataBase.DB_CREATE_DATA_TABLE;
import static com.example.mirella.badaniewzroku.DataBase.DB_DATA_TABLE;
import static com.example.mirella.badaniewzroku.DataBase.DROP_DATA_TABLE;
import static com.example.mirella.badaniewzroku.DataBase.KEY_COMPLETED;
import static com.example.mirella.badaniewzroku.DataBase.KEY_DESCRIPTION;
import static com.example.mirella.badaniewzroku.DataBase.KEY_ID;

/**
 * Created by Mirella on 18.04.2018.
 */

public class DataBase {

    private static final int DB_VERSION = 1; //wersja bazy
    private static final String DB_NAME = "database.db"; //nazwa bazy
    public static final String DB_DATA_TABLE = "Badanie okulistyczne"; //nazwa tabeli

    public static final String KEY_ID = "_id";
    public static final String ID_OPTIONS = "INTEGER PRIMARY KEY AUTOINCREMENT";
    public static final int ID_COLUMN = 0;
    public static final String KEY_DESCRIPTION = "description";
    public static final String DESCRIPTION_OPTIONS = "TEXT NOT NULL";
    public static final int DESCRIPTION_COLUMN = 1;
    public static final String KEY_COMPLETED = "completed";
    public static final String COMPLETED_OPTIONS = "INTEGER DEFAULT 0";
    public static final int COMPLETED_COLUMN = 2;

    public static final String DB_CREATE_DATA_TABLE =
            "CREATE TABLE " + DB_DATA_TABLE + "( " +
                    KEY_ID + " " + ID_OPTIONS + ", " +
                    KEY_DESCRIPTION + " " + DESCRIPTION_OPTIONS + ", " +
                    KEY_COMPLETED + " " + COMPLETED_OPTIONS +
                    ");"; //tworzenie bazy

    public static final String DROP_DATA_TABLE =
            "DROP TABLE IF EXISTS " + DB_DATA_TABLE; //usuwanie bazy

    private SQLiteDatabase db;
    private Context context;
    private DatabaseHelper dbHelper;

    public DataBase(Context context)
    {
        this.context=context;
    }

    public DataBase Open_Stream(){           //otwieranie polaczenia do bazy danych
        dbHelper = new DatabaseHelper(context, DB_NAME, null, DB_VERSION);
        try {
            db = dbHelper.getWritableDatabase();
        } catch (SQLException e) {
            db = dbHelper.getReadableDatabase();
        }
        return this;
    }

    public void Close_Stream() {  //zamykamy polaczenie z baza danych
        dbHelper.close();
    }

}

