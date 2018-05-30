package com.example.mirella.badaniewzroku;

import android.location.Location;
import android.util.Log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by Mirella on 30.05.2018.
 */

public class CSVWriter {

    public static void writePath(File file, String sum) throws IOException {
        try (FileWriter writer = new FileWriter(file)) {
                writer.append(sum);
                writer.flush();
                writer.close();
        }
         catch (IOException e) {
            // TODO Auto-generated catch block
            Log.e(TAG, "Error Writting Path", e);
        }

    }
}
