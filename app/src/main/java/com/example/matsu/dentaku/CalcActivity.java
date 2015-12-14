package com.example.matsu.dentaku;

import android.app.*;
import android.content.SharedPreferences;
import android.os.*;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.widget.*;

public class CalcActivity extends Activity  {

    int temp;
    int mark;
    int sum;
    SharedPreferences sp;
    TextView textView;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //タイトルバーを非表示(必ずsetContentViewの前に設置)
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //レイアウトをセットする
        setContentView(R.layout.activity_calc);

        text = (TextView)findViewById(R.id.textView);
        text.setText("00000000");

        //追加
        textView = (TextView)findViewById(R.id.text);
        sp = PreferenceManager.getDefaultSharedPreferences(this);
        textView.setText(sp.getString("SaveString", null), TextView.BufferType.NORMAL);

    }

    //０のとき
    public  void bt0(View v){
        temp *= 10;
        text.setText(Integer.toString(temp));
    }

    //１のとき
    public  void bt1(View v){
        temp = 1 + temp * 10;
        text.setText(Integer.toString(temp));
    }

    //２のとき
    public  void bt2(View v){
        temp = 2 + temp * 10;
        text.setText(Integer.toString(temp));
    }

    //３のとき
    public  void bt3(View v){
        temp = 3 + temp * 10;
        text.setText(Integer.toString(temp));
    }

    //４のとき
    public  void bt4(View v){
        temp = 4 + temp * 10;
        text.setText(Integer.toString(temp));
    }

    //５のとき
    public  void bt5(View v){
        temp = 5 + temp * 10;
        text.setText(Integer.toString(temp));
    }

    //６のとき
    public  void bt6(View v){
        temp = 6 + temp * 10;
        text.setText(Integer.toString(temp));
    }

    //７のとき
    public  void bt7(View v){
        temp = 7 + temp * 10;
        text.setText(Integer.toString(temp));
    }

    //８のとき
    public  void bt8(View v){
        temp = 8 + temp * 10;
        text.setText(Integer.toString(temp));
    }

    //９のとき
    public  void bt9(View v){
        temp = 9 + temp * 10;
        text.setText(Integer.toString(temp));
    }

    public  void add(View v){          //”＋”を押したとき
        sum = temp;
        temp *= 0;
        mark = 1;
        text.setText(Integer.toString(temp));
    }

    public  void sub(View v){          //”ー”を押したとき
        sum = temp;
        temp *= 0;
        mark = 2;
        text.setText(Integer.toString(temp));
    }

    public  void multi(View v){        //”×”を押したとき
        sum = temp;
        temp *= 0;
        mark = 3;
        text.setText(Integer.toString(temp));
    }

    public  void div(View v){          //”÷”を押したとき
        sum = temp;
        temp *= 0;
        mark = 4;
        text.setText(Integer.toString(temp));
    }

    public  void clear(View v){        //Clearを押したとき
        temp *= 0;
        text.setText(Integer.toString(temp));
    }

    public  void equal(View v){        //"＝"を押したとき
        if(mark==1){
            temp += sum;
        }
        else if(mark==2){
            temp = sum - temp;
        }
        else if(mark==3){
            temp *= sum;
        }
        else if(mark==4){
            temp = sum / temp;
        }
        //結果をテキストに表示
        text.setText(String.valueOf(temp));


        //Preferenceのテスト
        textView.setText(String.valueOf(temp));
        sp = PreferenceManager.getDefaultSharedPreferences(this);
        sp.edit().putString("SaveString",String.valueOf(temp) ).commit();

    }


}