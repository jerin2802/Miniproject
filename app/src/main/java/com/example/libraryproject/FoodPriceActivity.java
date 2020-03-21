package com.example.libraryproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FoodPriceActivity extends AppCompatActivity implements View.OnClickListener {

    Button foodPriceActivityButton,drinksPriceActivityButton,dessertPriceActivityButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_price);

        Toast.makeText(FoodPriceActivity.this,"Enter Successful", Toast.LENGTH_SHORT).show();
        foodPriceActivityButton= findViewById(R.id.btn1);
        foodPriceActivityButton.setOnClickListener(this);

       /* drinksPriceActivityButton= findViewById(R.id.btn1);
        drinksPriceActivityButton.setOnClickListener(this);

        dessertPriceActivityButton=(Button) findViewById(R.id.btn1);
        dessertPriceActivityButton.setOnClickListener(this);*/
    }
    public void onClick(View v) {
        Intent logoutIntent = new Intent(FoodPriceActivity.this, FoodActivity.class);
        startActivity(logoutIntent);
    }
}
