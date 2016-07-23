package com.example.hyungjun.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int [] a ;
    char [] b;
    int count= 0;
    int num_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt;
        Button num1 = (Button)findViewById(R.id.num1);
        Button num2 = (Button)findViewById(R.id.num2);
        Button num3 = (Button)findViewById(R.id.num3);
        Button num4 = (Button)findViewById(R.id.num4);
        Button num5 = (Button)findViewById(R.id.num5);
        Button num6 = (Button)findViewById(R.id.num6);
        Button num7 = (Button)findViewById(R.id.num7);
        Button num8 = (Button)findViewById(R.id.num8);
        Button num9 = (Button)findViewById(R.id.num9);
        Button num0 = (Button)findViewById(R.id.num0);
        Button opplus = (Button)findViewById(R.id.opplus);
        Button opsub = (Button)findViewById(R.id.opsub);
        Button result = (Button)findViewById(R.id.result);

        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        opplus.setOnClickListener(this);
        opsub.setOnClickListener(this);
        result.setOnClickListener(this);
        txt = (TextView)findViewById(R.id.a);

    }
    @Override

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.num0:
                a[count] = 0;
               count ++;
                break;
            case R.id.num1:
                a[count] = 0;
                count ++;
                break;
            case R.id.num2:
                a[count] = 0;
                count ++;
                break;
            case R.id.num3:
                a[count] = 0;
                count ++;
                break;
            case R.id.num4:
                a[count] = 0;
                count ++;
                break;
            case R.id.num5:
                a[count] = 0;
                count ++;
                break;
            case R.id.num6:
                a[count] = 0;
                count ++;
                break;
            case R.id.num7:
                a[count] = 0;
                count ++;
                break;
            case R.id.num8:
                a[count] = 0;
                count ++;
                break;
            case R.id.num9:
                a[count] = 0;
                count ++;
                break;
            case R.id.opplus:
                b[count] = '+';
                count ++;
                break;
            case R.id.opsub:
                b[count] = '-';
                count ++;
                break;
            case R.id.result:
                if(b [1]== '+') {
                    num_result = a[0] + a[2];
                    txt.setText(num_result);
                }
                else if (b [1]== '-'){
                    num_result = a[0] - a[2] ;
                    txt.setText(num_result);
                }
                else
                    num_result  = -1 ;
                count ++;
                break;
        }
    }
}
