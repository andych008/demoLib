package com.dwvip.droidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public abstract class BaseActivity extends AppCompatActivity {

    public static String TAG = BaseActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = this.getClass().getSimpleName();
        Log.i(TAG, "onCreate");
    }
}
