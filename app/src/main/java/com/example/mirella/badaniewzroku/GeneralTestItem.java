package com.example.mirella.badaniewzroku;

import java.io.Serializable;

class GeneralTestItem implements Serializable {

    private String name;
    private boolean isSelected;

    public GeneralTestItem(String name) {

        this.name = name;
        this.isSelected = false;
    }

    public String getName() {
        return name;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }
}
