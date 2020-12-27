package com.smv.slidetoglitch;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int delayDuration = 1500;
        new Handler().postDelayed(() -> {
            startActivity(HomeActivity.getIntent(SplashActivity.this));
            finish();
        }, delayDuration);
    }

}
