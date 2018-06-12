package com.example.mirella.badaniewzroku;

import java.io.Serializable;

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
