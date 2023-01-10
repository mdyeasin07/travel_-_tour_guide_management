package com.example.travel__tourism_management_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ahsanmonjil extends AppCompatActivity {
    Button b1, b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahsanmonjil);

        b1 = findViewById(R.id.about_p1);
        b2 = findViewById(R.id.hotel1);
        b3 = findViewById(R.id.transport1);
        b4 = findViewById(R.id.about_us1);
        b5 = findViewById(R.id.back7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B1 = new Intent(ahsanmonjil.this, monjil_about.class);
                startActivity(B1);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B2 = new Intent(ahsanmonjil.this, monjil_hotel.class);
                startActivity(B2);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B3 = new Intent(ahsanmonjil.this, monjil_transport.class);
                startActivity(B3);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B4 = new Intent(ahsanmonjil.this, monjil_about_us.class);
                startActivity(B4);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back7 = new Intent(ahsanmonjil.this, dk_places.class);
                startActivity(back7);
                finish();
            }
        });
    }
}