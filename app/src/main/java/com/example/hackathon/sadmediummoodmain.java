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
        exampleList.add(new cardview(R.drawable.avenue_815297_1920, "Indulge yourself into the calming and soothing sound of the forest to realise that sometimes,taking a step back and relaxing is what really matters in life sometimes"));
        exampleList.add(new cardview(R.drawable.fire_123784_1920, "Clear your mind of unwanted and unnecessary thoughts by giving your ears some relaxing and calm sound of the fire to warm your soul and body"));
        exampleList.add(new cardview(R.drawable.wave_3473335_1920, "The sound and rhythm of ocean waves and tides coming in and out can affect the rhythm of the neuronal “waves” in our brain, encouraging a more peaceful pace of thought.Enjoy yourself"));

        mRecyclerView = findViewById(R.id.recycleview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
