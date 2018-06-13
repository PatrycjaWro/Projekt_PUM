package com.example.mirella.badaniewzroku;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

    @BindView(R.id.btn_show)
    Button btn_show;
    @BindView(R.id.my_recycler_view)
    RecyclerView my_recycler_view;
    private RecyclerView.Adapter mAdapter;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_test);
        ButterKnife.bind(this);
        List<GeneralTestItem> itemList = new ArrayList<>();
        itemList.add(new GeneralTestItem(getString(R.string.example1)));
        itemList.add(new GeneralTestItem(getString(R.string.example2)));
        itemList.add(new GeneralTestItem(getString(R.string.example3)));
        itemList.add(new GeneralTestItem(getString(R.string.example4)));
        itemList.add(new GeneralTestItem(getString(R.string.example5)));
        itemList.add(new GeneralTestItem(getString(R.string.example6)));
        itemList.add(new GeneralTestItem(getString(R.string.example7)));
        itemList.add(new GeneralTestItem(getString(R.string.example8)));
        itemList.add(new GeneralTestItem(getString(R.string.example9)));
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
            if (sItem.isSelected()) {
                count = count + 1;
            }
        }
        Toast.makeText(GeneralTest.this,
                getString(R.string.count_of_elements) + count, Toast.LENGTH_LONG)
                .show();
        Intent intent = new Intent(GeneralTest.this, MainView.class);
        startActivity(intent);
        String a = Integer.toString(count);
        writeNext(a);
    }

    private void writeNext(String sum) {
        File sdcard = new File(Environment.getExternalStorageDirectory() + getString(R.string.path));
        try {
            FileWriter writer = new FileWriter(sdcard, true);
            writer.append(getString(R.string.general_result));
            writer.append(',');
            writer.append(sum);
            writer.append('\n');
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
