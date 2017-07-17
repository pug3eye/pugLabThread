package com.pug3eye.labthread.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by pug3eye on 17/07/2017.
 */

public class CounterIntentService extends IntentService {
    public CounterIntentService() {
        super("");
    }
    public CounterIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        // Run in Background Thread
        for (int i = 0; i < 100; i++) {
        Log.d("IntentService", "i =" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
