package com.example.ignat.learntocountandalphabet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    Button btnActCount, btnActAlphabet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActCount = findViewById(R.id.btnActCount);
        btnActCount.setOnClickListener(this);
        btnActAlphabet = findViewById(R.id.btnActAlphabet);
        btnActAlphabet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActCount:
                // Переход на экран счета
                Intent intent = new Intent(this, ActivityCount.class);
                startActivity(intent);
                break;
            case R.id.btnActAlphabet:
                // Переход на экран алфавита
                Intent intent1 = new Intent(this, ActivityAlphabet.class);
                startActivity(intent1);
            default:
                break;
        }

    }
}
