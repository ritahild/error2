package com.example.error2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.error2.R.id.login_btn;

public class LogActivity extends AppCompatActivity {
    private Button loginButton;
    private EditText loginphoneImput,loginPasswordImput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        loginButton = (Button) findViewById(login_btn);
        loginphoneImput = (EditText) findViewById(R.id.login_phone_input);
        loginPasswordImput =(EditText) findViewById((R.id.login_password_input));


        Button log_Button = (Button) findViewById(R.id.login_btn);


        log_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent = new Intent(LogActivity.this, HomeActivity.class);
                startActivity(LoginIntent);
            }
        });


        Button regButton = (Button) findViewById(R.id.joinbutton);


        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent = new Intent(LogActivity.this, RegActivity.class);
                startActivity(LoginIntent);
            }
        });

    }


}