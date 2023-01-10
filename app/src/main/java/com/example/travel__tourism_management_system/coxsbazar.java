package com.example.travel__tourism_management_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class coxsbazar extends AppCompatActivity {

    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coxsbazar);

        b1 = findViewById(R.id.about_p4);
        b2 = findViewById(R.id.hotel4);
        b3 = findViewById(R.id.transport4);
        b4 = findViewById(R.id.about_us4);
        b5 = findViewById(R.id.back19);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B1 = new Intent(coxsbazar.this, coxsbazar_about.class);
                startActivity(B1);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B2 = new Intent(coxsbazar.this, coxsbazar_hotel.class);
                startActivity(B2);
                finish();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B3 = new Intent(coxsbazar.this, coxsbazar_transport.class);
                startActivity(B3);
                finish();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B4 = new Intent(coxsbazar.this, coxsbazar_about_us.class);
                startActivity(B4);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B5 = new Intent(coxsbazar.this, ctg_places.class);
                startActivity(B5);
                finish();
            }
        });
    }
}