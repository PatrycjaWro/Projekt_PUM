package com.example.mirella.badaniewzroku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.app.ListActivity;

public class GeneralTest extends AppCompatActivity {

    Button btn_ready2;
    ListView listView;
    int count = 0;
    private String[] data = {"Praca przy komputerze", "Przebywanie w suchym powietrzu", "Przebywanie w zadymionych pomieszczeniach", "Praca przy słabym oświetleniu", "Palenie papierosów", "Niezdrowe odżywianie", "Częste korzystanie z małych ekranów (telefon, tablet)", "Długie czytanie książek", "Noszenie cudzych okularów"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_test);

        listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, data));
        listView.setItemsCanFocus(true);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        setContentView(listView);


        count = listView.getCheckedItemCount();


    }


}
