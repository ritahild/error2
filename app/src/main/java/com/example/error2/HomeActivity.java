package com.example.error2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.error2.R.id.joinbutton;
import static com.example.error2.R.id.loginbutton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


//        Button loginButton = (Button) findViewById(loginbutton);
//
//
//        loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent LoginIntent = new Intent(HomeActivity.this, LogActivity.class);
//                startActivity(LoginIntent);
//            }
//        });

        Button joinButton = (Button) findViewById(joinbutton);


        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(HomeActivity.this, RegActivity.class);
                startActivity(registerIntent);
            }
        });
    }
}