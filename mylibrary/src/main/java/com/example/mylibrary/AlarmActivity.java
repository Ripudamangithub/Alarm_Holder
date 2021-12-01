package com.example.mylibrary;


import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AlarmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start= findViewById(R.id.button);
      /*  start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAlert();
            }
        });*/
    //    startAlert("",getApplicationContext());

    }
    public void startAlert(Activity context, String value){

        int i = Integer.parseInt(value);
        Intent intent = new Intent(context, MyBroadcastReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 234324243, intent, 0);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (i * 1000), pendingIntent);
        Toast.makeText(context, "Alarm set in " + i + " seconds",Toast.LENGTH_LONG).show();
    }

    public void setMsgToast(Context context, String msg){
        Toast.makeText(context, "Welcome: )"+msg, Toast.LENGTH_SHORT).show();
    }

    public void printLog(String tag,String value){
        Log.d(tag,value);
    }
}