package com.example.mydemoproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mylibrary.AlarmActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start = findViewById(R.id.button);
        AlarmActivity fffff = new AlarmActivity();
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = findViewById(R.id.time);

                fffff.startAlert(MainActivity.this, text.getText().toString());
            }
        });

        fffff.setMsgToast(this, "Demo Project");
        fffff.printLog("Tagg","1,220");

    }

}