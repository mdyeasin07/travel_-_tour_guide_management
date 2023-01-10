package com.example.travel__tourism_management_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lalbagh extends AppCompatActivity {

    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lalbagh);
        b1 = findViewById(R.id.about_p);
        b2 = findViewById(R.id.hotel);
        b3 = findViewById(R.id.transport);
        b4 = findViewById(R.id.about_us);
        b5 = findViewById(R.id.back1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ap = new Intent(lalbagh.this, lal_about.class);
                startActivity(ap);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotel = new Intent(lalbagh.this, lal_hotel.class);
                startActivity(hotel);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trans = new Intent(lalbagh.this, lal_transport.class);
                startActivity(trans);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent au = new Intent(lalbagh.this, about_us.class);
                startActivity(au);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back1 = new Intent(lalbagh.this, dk_places.class);
                startActivity(back1);
                finish();
            }
        });

    }
}