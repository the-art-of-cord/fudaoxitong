package com.example.ma.fudaoxitong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Listview_mulu extends AppCompatActivity {

    private String[] data = {"第一章 绪论","第二章 机构的结构分析","第三章 平面机构的运动分析",
            "第四章 平面机构的例分析","第五章 机械的效率和自锁","第六章 机械的平衡",
            "第七章 机械的运转及其速度波动的调节","第八章 连杆机构及其设计","第九章 凸轮机构及其设计",
            "第十章 齿轮机构及其设计","第十一章 齿轮系及其设计","第十二章 其他常用机构",
            "第十三章 机器人机构及其设计" ,"第十四章 机械系统的设计方案"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_mulu);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
            Listview_mulu.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);



    }
}
