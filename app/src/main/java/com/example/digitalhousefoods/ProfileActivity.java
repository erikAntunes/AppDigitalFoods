package com.example.digitalhousefoods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class ProfileActivity extends AppCompatActivity {

    private TextInputEditText nomeEditText;
    private TextInputEditText emailEditText;
    private TextInputEditText passwordEditText;
    private TextInputEditText repeatpasswordEditText;
    private Button creditCardsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

//        nomeEditText = findViewById(R.id.profile_nome_edit_text);
//        emailEditText = findViewById(R.id.profile_email_edit_text);
//        passwordEditText = findViewById(R.id.profile_password_edit_text);
//        repeatpasswordEditText = findViewById(R.id.profile_repeat_password_edit_text);
//
//        Intent intent = getIntent();
//
//        Bundle bundle = intent.getExtras();
//
//        String name = bundle.getString("NAME");
//        String email = bundle.getString("EMAIL");
//        String password = bundle.getString("PASSWORD");
//        String repeatPassword = bundle.getString("REPEATPASSWORD");
//
//        nomeEditText.setText(name);
//        emailEditText.setText(email);
//        passwordEditText.setText(password);
//        repeatpasswordEditText.setText(repeatPassword);

        creditCardsButton = findViewById(R.id.profile_credit_cards_button);
        creditCardsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irParaCreditCards(view);
            }
        });
    }

    public void irParaCreditCards (View view){
        Intent intent = new Intent(this, CreditCardsActivity.class);
        startActivity(intent);
    }
}
