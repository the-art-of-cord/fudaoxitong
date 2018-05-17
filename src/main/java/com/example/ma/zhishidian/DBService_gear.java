package com.example.ma.zhishidian;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by maqia on 2018/5/13.
 */

public class DBService_gear {



//连接数据库，并从数据库中获取所需数据
        private  SQLiteDatabase db;
        //在构造函数中打开指定数据库，并把它的引用指向db
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
