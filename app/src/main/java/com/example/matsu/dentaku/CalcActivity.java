package com.example.matsu.dentaku;

import android.app.*;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.*;
import android.view.View;
import android.view.Window;
import android.widget.*;

public class CalcActivity extends Activity  {

    int temp;
    int mark;
    int sum;
    String mList[];
    ListView listView;
    TextView text;
    SharedPreferences data;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //タイトルバーを非表示(必ずsetContentViewの前に設置)
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //レイアウトをセットする
        setContentView(R.layout.activity_calc);
        data = getSharedPreferences("DataSave", Context.MODE_PRIVATE);

        //配列の初期化
        mList = new String[10];

        //textのセット
        text = (TextView)findViewById(R.id.textView);
        text.setText("00000000");

        listView = (ListView)findViewById(R.id.listView);

        editor = data.edit();
        for(int i= 9;i>0;i--){
            editor.putString(String.valueOf(mList[i]),mList[i]);
        }
        mList[0] = Integer.toString(temp);
        editor.putInt("Stage[0]", 0);
        editor.apply();

        //Adapterにセット
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mList);
        listView.setAdapter(adapter);

    }

    public  void bt0(View v){
        temp *= 10;
        text.setText(Integer.toString(temp));
    }
    public  void bt1(View v){
        temp = 1 + temp * 10;
        text.setText(Integer.toString(temp));
    }
    public  void bt2(View v){
        temp = 2 + temp * 10;
        text.setText(Integer.toString(temp));
    }
    public  void bt3(View v){
        temp = 3 + temp * 10;
        text.setText(Integer.toString(temp));
    }
    public  void bt4(View v){
        temp = 4 + temp * 10;
        text.setText(Integer.toString(temp));
    }
    public  void bt5(View v){
        temp = 5 + temp * 10;
        text.setText(Integer.toString(temp));
    }
    public  void bt6(View v){
        temp = 6 + temp * 10;
        text.setText(Integer.toString(temp));
    }
    public  void bt7(View v){
        temp = 7 + temp * 10;
        text.setText(Integer.toString(temp));
    }
    public  void bt8(View v){
        temp = 8 + temp * 10;
        text.setText(Integer.toString(temp));
    }
    public  void bt9(View v){
        temp = 9 + temp * 10;
        text.setText(Integer.toString(temp));
    }
    public  void bt01(View v){
        sum = temp;
        temp *= 0;
        mark = 1;
        text.setText(Integer.toString(temp));
    }
    public  void bt02(View v){
        sum = temp;
        temp *= 0;
        mark = 2;
        text.setText(Integer.toString(temp));
    }
    public  void bt03(View v){
        sum = temp;
        temp *= 0;
        mark = 3;
        text.setText(Integer.toString(temp));
    }
    public  void bt04(View v){
        sum = temp;
        temp *= 0;
        mark = 4;
        text.setText(Integer.toString(temp));
    }
    public  void bt08(View v){
        temp *= 0;
        text.setText(Integer.toString(temp));
    }

    public  void bt05(View v){
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
        editor = data.edit();
        for(int i= 9;i>0;i--){
            mList[i] = mList[i-1];
            editor.putString(String.valueOf(mList[i]),mList[i]);
        }
        mList[0] = Integer.toString(temp);
        editor.putInt("Stage[0]",1);
        editor.apply();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mList);
        listView.setAdapter(adapter);
        text.setText(Integer.toString(temp));

    }


}