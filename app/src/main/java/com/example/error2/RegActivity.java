
//
//        Button reg_Button = (Button) findViewById(R.id.register_btn);
//
//
//        reg_Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent LoginIntent = new Intent(RegActivity.this, HomeActivity.class);
//                startActivity(LoginIntent);
//            }
//        });
//    }
//
//
//}

package com.example.error2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegActivity extends AppCompatActivity {


    private Button registerBtn;
    private EditText usernameInput,phoneInput,passwordInput;
    private DBHandler db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);





        registerBtn = (Button) findViewById(R.id.register_btn);
        usernameInput = (EditText) findViewById(R.id.register_username_input);
        phoneInput = (EditText) findViewById(R.id.register_phone_input);
        passwordInput = (EditText) findViewById(R.id.register_password_input);

        db = new DBHandler(RegActivity.this);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = usernameInput.getText().toString();
                String phone = phoneInput.getText().toString();
                String password = passwordInput.getText().toString();

                if (name.isEmpty() && phone.isEmpty() &&  password.isEmpty()) {
                    Toast.makeText(RegActivity.this, "Вы ввели не все данные", Toast.LENGTH_SHORT).show();
                    return;
                }

                db.addNewUser(name, phone, password);

                // after adding the data we are displaying a toast message.
                Toast.makeText(RegActivity.this, "Пользователь успешно добавлен!", Toast.LENGTH_SHORT).show();
                usernameInput.setText("");
                phoneInput.setText("");
                passwordInput.setText("");
            }
        });
    }
}