package com.example.ma.dongtu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ma.fudaoxitong.R;

import pl.droidsonroids.gif.GifImageView;

public class GearActivity extends AppCompatActivity {
    private GifImageView Gear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gear);
     Gear =(GifImageView)findViewById(R.id.activity_gif_giv);

    }
}
