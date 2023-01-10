package com.example.travel__tourism_management_system;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sign_up extends AppCompatActivity {

    EditText u1, p1, rep1;
    Button reg, bsignin;
    DBHelper DB;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        u1 = findViewById(R.id.user1);
        p1 = findViewById(R.id.pass1);
        rep1 = findViewById(R.id.repass1);

        reg = findViewById(R.id.register);
        bsignin = findViewById(R.id.backsignin);

        DB = new DBHelper(this);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = u1.getText().toString();
                String pas = p1.getText().toString();
                String repass = rep1.getText().toString();

                if(user.equals("")|| pas.equals("")||repass.equals(""))
                    Toast.makeText(sign_up.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    if(pas.equals(repass)){
                        Boolean checkuser = DB.checkusername(user);
                        if(checkuser==false){
                            Boolean insert = DB.insertData(user, pas);
                            if(insert==true){
                                Toast.makeText(sign_up.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                                Intent intent2 = new Intent(getApplicationContext(),sign_up.class);
                                startActivity(intent2);
                            }else{
                                Toast.makeText(sign_up.this, "Registration failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(sign_up.this, "User already exists! please sign in", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(sign_up.this, "Passwords not matching", Toast.LENGTH_SHORT).show();
                    }
                } }
        });
        bsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplicationContext(), sign_in.class);
                startActivity(intent3);
            }
        });
    }
}




