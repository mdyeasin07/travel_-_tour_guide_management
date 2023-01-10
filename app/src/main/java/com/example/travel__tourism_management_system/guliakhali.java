package com.example.travel__tourism_management_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class guliakhali extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guliakhali);

        b1 = findViewById(R.id.about_p5);
        b2 = findViewById(R.id.hotel5);
        b3 = findViewById(R.id.transport5);
        b4 = findViewById(R.id.about_us5);
        b5 = findViewById(R.id.back24);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ap = new Intent(guliakhali.this, guliakhali_about.class);
                startActivity(ap);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotel = new Intent(guliakhali.this, guliakhali_hotel.class);
                startActivity(hotel);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trans = new Intent(guliakhali.this, guliakhali_transport.class);
                startActivity(trans);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent au = new Intent(guliakhali.this, guliakhali_about_us.class);
                startActivity(au);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back1 = new Intent(guliakhali.this, ctg_places.class);
                startActivity(back1);
                finish();
            }
        });

    }
}