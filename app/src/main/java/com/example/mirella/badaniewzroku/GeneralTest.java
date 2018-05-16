package com.example.mirella.badaniewzroku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

import java.util.ArrayList;

public class GeneralTest extends AppCompatActivity {

    Button btn_ready2;
    @BindView(R.id.recycleList)
    RecyclerView recycleList;


    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_test);
        ButterKnife.bind(this);

        ArrayList<GeneralTestItem> list = new ArrayList<GeneralTestItem>();
        list.add(new GeneralTestItem("Praca przy komputerze"));
        list.add(new GeneralTestItem("Przebywanie w suchym powietrzu"));
        list.add(new GeneralTestItem("Przebywanie w zadymionych pomieszczeniach"));
        list.add(new GeneralTestItem("Praca przy słabym oświetleniu"));
        list.add(new GeneralTestItem("Palenie papierosów"));
        list.add(new GeneralTestItem("Niezdrowe odżywianie"));
        list.add(new GeneralTestItem("Częste korzystanie z małych ekranów (telefon, tablet)"));
        list.add(new GeneralTestItem("Długie czytanie książek"));
        list.add(new GeneralTestItem("Noszenie cudzych okularów"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recycleList.setLayoutManager(layoutManager);

        final GeneraTestItemAdapter generaTestItemAdapter= new GeneraTestItemAdapter(list);
        recycleList.setAdapter(generaTestItemAdapter);
    }


}
