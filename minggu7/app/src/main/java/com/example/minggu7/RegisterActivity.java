package com.example.minggu7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    EditText username, pass, pass2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.et_emailSignUp);
        pass = findViewById(R.id.et_passwordSignUp);
        pass2 = findViewById(R.id.et_passwordSignUp2);
        btn = findViewById(R.id.button_signupSignUp);
        btn.setOnClickListener(v -> {
            if (pass.getText().toString().equals(pass2.getText().toString())) {
                Preferences.setRegisteredUser(getBaseContext(), username.getText().toString());
                Preferences.setRegisteredPass(getBaseContext(), pass.getText().toString());
                Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}