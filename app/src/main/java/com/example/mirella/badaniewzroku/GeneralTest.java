package com.example.mirella.badaniewzroku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import java.util.ArrayList;
import java.util.List;

public class GeneralTest extends AppCompatActivity {

    private Toolbar toolbar;
    @BindView(R.id.btn_show)
    Button btn_show;
    @BindView(R.id.my_recycler_view)
    RecyclerView my_recycler_view;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<GeneralTestItem> itemList;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_test);
        ButterKnife.bind(this);

        itemList = new ArrayList<GeneralTestItem>();
        itemList.add(new GeneralTestItem("Praca przy komputerze", false));
        itemList.add(new GeneralTestItem("Przebywanie w suchym powietrzu", false));
        itemList.add(new GeneralTestItem("Przebywanie w zadymionych pomieszczeniach", false));
        itemList.add(new GeneralTestItem("Praca przy słabym oświetleniu", false));
        itemList.add(new GeneralTestItem("Palenie papierosów", false));
        itemList.add(new GeneralTestItem("Niezdrowe odżywianie", false));
        itemList.add(new GeneralTestItem("Częste korzystanie z małych ekranów (telefon, tablet)", false));
        itemList.add(new GeneralTestItem("Długie czytanie książek", false));
        itemList.add(new GeneralTestItem("Noszenie cudzych okularów", false));
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new GeneraTestItemAdapter(itemList);
        mRecyclerView.setAdapter(mAdapter);
    }

    @OnClick(R.id.btn_show)
    public void Exit() {
        String data = "";
        List<GeneralTestItem> stList = ((GeneraTestItemAdapter) mAdapter)
                .getitemList();
        for (int i = 0; i < stList.size(); i++) {
            GeneralTestItem sItem = stList.get(i);
            if (sItem.isSelected() == true) {

                count = count + 1;

            }

        }
        Toast.makeText(GeneralTest.this,
                "Ilość: \n" + count, Toast.LENGTH_LONG)
                .show();

        Intent intent = new Intent(GeneralTest.this, MainView.class);
        startActivity(intent);
    }


}
