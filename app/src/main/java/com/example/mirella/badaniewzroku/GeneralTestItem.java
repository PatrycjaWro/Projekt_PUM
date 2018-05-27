package com.example.mirella.badaniewzroku;

import android.support.v7.widget.RecyclerView;

import java.io.Serializable;

/**
 * Created by patry on 16.05.2018.
 */

public class GeneralTestItem implements Serializable {

    private String name;

    private boolean isSelected;

    public GeneralTestItem() {

    }


    public GeneralTestItem(String name, boolean isSelected) {

        this.name = name;
        this.isSelected = isSelected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }


}
