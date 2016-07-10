package com.lxy.sf.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        registerLin();
    }

    private void registerLin() {
        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
        mButton6.setOnClickListener(this);
    }

    private void init() {

       mButton1= (Button) findViewById(R.id.button);
       mButton2= (Button) findViewById(R.id.button2);
       mButton3= (Button) findViewById(R.id.button3);
       mButton4= (Button) findViewById(R.id.button4);
       mButton5= (Button) findViewById(R.id.button5);
       mButton6= (Button) findViewById(R.id.button6);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
            case R.id.button2:
            case R.id.button3:
            case R.id.button4:
            case R.id.button5:
            case R.id.button6:
                Toast.makeText(this, "my button will launch my capstone app!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
