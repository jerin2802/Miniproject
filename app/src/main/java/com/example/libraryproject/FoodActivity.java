package com.example.libraryproject;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class FoodActivity extends AppCompatActivity  implements View.OnClickListener{

    Button foodToLoginActivityButton , foodToPriceActivityButton;
    ImageView pizza , frencefry , burger , chickenfry , hotdog , coffee , drinks, hotcoffee ;
    ImageView browness,strawberrycake,strawberryice,vanilla,yummyflavoured,chocolate,blueberry;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        pizza=(ImageView) findViewById(R.id.pizza);
        burger=(ImageView) findViewById(R.id.burger);
        frencefry=(ImageView) findViewById(R.id.frencefry);
        chickenfry=(ImageView) findViewById(R.id.chickenfry);
        hotdog=(ImageView) findViewById(R.id.hotdog);
        drinks=(ImageView) findViewById(R.id.drinks);
        coffee=(ImageView) findViewById(R.id.coffee);
        hotcoffee=(ImageView) findViewById(R.id.hotcoffee);
        browness=(ImageView) findViewById(R.id.browness);
        strawberrycake=(ImageView) findViewById(R.id.strawberrycake);
        yummyflavoured=(ImageView) findViewById(R.id.yummyflavoured);
        vanilla=(ImageView) findViewById(R.id.vanilla);
        strawberryice=(ImageView) findViewById(R.id.strawberryice);
        blueberry=(ImageView) findViewById(R.id.blueberry);
        chocolate=(ImageView) findViewById(R.id.chocolate);

        pizza.setOnClickListener(this);
        burger.setOnClickListener(this);
        frencefry.setOnClickListener(this);
        chickenfry.setOnClickListener(this);
        hotdog.setOnClickListener(this);
        drinks.setOnClickListener(this);
        coffee.setOnClickListener(this);
        hotcoffee.setOnClickListener(this);
        browness.setOnClickListener(this);
        strawberrycake.setOnClickListener(this);
        yummyflavoured.setOnClickListener(this);
        vanilla.setOnClickListener(this);
        strawberryice.setOnClickListener(this);
        blueberry.setOnClickListener(this);
        chocolate.setOnClickListener(this);

        Toast.makeText(FoodActivity.this,"Login Successful", Toast.LENGTH_SHORT).show();
        foodToLoginActivityButton =(Button) findViewById(R.id.btn1);
        foodToLoginActivityButton.setOnClickListener(this);

        Toast.makeText(FoodActivity.this,"Enter Successfully", Toast.LENGTH_SHORT).show();
        foodToPriceActivityButton =(Button) findViewById(R.id.btn2);
        foodToPriceActivityButton.setOnClickListener(this);
    }
    public void onClick(View view){
        if(view.getId()==R.id.pizza) {
            pizza.setVisibility(View.GONE);
            burger.setVisibility(View.VISIBLE);
            frencefry.setVisibility(View.GONE);
            chickenfry.setVisibility(View.GONE);
            hotdog.setVisibility(View.GONE);
            drinks.setVisibility(View.GONE);
            coffee.setVisibility(View.GONE);
            hotcoffee.setVisibility(View.GONE);
            browness.setVisibility(View.GONE);
            strawberrycake.setVisibility(View.GONE);
            yummyflavoured.setVisibility(View.GONE);
            vanilla.setVisibility(View.GONE);
            strawberryice.setVisibility(View.GONE);
            blueberry.setVisibility(View.GONE);
            chocolate.setVisibility(View.GONE);
        }
        else if(view.getId()==R.id.burger)
        {
            pizza.setVisibility(View.GONE);
            burger.setVisibility(View.GONE);
            frencefry.setVisibility(View.VISIBLE);
            chickenfry.setVisibility(View.GONE);
            hotdog.setVisibility(View.GONE);
            drinks.setVisibility(View.GONE);
            coffee.setVisibility(View.GONE);
            hotcoffee.setVisibility(View.GONE);
            browness.setVisibility(View.GONE);
            strawberrycake.setVisibility(View.GONE);
            yummyflavoured.setVisibility(View.GONE);
            vanilla.setVisibility(View.GONE);
            strawberryice.setVisibility(View.GONE);
            blueberry.setVisibility(View.GONE);
            chocolate.setVisibility(View.GONE);
        }
        else if(view.getId()==R.id.frencefry)
        {
            pizza.setVisibility(View.GONE);
            burger.setVisibility(View.GONE);
            frencefry.setVisibility(View.GONE);
            chickenfry.setVisibility(View.VISIBLE);
            hotdog.setVisibility(View.GONE);
            drinks.setVisibility(View.GONE);
            coffee.setVisibility(View.GONE);
            hotcoffee.setVisibility(View.GONE);
            browness.setVisibility(View.GONE);
            strawberrycake.setVisibility(View.GONE);
            yummyflavoured.setVisibility(View.GONE);
            vanilla.setVisibility(View.GONE);
            strawberryice.setVisibility(View.GONE);
            blueberry.setVisibility(View.GONE);
            chocolate.setVisibility(View.GONE);
        }
        else if(view.getId()==R.id.chickenfry)
        {
            pizza.setVisibility(View.GONE);
            burger.setVisibility(View.GONE);
            frencefry.setVisibility(View.GONE);
            chickenfry.setVisibility(View.GONE);
            hotdog.setVisibility(View.VISIBLE);
            drinks.setVisibility(View.GONE);
            coffee.setVisibility(View.GONE);
            hotcoffee.setVisibility(View.GONE);
            browness.setVisibility(View.GONE);
            strawberrycake.setVisibility(View.GONE);
            yummyflavoured.setVisibility(View.GONE);
            vanilla.setVisibility(View.GONE);
            strawberryice.setVisibility(View.GONE);
            blueberry.setVisibility(View.GONE);
            chocolate.setVisibility(View.GONE);
        }
        else if(view.getId()==R.id.hotdog)
        {
            pizza.setVisibility(View.GONE);
            burger.setVisibility(View.GONE);
            frencefry.setVisibility(View.GONE);
            chickenfry.setVisibility(View.GONE);
            hotdog.setVisibility(View.GONE);
            drinks.setVisibility(View.VISIBLE);
            coffee.setVisibility(View.GONE);
            hotcoffee.setVisibility(View.GONE);
            browness.setVisibility(View.GONE);
            strawberrycake.setVisibility(View.GONE);
            yummyflavoured.setVisibility(View.GONE);
            vanilla.setVisibility(View.GONE);
            strawberryice.setVisibility(View.GONE);
            blueberry.setVisibility(View.GONE);
            chocolate.setVisibility(View.GONE);
        }
        else if(view.getId()==R.id.drinks)
        {
            pizza.setVisibility(View.GONE);
            burger.setVisibility(View.GONE);
            frencefry.setVisibility(View.GONE);
            chickenfry.setVisibility(View.GONE);
            hotdog.setVisibility(View.GONE);
            drinks.setVisibility(View.GONE);
            coffee.setVisibility(View.VISIBLE);
            hotcoffee.setVisibility(View.GONE);
            browness.setVisibility(View.GONE);
            strawberrycake.setVisibility(View.GONE);
            yummyflavoured.setVisibility(View.GONE);
            vanilla.setVisibility(View.GONE);
            strawberryice.setVisibility(View.GONE);
            blueberry.setVisibility(View.GONE);
            chocolate.setVisibility(View.GONE);
        }
        else if(view.getId()==R.id.coffee)
        {
            pizza.setVisibility(View.GONE);
            burger.setVisibility(View.GONE);
            frencefry.setVisibility(View.GONE);
            chickenfry.setVisibility(View.GONE);
            hotdog.setVisibility(View.GONE);
            drinks.setVisibility(View.GONE);
            coffee.setVisibility(View.GONE);
            hotcoffee.setVisibility(View.VISIBLE);
            browness.setVisibility(View.GONE);
            strawberrycake.setVisibility(View.GONE);
            yummyflavoured.setVisibility(View.GONE);
            vanilla.setVisibility(View.GONE);
            strawberryice.setVisibility(View.GONE);
            blueberry.setVisibility(View.GONE);
            chocolate.setVisibility(View.GONE);
        }
        else if(view.getId()==R.id.hotcoffee)
        {
            pizza.setVisibility(View.GONE);
            burger.setVisibility(View.GONE);
            frencefry.setVisibility(View.GONE);
            chickenfry.setVisibility(View.GONE);
            hotdog.setVisibility(View.GONE);
            drinks.setVisibility(View.GONE);
            coffee.setVisibility(View.GONE);
            hotcoffee.setVisibility(View.GONE);
            browness.setVisibility(View.VISIBLE);
            strawberrycake.setVisibility(View.GONE);
            yummyflavoured.setVisibility(View.GONE);
            vanilla.setVisibility(View.GONE);
            strawberryice.setVisibility(View.GONE);
            blueberry.setVisibility(View.GONE);
            chocolate.setVisibility(View.GONE);

        }
        else if(view.getId()==R.id.browness)
        {
            pizza.setVisibility(View.GONE);
            burger.setVisibility(View.GONE);
            frencefry.setVisibility(View.GONE);
            chickenfry.setVisibility(View.GONE);
            hotdog.setVisibility(View.GONE);
            drinks.setVisibility(View.GONE);
            coffee.setVisibility(View.GONE);
            hotcoffee.setVisibility(View.GONE);
            browness.setVisibility(View.GONE);
            strawberrycake.setVisibility(View.VISIBLE);
            yummyflavoured.setVisibility(View.GONE);
            vanilla.setVisibility(View.GONE);
            strawberryice.setVisibility(View.GONE);
            blueberry.setVisibility(View.GONE);
            chocolate.setVisibility(View.GONE);
        }
        else if(view.getId()==R.id.strawberrycake)
        {
            pizza.setVisibility(View.GONE);
            burger.setVisibility(View.GONE);
            frencefry.setVisibility(View.GONE);
            chickenfry.setVisibility(View.GONE);
            hotdog.setVisibility(View.GONE);
            drinks.setVisibility(View.GONE);
            coffee.setVisibility(View.GONE);
            hotcoffee.setVisibility(View.GONE);
            browness.setVisibility(View.GONE);
            strawberrycake.setVisibility(View.GONE);
            yummyflavoured.setVisibility(View.VISIBLE);
            vanilla.setVisibility(View.GONE);
            strawberryice.setVisibility(View.GONE);
            blueberry.setVisibility(View.GONE);
            chocolate.setVisibility(View.GONE);
        }
        else if(view.getId()==R.id.yummyflavoured)
        {
            pizza.setVisibility(View.GONE);
            burger.setVisibility(View.GONE);
            frencefry.setVisibility(View.GONE);
            chickenfry.setVisibility(View.GONE);
            hotdog.setVisibility(View.GONE);
            drinks.setVisibility(View.GONE);
            coffee.setVisibility(View.GONE);
            hotcoffee.setVisibility(View.GONE);
            browness.setVisibility(View.GONE);
            strawberrycake.setVisibility(View.GONE);
            yummyflavoured.setVisibility(View.GONE);
            vanilla.setVisibility(View.VISIBLE);
            strawberryice.setVisibility(View.GONE);
            blueberry.setVisibility(View.GONE);
            chocolate.setVisibility(View.GONE);
        }
        else if(view.getId()==R.id.vanilla)
        {
            pizza.setVisibility(View.GONE);
            burger.setVisibility(View.GONE);
            frencefry.setVisibility(View.GONE);
            chickenfry.setVisibility(View.GONE);
            hotdog.setVisibility(View.GONE);
            drinks.setVisibility(View.GONE);
            coffee.setVisibility(View.GONE);
            hotcoffee.setVisibility(View.GONE);
            browness.setVisibility(View.GONE);
            strawberrycake.setVisibility(View.GONE);
            yummyflavoured.setVisibility(View.GONE);
            vanilla.setVisibility(View.GONE);
            strawberryice.setVisibility(View.VISIBLE);
            blueberry.setVisibility(View.GONE);
            chocolate.setVisibility(View.GONE);
        }
        else if(view.getId()==R.id.strawberryice)
        {
            pizza.setVisibility(View.GONE);
            burger.setVisibility(View.GONE);
            frencefry.setVisibility(View.GONE);
            chickenfry.setVisibility(View.GONE);
            hotdog.setVisibility(View.GONE);
            drinks.setVisibility(View.GONE);
            coffee.setVisibility(View.GONE);
            hotcoffee.setVisibility(View.GONE);
            browness.setVisibility(View.GONE);
            strawberrycake.setVisibility(View.GONE);
            yummyflavoured.setVisibility(View.GONE);
            vanilla.setVisibility(View.GONE);
            strawberryice.setVisibility(View.GONE);
            blueberry.setVisibility(View.VISIBLE);
            chocolate.setVisibility(View.GONE);
        }
        else if(view.getId()==R.id.blueberry)
        {
            pizza.setVisibility(View.GONE);
            burger.setVisibility(View.GONE);
            frencefry.setVisibility(View.GONE);
            chickenfry.setVisibility(View.GONE);
            hotdog.setVisibility(View.GONE);
            drinks.setVisibility(View.GONE);
            coffee.setVisibility(View.GONE);
            hotcoffee.setVisibility(View.GONE);
            browness.setVisibility(View.GONE);
            strawberrycake.setVisibility(View.GONE);
            yummyflavoured.setVisibility(View.GONE);
            vanilla.setVisibility(View.GONE);
            strawberryice.setVisibility(View.GONE);
            blueberry.setVisibility(View.GONE);
            chocolate.setVisibility(View.VISIBLE);
        }
        else if(view.getId()==R.id.chocolate)
        {
            pizza.setVisibility(View.VISIBLE);
            burger.setVisibility(View.GONE);
            frencefry.setVisibility(View.GONE);
            chickenfry.setVisibility(View.GONE);
            hotdog.setVisibility(View.GONE);
            drinks.setVisibility(View.GONE);
            coffee.setVisibility(View.GONE);
            hotcoffee.setVisibility(View.GONE);
            browness.setVisibility(View.GONE);
            strawberrycake.setVisibility(View.GONE);
            yummyflavoured.setVisibility(View.GONE);
            vanilla.setVisibility(View.GONE);
            strawberryice.setVisibility(View.GONE);
            blueberry.setVisibility(View.GONE);
            chocolate.setVisibility(View.GONE);
        }
        // public void onClick(View v) {
        Intent logoutIntent = new Intent(FoodActivity.this, LoginActivity.class);
        startActivity(logoutIntent);

        Intent loginIntent = new Intent(FoodActivity.this, FoodPriceActivity.class);
        startActivity(loginIntent);
    }

}
