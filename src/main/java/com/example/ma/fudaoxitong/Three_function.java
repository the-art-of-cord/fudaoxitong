package com.example.ma.fudaoxitong;


import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ma.dongtu.GearActivity;
import com.example.ma.questions.*;
import com.example.ma.zhishidian.GearKnowledge;

public class Three_function extends AppCompatActivity {
    private Button question_1;
    private Button zhishidian;
    private Button Geardongtu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_function);

        ActionBar actionbar = getSupportActionBar();
        if(actionbar!=null){
            actionbar.hide();
        }

        question_1 = (Button)findViewById(R.id.questions);
        question_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Three_function.this,ExamActivity.class);
                startActivity(intent);
            }
        });

        zhishidian=(Button)findViewById(R.id.zhishidian);
        zhishidian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Three_function.this, GearKnowledge.class);
                startActivity(intent);
            }
        });

        Geardongtu=(Button)findViewById(R.id.dongtu);
        Geardongtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Three_function.this,GearActivity.class);
                startActivity(intent);
            }
        });


    }
}
