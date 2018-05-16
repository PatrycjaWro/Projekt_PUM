package com.example.mirella.badaniewzroku;

import android.support.v7.widget.RecyclerView;

/**
 * Created by patry on 16.05.2018.
 */

public class GeneralTestItem {

    public String getChangeText() {
        return changeText;
    }

    public void setChangeText(String changeText) {
        this.changeText = changeText;
    }

    private String changeText;

    public GeneralTestItem(String changeText) {
        this.changeText = changeText;
    }


}
