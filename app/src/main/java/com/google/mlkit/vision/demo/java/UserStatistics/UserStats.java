package com.google.mlkit.vision.demo.java.UserStatistics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.mlkit.vision.demo.R;
import com.google.mlkit.vision.demo.java.PostureSparkAdapter.PostureSparkAdapter;
import com.robinhood.spark.SparkView;

public class UserStats extends AppCompatActivity {
    SparkView sparkView;
    TextView s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_stats);
        sparkView = findViewById(R.id.spark1);
        s1 = findViewById(R.id.s1);

        sparkView.setScrubListener(new SparkView.OnScrubListener() {
            @Override
            public void onScrubbed(Object value) {
                // s1.setText(getString(R.string.scrub_format, value));
//                Log.i("Is this x?", value);
                s1.setText(value.toString());
            }
        });

        int[] bad_pos_count = {2,6,8,5,3,6,7};
        String[] x_vals = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        updateDisplayWithData(bad_pos_count, x_vals);

    }

    private void updateDisplayWithData(int[] bad_pos_count, String[] x_vals) {
        PostureSparkAdapter adapter = new PostureSparkAdapter(bad_pos_count, x_vals);
        sparkView.setAdapter(adapter);
    }
//canges maddde

}