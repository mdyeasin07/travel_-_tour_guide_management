package com.example.travel__tourism_management_system;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sign_in extends AppCompatActivity {

    EditText u2, p2;
    Button log, signup;

    DBHelper DB;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        u2 = findViewById(R.id.username);
        p2 = findViewById(R.id.password);

        log = findViewById(R.id.loginbtn);
        signup = findViewById(R.id.backsignup);

        DB = new DBHelper(this);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = u2.getText().toString();
                String pass = p2.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(sign_in.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                    if(checkuserpass==true){
                        Toast.makeText(sign_in.this, "Sign in successfull", Toast.LENGTH_SHORT).show();
                        Intent intent1  = new Intent(getApplicationContext(), districts.class);
                        startActivity(intent1);
                    }else{
                        Toast.makeText(sign_in.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUp = new Intent(sign_in.this, sign_up.class);
                startActivity(signUp);
                finish();
            }
        });


        }
    }

