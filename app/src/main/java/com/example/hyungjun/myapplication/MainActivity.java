package com.example.hyungjun.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        Button opresult = (Button)findViewById(R.id.opresult);
        text = (TextView)findViewById(R.id.a);
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
        opresult.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.num0:
                text.setText("0");
                break;
            case R.id.num1:
                text.setText("1");
                break;
            case R.id.num2:
                text.setText("2");
                break;
            case R.id.num3:
                text.setText("3");
                break;
            case R.id.num4:
                text.setText("4");
                break;
            case R.id.num5:
                text.setText("5");
                break;
            case R.id.num6:
                text.setText("6");
                break;
            case R.id.num7:
                text.setText("7");
                break;
            case R.id.num8:
                text.setText("8");
                break;
            case R.id.num9:
                text.setText("9");
                break;
            case R.id.opplus:
                text.setText("+");
                break;
            case R.id.opresult:
                text.setText("result");
                break;
        }
    }
}
