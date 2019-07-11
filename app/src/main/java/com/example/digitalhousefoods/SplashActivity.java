package com.example.digitalhousefoods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

import de.hdodenhof.circleimageview.CircleImageView;

public class SplashActivity extends AppCompatActivity {

    private CircleImageView circleImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        circleImageView = findViewById(R.id.circle_splash_id);

        circleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irParaLogin();
            }
        });

        getSupportActionBar().hide();

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                irParaLogin();
            }
        }, 3000);
    }

    private void irParaLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }


}
