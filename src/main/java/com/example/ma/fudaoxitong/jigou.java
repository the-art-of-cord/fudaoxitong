package com.example.ma.fudaoxitong;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class jigou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jigou);
        ActionBar actionbar = getSupportActionBar();
        if(actionbar!=null){
            actionbar.hide();
        }
    }
}
