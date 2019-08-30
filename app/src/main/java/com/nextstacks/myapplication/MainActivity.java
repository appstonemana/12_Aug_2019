package com.nextstacks.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate:::::: MainActivity");

        int result = getIntent().getIntExtra("sum",-1);
        String testString = getIntent().getStringExtra("string");

        Log.i(TAG, "onCreate:::: result  "+result);
        TextView mTvSum = findViewById(R.id.tv_sum);

        mTvSum.setText("Sum = "+result);

    }


    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "onStart:::::::::: MainActivity ");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "onResume:::::::; MainActivity ");
    }


    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "onPause::::::: MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG, "onStop:::::::: MainActivity ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(TAG, "onRestart:::::::; MainActivity ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "onDestroy::::::: MainActivity ");
    }
}
