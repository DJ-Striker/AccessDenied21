package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class sadmediummoodmain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView mRecyclerView;
        RecyclerView.Adapter mAdapter;
        RecyclerView.LayoutManager mLayoutManager;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sadmediummoodmain2);
        ArrayList<cardview> exampleList = new ArrayList<>();
        exampleList.add(new cardview(R.drawable.avenue_815297_1920, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In accumsan maximus sapien, non sollicitudin sem ullamcorper at. Aenean non nulla sapien. Maecenas mollis leo dolor, vitae mollis ipsum interdum id. Sed tempor facilisis felis venenatis fringilla. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque sed lorem at leo accumsan pulvinar quis ac quam. Nulla imperdiet justo vel massa euismod, sit amet tempor quam vulputate."));
        exampleList.add(new cardview(R.drawable.fire_123784_1920, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In accumsan maximus sapien, non sollicitudin sem ullamcorper at. Aenean non nulla sapien. Maecenas mollis leo dolor, vitae mollis ipsum interdum id. Sed tempor facilisis felis venenatis fringilla. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque sed lorem at leo accumsan pulvinar quis ac quam. Nulla imperdiet justo vel massa euismod, sit amet tempor quam vulputate."));
        exampleList.add(new cardview(R.drawable.wave_3473335_1920, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In accumsan maximus sapien, non sollicitudin sem ullamcorper at. Aenean non nulla sapien. Maecenas mollis leo dolor, vitae mollis ipsum interdum id. Sed tempor facilisis felis venenatis fringilla. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque sed lorem at leo accumsan pulvinar quis ac quam. Nulla imperdiet justo vel massa euismod, sit amet tempor quam vulputate."));

        mRecyclerView = findViewById(R.id.recycleview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
