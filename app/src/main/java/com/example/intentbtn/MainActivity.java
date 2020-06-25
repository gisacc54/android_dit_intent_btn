package com.example.intentbtn;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button intent1Btn;
    private Button intent2Btn;
    private Intent intent1;
    private Intent intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent1Btn = (Button)findViewById(R.id.intent1);
        intent2Btn = (Button)findViewById(R.id.intent2);

        intent1Btn.setOnClickListener(this);
        intent2Btn.setOnClickListener(this);

        intent1 = new Intent(this, Activity1.class);
        intent2 = new Intent(this, Activity2.class);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.intent1)
        {
            startActivity(intent1);
        }
        if(v.getId() == R.id.intent2)
        {
            startActivity(intent2);
        }

    }


}