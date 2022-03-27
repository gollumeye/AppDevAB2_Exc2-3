package com.example.ab2_helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("debugMessage", "Debug Message Test");
        Log.e("errorMessage", "Error Message Test");
        Log.i("infoMessage", "Info Message Test");
        Log.v("verboseMessage", "Verbose Message Test");
        Log.w("warnMessage", "Warning Message Test");
    }
}