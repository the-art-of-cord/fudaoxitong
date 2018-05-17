package com.example.ma.zhishidian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ma.fudaoxitong.R;
import com.example.ma.questions.DBService;

import java.util.List;

public class GearKnowledge extends AppCompatActivity {
private TextView xianshi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gear_knowledge);
        xianshi=(TextView)findViewById(R.id.wenzizhishidian) ;
        DBService_gear dbService = new DBService_gear();
        final List<Gear> list =  dbService.getwenzi();

        Gear gear=list.get(0);
        xianshi.setText(gear.zhishidian);
    }
}
