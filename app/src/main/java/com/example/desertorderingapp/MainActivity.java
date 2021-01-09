package com.example.desertorderingapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String PRODUCT_TYPE = "com.example.android.desertOrderingApp.extra.productType";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayToast(String str) {
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }

    public void orderDonald(View view) {
        // displayToast(getString(R.string.donald_order));
        Intent intent = new Intent(this, OrderActivity.class);
        intent.putExtra(PRODUCT_TYPE, "Donald");
        startActivity(intent);

    }

    public void orderIceCream(View view) {
        // displayToast(getString(R.string.ice_cream_order));
        Intent intent = new Intent(this, OrderActivity.class);
        intent.putExtra(PRODUCT_TYPE, "Ice Cream");
        startActivity(intent);

    }

    public void orderFroyo(View view) {
        // displayToast(getString(R.string.froyo_order));
        Intent intent = new Intent(this, OrderActivity.class);
        intent.putExtra(PRODUCT_TYPE, "Froyo");
        startActivity(intent);
    }
}