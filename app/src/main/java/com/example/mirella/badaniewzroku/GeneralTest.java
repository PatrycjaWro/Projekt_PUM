package com.example.mirella.badaniewzroku;

import android.content.Intent;
import android.os.Environment;
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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneralTest extends AppCompatActivity {

    private Toolbar toolbar;
    @BindView(R.id.btn_show)
    Button btn_show;
    @BindView(R.id.my_recycler_view)
    RecyclerView my_recycler_view;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_test);
        ButterKnife.bind(this);

        List<GeneralTestItem> itemList = new ArrayList<GeneralTestItem>();
        itemList.add(new GeneralTestItem("Praca przy komputerze", false));
        itemList.add(new GeneralTestItem("Przebywanie w suchym powietrzu", false));
        itemList.add(new GeneralTestItem("Praca przy słabym oświetleniu", false));
        itemList.add(new GeneralTestItem("Palenie papierosów", false));
        itemList.add(new GeneralTestItem("Niezdrowe odżywianie", false));
        itemList.add(new GeneralTestItem("Częste korzystanie z telefonu)", false));
        itemList.add(new GeneralTestItem("Częste korzystanie z tabletu)", false));
        itemList.add(new GeneralTestItem("Długie czytanie książek", false));
        itemList.add(new GeneralTestItem("Noszenie cudzych okularów", false));
        RecyclerView mRecyclerView = findViewById(R.id.my_recycler_view);
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
        String a=Integer.toString(count);
        writeNext(a);
    }

    public void writeNext(String sum)  {
        File sdcard= new File(Environment.getExternalStorageDirectory()+ "/DCIM/dane.csv");
        try
        {
            FileWriter writer = new FileWriter(sdcard,true);
            writer.append("Wynik testu ogólnego:");
            writer.append(',');
            writer.append(sum);
            writer.append('\n');
            writer.flush();
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}
