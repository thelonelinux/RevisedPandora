package com.example.vicky.batterycharging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        intent.getAction();
        Toast.makeText(context,"Power is connected",Toast.LENGTH_SHORT).show();
    }
}
