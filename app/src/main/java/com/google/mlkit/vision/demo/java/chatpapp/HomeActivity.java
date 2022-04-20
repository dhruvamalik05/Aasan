package com.google.mlkit.vision.demo.java.chatpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.mlkit.vision.demo.R;
import com.google.mlkit.vision.demo.java.LivePreviewActivity;
import com.google.mlkit.vision.demo.java.UserStatistics.UserStats;

public class HomeActivity extends AppCompatActivity {

    Button stat;
    Button live_act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        stat = findViewById(R.id.user_stat);
        live_act = findViewById(R.id.live_preview);

        stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //we are diverting to the Register page.
                startActivity(new Intent(HomeActivity.this, UserStats.class));
            };
        });

        live_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //we are diverting to the Register page.
                startActivity(new Intent(HomeActivity.this, LivePreviewActivity.class));
            };
        });
    }
}