package com.example.matsu.dentaku;

import android.app.*;
import android.os.*;
import android.view.View;
import android.view.Window;
import android.widget.*;

public class CalcActivity extends Activity  {

    int temp;
    int mark;
    int sum;
    private String[] mStrings = {"aaa","abc","bbb","ccc"};
    ListView listView;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //タイトルバーを非表示(必ずsetContentViewの前に設置)
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //レイアウトをセットする
        setContentView(R.layout.activity_calc);

        //
        text = (TextView)findViewById(R.id.textView);
        text.setText("00000000");

        listView = (ListView)findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mStrings);
        listView.setAdapter(adapter);

        //フォント変更
        // ((TextView)findViewById(R.id.textView)).setTypeface(Typeface.createFromAsset(getAssets(), "LED7SEG_Standard.ttf"));


    }
    public void string(View v){
        mStrings[0] = "www";
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mStrings);
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
        ///aaaaaa
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
        mark = 3;//a
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
        text.setText(Integer.toString(temp));
    }


}