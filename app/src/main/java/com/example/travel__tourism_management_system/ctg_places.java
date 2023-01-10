package com.example.travel__tourism_management_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ctg_places extends AppCompatActivity {

    Button b1, b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctg_places);

        b1 = findViewById(R.id.coxbazar);
        b2 = findViewById(R.id.guliakhali);
        b3 = findViewById(R.id.back18);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B1 = new Intent(ctg_places.this, coxsbazar.class);
                startActivity(B1);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B2 = new Intent(ctg_places.this, guliakhali.class);
                startActivity(B2);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B3 = new Intent(ctg_places.this, districts.class);
                startActivity(B3);
                finish();
            }
        });

    }
}