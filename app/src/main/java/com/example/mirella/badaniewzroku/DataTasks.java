package com.example.mirella.badaniewzroku;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import static com.example.mirella.badaniewzroku.DataBase.DB_DATA_TABLE;
import static com.example.mirella.badaniewzroku.DataBase.KEY_COMPLETED;
import static com.example.mirella.badaniewzroku.DataBase.KEY_DESCRIPTION;
import static com.example.mirella.badaniewzroku.DataBase.KEY_ID;

/**
 * Created by Mirella on 18.04.2018.
 */

public class DataTasks {

        private long id;
        private String description;
        private boolean completed;

        public DataTasks(long id, String description, boolean completed) {
            this.id = id;
            this.description = description;
            this.completed = completed;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public boolean isCompleted() {
            return completed;
        }

        public void setCompleted(boolean completed) {
            this.completed = completed;
        }

        public long InsertIntoData(String description, DatabaseHelper db) {         //dodawanie do bazy
            ContentValues newDataValues = new ContentValues();
            newDataValues.put(KEY_DESCRIPTION, description);
            return db.insert(DB_DATA_TABLE, null, newDataValues);
        }

        public boolean DeleteData(long id, DatabaseHelper db) {                    //usuwanie z bazy
            String where = KEY_ID + "=" + id;
            return db.delete(DB_DATA_TABLE, where, null) > 0;
        }

        public boolean UpdateData(com.example.mirella.badaniewzroku.DataTasks task) {
            long id = task.getId();
            String description = task.getDescription();
            boolean completed = task.isCompleted();

            return UpdateData(id,description,completed,db);
        }

        public boolean UpdateData(long id, String description, boolean completed, DatabaseHelper db) {   //aktualizacja bazy danych
            String where = KEY_ID + "=" + id;
            int completedTask = completed ? 1 : 0;
            ContentValues updateTodoValues = new ContentValues();
            updateTodoValues.put(KEY_DESCRIPTION, description);
            updateTodoValues.put(KEY_COMPLETED, completedTask);
            return db.update(DB_DATA_TABLE, updateTodoValues, where, null) > 0;
        }

    }

}
