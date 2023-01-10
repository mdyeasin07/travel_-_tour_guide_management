package com.example.travel__tourism_management_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dk_places extends AppCompatActivity {

    Button b1, b2,b3,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dk_places);

        b1 = findViewById(R.id.lalbagh);
        b2 = findViewById(R.id.ahsan);
        b3 = findViewById(R.id.museum);
        b5 = findViewById(R.id.back);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lalbagh = new Intent(dk_places.this, lalbagh.class);
                startActivity(lalbagh);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ahsan = new Intent(dk_places.this, ahsanmonjil.class);
                startActivity(ahsan);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musuem = new Intent(dk_places.this, mueum.class);
                startActivity(musuem);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(dk_places.this, districts.class);
                startActivity(back);
                finish();
            }
        });

    }
}