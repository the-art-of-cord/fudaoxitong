package com.example.ma.zhishidian;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by maqia on 2018/5/13.
 */

public class DBService_gear {



//�������ݿ⣬�������ݿ��л�ȡ��������
        private  SQLiteDatabase db;
        //�ڹ��캯���д�ָ�����ݿ⣬������������ָ��db
        public DBService_gear(){
            db=SQLiteDatabase.openDatabase("/data/data/com.example.ma.question/databases/question.db" +
                    "",null,SQLiteDatabase.OPEN_READWRITE);
        }
    public  List<Gear> getwenzi(){
        List<Gear> list=new ArrayList<Gear>();
        Cursor cursor =db.rawQuery("select * from chilunzhishidian",null);
            cursor.moveToFirst();
            Gear gear=new Gear();
            gear. zhishidian=cursor.getString(cursor.getColumnIndex("wenzi"));
             list.add(gear);
        return list;
        }




}
