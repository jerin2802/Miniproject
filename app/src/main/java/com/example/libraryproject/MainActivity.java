package com.example.libraryproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView1;
    EditText editEmail;
    Button mainToSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.textView1);

       // editPass = (EditText) findViewById(R.id.editpass);

        Toast.makeText(MainActivity.this,"Login Successful", Toast.LENGTH_SHORT).show();
        mainToSubmitButton = (Button) findViewById(R.id.btn1);
        editEmail = (EditText) findViewById(R.id.editemail);
        mainToSubmitButton.setOnClickListener(this);
    }

    public void onClick(View view) {

        String Email = editEmail.getText().toString();
        Intent loginIntent = new Intent(MainActivity.this, SubmitActivity.class);

        loginIntent.putExtra("EMAIL", Email);
        loginIntent.putExtra("USER", "JENIFER");

        startActivity(loginIntent);
    }
}
