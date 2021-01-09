package com.example.desertorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    private TextView orderedProduct = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        this.orderedProduct = (TextView)findViewById(R.id.order_product);
        Intent intent = getIntent();
        String productType = intent.getStringExtra(MainActivity.PRODUCT_TYPE).toString();
        orderedProduct.setText("Ordering " + productType);
    }

    public void makeToastVisible(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show(); // make toast visible.
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton)view).isChecked();
        switch(view.getId()) {
            case R.id.same_day:
                if(checked) {
                    makeToastVisible(getString(R.string.same_day));
                } else {
                    break;
                }
            case R.id.next_day:
                if(checked) {
                    makeToastVisible(getString(R.string.next_day));
                } else {
                    break;
                }
            case R.id.pickup:
                if(checked) {
                    makeToastVisible(getString(R.string.pick_up));
                } else {
                    break;
                }
            default:
                break;
        }
    }
}