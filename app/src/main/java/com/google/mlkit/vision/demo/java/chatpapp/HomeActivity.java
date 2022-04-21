package com.google.mlkit.vision.demo.java.chatpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.mlkit.vision.demo.R;
import com.google.mlkit.vision.demo.java.LivePreviewActivity;
import com.google.mlkit.vision.demo.java.UserStatistics.UserStats;

public class HomeActivity extends AppCompatActivity {

    Button stat;
    Button live_act;
    Button prof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        stat = findViewById(R.id.user_stat);
        live_act = findViewById(R.id.live_preview);
        prof = findViewById(R.id.profile);
        String id = getIntent().getStringExtra("UserID");
        Log.i("User ID: ", id);
        stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //we are diverting to the Register page.
                Intent i3;
                i3 = new Intent(HomeActivity.this, UserStats.class);
                i3.putExtra("UserID", id);
                startActivity(i3);
            };
        });

        live_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //we are diverting to the Register page.
                Intent i4;
                i4 = new Intent(HomeActivity.this, LivePreviewActivity.class);
                i4.putExtra("UserID", id);
                startActivity(i4);
            };
        });
        prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //we are diverting to the Register page.
                Intent i2;
                i2 = new Intent(HomeActivity.this, UserProfile.class);
                i2.putExtra("UserID", id);
                startActivity(i2);
            };
        });
    }
}