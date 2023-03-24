package com.example.error2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegActivity extends AppCompatActivity {


    private Button registerBtn;
    private EditText usernameInput,phoneInput,passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);




        registerBtn = (Button) findViewById(R.id.register_btn);
        usernameInput = (EditText) findViewById(R.id.register_username_input);
        phoneInput = (EditText) findViewById(R.id.register_phone_input);
        passwordInput = (EditText) findViewById(R.id.register_password_input);


        Button loginButton = (Button) findViewById(R.id.loginbutton);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent = new Intent(RegActivity.this, LogActivity.class);
                startActivity(LoginIntent);
            }
        });


        Button reg_Button = (Button) findViewById(R.id.register_btn);


        reg_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent = new Intent(RegActivity.this, HomeActivity.class);
                startActivity(LoginIntent);
            }
        });
    }


}