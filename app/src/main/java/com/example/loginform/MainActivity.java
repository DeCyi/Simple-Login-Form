package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        MaterialButton Login = (MaterialButton) findViewById(R.id.Login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("Jotaro") && password.getText().toString().equals("Kujo")) {
                    Toast.makeText(MainActivity.this, "ACCESS GRANTED!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "ACCESS DENIED!", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}