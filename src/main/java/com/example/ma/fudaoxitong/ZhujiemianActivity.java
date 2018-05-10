package com.example.ma.fudaoxitong;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ZhujiemianActivity extends AppCompatActivity {
private Button jigou;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhujiemian_layout);

        ActionBar actionbar = getSupportActionBar();
        if(actionbar!=null){
            actionbar.hide();
        }

        jigou=(Button) findViewById(R.id.jigou);
        jigou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZhujiemianActivity.this,jigou.class);
                startActivity(intent);
            }
        });





    }


}
