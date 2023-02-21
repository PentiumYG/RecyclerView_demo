package com.example.recyclerview_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<MyModel> myModelList;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);


        // Important
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myModelList = new ArrayList<>();

        myModelList.add(new MyModel("January"));
        myModelList.add(new MyModel("February"));
        myModelList.add(new MyModel("March"));
        myModelList.add(new MyModel("April"));
        myModelList.add(new MyModel("May"));
        myModelList.add(new MyModel("June"));
        myModelList.add(new MyModel("July"));
        myModelList.add(new MyModel("August"));
        myModelList.add(new MyModel("September"));
        myModelList.add(new MyModel("October"));
        myModelList.add(new MyModel("November"));
        myModelList.add(new MyModel("December"));
        myModelList.add(new MyModel("January"));
        myModelList.add(new MyModel("February"));
        myModelList.add(new MyModel("March"));
        myModelList.add(new MyModel("April"));
        myModelList.add(new MyModel("May"));
        myModelList.add(new MyModel("June"));
        myModelList.add(new MyModel("July"));
        myModelList.add(new MyModel("August"));
        myModelList.add(new MyModel("September"));
        myModelList.add(new MyModel("October"));
        myModelList.add(new MyModel("November"));
        myModelList.add(new MyModel("December"));

        customAdapter = new CustomAdapter(this, myModelList);
        recyclerView.setAdapter(customAdapter);

    }
}