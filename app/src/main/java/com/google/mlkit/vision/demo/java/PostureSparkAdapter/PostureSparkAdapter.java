package com.google.mlkit.vision.demo.java.PostureSparkAdapter;

import com.robinhood.spark.SparkAdapter;

public class PostureSparkAdapter extends SparkAdapter {

    int[] bad_pos_count;
    String[] x_vals;
    public PostureSparkAdapter(int[] bad_pos_count, String[] x_vals) {
        this.bad_pos_count = bad_pos_count;
        this.x_vals = x_vals;
    }

    @Override
    public int getCount() {
        return bad_pos_count.length;
    }

//    @Override
//    public Object getItem(int index) {
//        return bad_pos_count[index];
//    }

    @Override
    public float getY(int index) {
        return (float) (bad_pos_count[index]);
    }
    @Override
    public Object getItem(int index) {
        return "" + x_vals[index] + ": " + bad_pos_count[index];
    }
}
