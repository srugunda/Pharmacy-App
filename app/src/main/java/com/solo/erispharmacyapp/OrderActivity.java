package com.solo.erispharmacyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    ArrayList<Item> itemList;
    private RecyclerView mRecyclerView;
    private ItemAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        itemList = new ArrayList<>();

        //Create some some dummy data
        Item item1 = new Item("Panadol", "Panadol Extra Strength", "10,000", R.drawable.panadol);

        //fill the arraylist with the dummy data
        for(int i=0; i<10; i++) {
            itemList.add(item1);
        }

        //Get the recycler view handle
        mRecyclerView = findViewById(R.id.recyclerview1);

        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create an adapter and supply the data to be displayed.
        mAdapter = new ItemAdapter(this, itemList);

        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);

        //create the divdier lines in the recyclerview
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        mRecyclerView.addItemDecoration(itemDecoration);


    }
}
