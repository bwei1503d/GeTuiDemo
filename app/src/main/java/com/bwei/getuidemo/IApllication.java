package com.bwei.getuidemo;

import android.app.Application;

import com.igexin.sdk.PushManager;

/**
 * Created by muhanxi on 17/5/11.
 */

public class IApllication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        PushManager.getInstance().initialize(this,PushService.class);

        PushManager.getInstance().registerPushIntentService(this,CIntentService.class);

    }
}
