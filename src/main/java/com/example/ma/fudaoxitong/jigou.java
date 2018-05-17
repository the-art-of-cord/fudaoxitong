package com.example.ma.fudaoxitong;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jigou extends AppCompatActivity {
    private Button chilun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jigou);
        ActionBar actionbar = getSupportActionBar();

        if(actionbar!=null){
            actionbar.hide();
        }
        chilun = (Button) findViewById(R.id.chilunjigou);
        chilun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(jigou.this,Three_function.class);
                startActivity(intent);
            }
        });



    }
}
