package com.sososeen09.binder.hook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

@NeedLogin
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
