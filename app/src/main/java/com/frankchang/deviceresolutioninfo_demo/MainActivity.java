package com.frankchang.deviceresolutioninfo_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView tvShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShow = findViewById(R.id.tvShow);
    }

    public void getInfoOnClick(View view) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        int dpi = displayMetrics.densityDpi;

        String info = "Height : " + height + "\nWidth : " + width + "\nDPI : " + dpi;
        tvShow.setText(info);
    }

}
