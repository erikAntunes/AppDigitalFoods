package com.example.digitalhousefoods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {

    private Button confirmRegisterButton;
    private TextInputEditText nameEditText;
    private TextInputEditText emailEditText;
    private TextInputEditText passwordEditText;
    private TextInputEditText repeatPasswordEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Register");

        nameEditText = findViewById(R.id.register_name_edit_text);
        emailEditText = findViewById(R.id.register_email_edit_text);
        passwordEditText = findViewById(R.id.register_password_edit_text);
        repeatPasswordEditText = findViewById(R.id.register_repeat_edit_text);

        confirmRegisterButton = findViewById(R.id.register_register_button);
        confirmRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerClicado(view);
            }
        });
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(this, LoginActivity.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;
    }

    public void registerClicado (View view){

        passwordEditText.setError(null);
        repeatPasswordEditText.setError(null);
        emailEditText.setError(null);

        if(!passwordEditText.getEditableText().toString().equals(repeatPasswordEditText.getEditableText().toString())) {
            passwordEditText.setError("As senhas não conferem");
            repeatPasswordEditText.setError("As senhas não conferem");
        }else if(passwordEditText.getEditableText().toString().equals("")){
            passwordEditText.setError("Campo obrigatório");
        } else if (emailEditText.getEditableText().toString().equals("")){
            emailEditText.setError("Campo obrigatório");
        } else if (nameEditText.getEditableText().toString().equals("")){
            nameEditText.setError("Campo obrigatório");
        } else {

            Snackbar.make(view, "Registration successful", Snackbar.LENGTH_INDEFINITE).setAction("OK", new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    registroCompleto();
                }
            }).setActionTextColor(getResources().getColor(R.color.colorAccent)).show();
        }


    }

    public void registroCompleto (){
        Intent intent = new Intent(this, HomeActivity.class);

        Bundle bundleToProfile = new Bundle();
        bundleToProfile.putString("NAME", nameEditText.getEditableText().toString());
        bundleToProfile.putString("EMAIL", emailEditText.getEditableText().toString());
        bundleToProfile.putString("PASSWORD", passwordEditText.getEditableText().toString());
        bundleToProfile.putString("REPEATPASSWORD", repeatPasswordEditText.getEditableText().toString());

        intent.putExtras(bundleToProfile);
        startActivity(intent);
    }
}
