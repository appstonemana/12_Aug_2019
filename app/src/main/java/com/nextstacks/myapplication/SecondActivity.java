package com.nextstacks.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    public static final String TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i(TAG, "onCreate::::::::: ");


        Button btn = findViewById(R.id.btn_submit);
        final EditText et_usrname = findViewById(R.id.et_useername);
        final EditText et_pwd = findViewById(R.id.et_password);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String first_no = et_usrname.getText().toString();
                String second_no = et_pwd.getText().toString();

                int fno = Integer.parseInt(first_no);
                int sno = Integer.parseInt(second_no);

                int sum = fno+sno;

                Intent intent  = new Intent(SecondActivity.this,MainActivity.class);

                intent.putExtra("sum",sum);
                intent.putExtra("string","some string");
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "onStart::::::::: ");
    }


    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "onResume::::::::: ");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "onPause:::::::: ");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG, "onStop::::::: ");
    }


    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(TAG, "onRestart::::::: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "onDestroy::::::: ");
    }
}
