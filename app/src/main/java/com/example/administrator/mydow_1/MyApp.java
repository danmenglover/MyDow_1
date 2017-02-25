package com.example.administrator.mydow_1;


import android.app.Application;
import android.util.Log;

public class MyApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        for (int i=0;i<10;i++){
            Log.e("log","niaho1");
        }
    }
}
