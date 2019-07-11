package com.example.digitalhousefoods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    private Button registerButton;
    private Button facebookLoginButton;
    private Button loginButton;
    private TextInputEditText emailEditText;
    private TextInputEditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEditText = findViewById(R.id.login_email_edit_text);
        passwordEditText = findViewById(R.id.login_password_edit_text);

        registerButton = findViewById(R.id.login_register_button);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irParaRegistrar();
            }
        });

        facebookLoginButton = findViewById(R.id.login_facebook_button);
        facebookLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irParaHome();
            }
        });

        loginButton = findViewById(R.id.login_login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginClicado();
            }
        });
    }

    public void loginClicado(){

        emailEditText.setError(null);
        passwordEditText.setError(null);

        if (passwordEditText.getEditableText().toString().equals("")){
            passwordEditText.setError("Digite uma senha");
        } else if (emailEditText.getEditableText().toString().equals("")){
            emailEditText.setError("Digite um email");
        } else {
            irParaHome();
        }



    }

    public void irParaRegistrar(){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void irParaHome(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}