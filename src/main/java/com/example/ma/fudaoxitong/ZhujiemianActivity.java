package com.example.ma.fudaoxitong;


import android.content.Intent;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


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


        String DB_PATH = "/data/data/com.example.ma.fudaoxitong/databases/";
        String DB_NAME = "question.db";
        //应用启动时，判断数据库是否存在，不存在则将提前打包好的数据库文件复制到数据库目录下
        //数据库目录不存在时，创建数据库目录
        if ((new File(DB_PATH + DB_NAME).exists()) == false) {
            File dir = new File(DB_PATH);
            if (!dir.exists()) {
                dir.mkdir();
            }
        }
//定义输入输出流，用于复制文件
        try {
            InputStream is = getBaseContext().getAssets().open(DB_NAME);
            OutputStream os = new FileOutputStream(DB_PATH + DB_NAME);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            //刷新输出流，关闭输入输出流
            os.flush();
            os.close();
            is.close();


        } catch (IOException e) {
            e.printStackTrace();
        }




    }


}
