package com.example.routecourses;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
     startCourcesActivity();
        }
    }, 2000);
    }


private void startCourcesActivity(){
    Intent intent = new Intent(this,CourcesActivity.class);
    startActivity(intent);
    finish();
}
}