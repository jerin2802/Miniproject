package com.example.libraryproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SubmitActivity extends AppCompatActivity implements View.OnClickListener {

    Button submitTOMainButton;
    TextView user,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        Toast.makeText(SubmitActivity.this,"Login Successful", Toast.LENGTH_SHORT).show();
        submitTOMainButton = (Button) findViewById(R.id.btn1);
        submitTOMainButton.setOnClickListener(this);

        user=(TextView) findViewById(R.id.pass);
        email=(TextView) findViewById(R.id.email);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null)
        {
            String Email =bundle.getString("EMAIL");
            String pass =bundle.getString("USER");

            user.setText(pass);
            email.setText(Email);
        }
    }
    public void onClick(View view) {
        Intent submitIntent = new Intent(SubmitActivity.this, LoginActivity.class);
        startActivity(submitIntent);
    }
}
