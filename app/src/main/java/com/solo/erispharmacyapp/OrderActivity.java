package com.solo.erispharmacyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    ArrayList<Item> itemList;
    private RecyclerView mRecyclerView;
    private ItemAdapter mAdapter;
    private Button ProceedToCheckout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        ProceedToCheckout = findViewById(R.id.proceed_to_checkout);

        ProceedToCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent checkoutIntent = new Intent(OrderActivity.this, CheckoutActivity.class);
                startActivity(checkoutIntent);
            }
        });

        itemList = new ArrayList<>();

        //Create some some dummy data
        Item item1 = new Item("Panadol", "Panadol Extra Strength", "10,000", R.drawable.panadol);
        Item item2 = new Item("Ventolin", "Ventolin Inhaler", "12,000", R.drawable.ventolin);
        Item item3 = new Item ("Face masks", "Disposable masks", "5,000", R.drawable.face_masks);
        Item item4 = new Item ("Amoxicllin", "Antibiotics capsules", "6,000", R.drawable.amoxicillin);
        Item item5 = new Item ("Band Aid", "Flexible fabric", "7,000", R.drawable.band_aid);

        //fill the arraylist with the dummy data
        itemList.add(item1); itemList.add(item2); itemList.add(item3); itemList.add(item4); itemList.add(item5);
        itemList.add(item1); itemList.add(item2); itemList.add(item3); itemList.add(item4); itemList.add(item5);

        //Get the recycler view handle
        mRecyclerView = findViewById(R.id.recyclerview1);

        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create an adapter and supply the data to be displayed.
        mAdapter = new ItemAdapter(this, itemList);

        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);

        //create the divdier lines in the recyclerview
        //RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        //mRecyclerView.addItemDecoration(itemDecoration);

    }


}
