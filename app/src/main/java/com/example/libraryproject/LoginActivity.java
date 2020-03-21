package com.example.libraryproject;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    Button loginToFoodButton;//loginToDrinksButton,loginToDessertButton;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       /* loginToFoodButton = (Button) findViewById(R.id.btn1);
        loginToDrinksButton = (Button) findViewById(R.id.btn2);
        loginToDessertButton = (Button) findViewById(R.id.btn3);*/

        Toast.makeText(LoginActivity.this,"Login Successful", Toast.LENGTH_SHORT).show();
        loginToFoodButton = (Button) findViewById(R.id.btn1);
        loginToFoodButton.setOnClickListener(this);
       /* loginToDrinksButton.setOnClickListener(this);
        loginToDessertButton.setOnClickListener(this);*/
    }

    public void onClick(View view) {
        Intent loginIntent = new Intent(LoginActivity.this, FoodActivity.class);
        startActivity(loginIntent);

       /* Intent drinksIntent = new Intent(LoginActivity.this, DrinksActivity.class);
        startActivity(drinksIntent);

        Intent dessertIntent = new Intent(LoginActivity.this, DessertActivity.class);
        startActivity(dessertIntent);*/
    }
}
