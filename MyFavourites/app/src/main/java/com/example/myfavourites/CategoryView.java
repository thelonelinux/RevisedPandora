package com.example.myfavourites;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CategoryView extends AppCompatActivity {

    ArrayList<String> categorylist=new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_category);

        Intent intent=getIntent();

        categorylist.add("VIDEO");
        categorylist.add("AUDIO");
        categorylist.add("NOTEPAD");
        categorylist.add("PAINT");
        categorylist.add("CAMERA");
        categorylist.add("OTHERS");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.list_item,
                R.id.textView,
                categorylist);

        ListView listView = findViewById(R.id.listView);

        listView.setAdapter(arrayAdapter);

    }
}
