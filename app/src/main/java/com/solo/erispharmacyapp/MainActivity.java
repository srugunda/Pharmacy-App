package com.solo.erispharmacyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageView PlaceOrderView;
    private CardView PlaceOrderCardView;
    private CardView CheckStatementCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //PlaceOrderView = findViewById(R.id.place_order);
        PlaceOrderCardView = findViewById(R.id.cardview_place_order);
        CheckStatementCardView = findViewById(R.id.check_statement);

        PlaceOrderCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent orderIntent = new Intent(MainActivity.this, OrderActivity.class);
                startActivity(orderIntent);
            }
        });

        CheckStatementCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent statementIntent = new Intent(MainActivity.this, StatementActivity.class);
                startActivity(statementIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(MainActivity.this, AdminScreen.class);
            startActivity(intent);
        }
        /*
        else if(id == R.id.action_logout){
            Paper.book().destroy();
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            Toast.makeText(MainActivity.this, "Logged out of account", Toast.LENGTH_SHORT).show();
            finish();
        }

         */

        return super.onOptionsItemSelected(item);
    }
}
