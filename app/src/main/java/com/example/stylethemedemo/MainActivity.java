package com.example.stylethemedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_title;
    Button login,signUp,fp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_title = findViewById(R.id.tv_title);
        login = findViewById(R.id.login);
        signUp = findViewById(R.id.signUp);
        fp = findViewById(R.id.fp);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_title: {

            }case R.id.login: {

            }case R.id.signUp: {

            }case R.id.fp: {

            }
        }
    }
}
