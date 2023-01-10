package com.example.travel__tourism_management_system;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class districts extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8, b9;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_districts);

        b1 = findViewById(R.id.dk);
        b2 = findViewById(R.id.ctg);
        b3 = findViewById(R.id.meg);
        b4 = findViewById(R.id.bari);
        b5 = findViewById(R.id.syl);
//        b6 = findViewById(R.id.raj);
//        b7 = findViewById(R.id.ran);
//        b8 = findViewById(R.id.khul);
        b9 = findViewById(R.id.exit);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dhaka = new Intent(districts.this, dk_places.class);
                startActivity(dhaka);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chittagong = new Intent(districts.this, ctg_places.class);
                startActivity(chittagong);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent meghna = new Intent(districts.this, meg_places.class);
                startActivity(meghna);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent barisal = new Intent(districts.this, bari_places.class);
                startActivity(barisal);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sylhet = new Intent(districts.this, syl_places.class);
                startActivity(sylhet);
                finish();
            }
        });
      /* b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rajshahi = new Intent(districts.this, raj_places.class);
                startActivity(rajshahi);
                finish();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rangpur = new Intent(districts.this, rang_places.class);
                startActivity(rangpur);
                finish();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent khulna = new Intent(districts.this, khul_places.class);
                startActivity(khulna);
                finish();
            }
        });*/
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

    }
}