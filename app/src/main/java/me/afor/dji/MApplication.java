package me.afor.dji;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

import com.secneo.sdk.Helper;

public class MApplication extends MultiDexApplication {

    private DjiInitializer djiInitializer;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Helper.install(MApplication.this);
        if (djiInitializer == null) {
            djiInitializer = new DjiInitializer(this);
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (djiInitializer != null) {
            djiInitializer.onCreate();
        }
    }

}