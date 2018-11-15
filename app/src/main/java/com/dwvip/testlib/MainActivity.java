package com.dwvip.testlib;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.dwvip.droidlib.BaseActivity;
import com.dwvip.javalib.MyJavaTool;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.imageView).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, MyJavaTool.getStr(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
