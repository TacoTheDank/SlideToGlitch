package com.smv.slidetoglitch;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.smv.slidetoglitch.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySplashBinding binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int delayDuration = 1500;
        new Handler().postDelayed(() -> {
            startActivity(HomeActivity.getIntent(SplashActivity.this));
            finish();
        }, delayDuration);
    }

}
