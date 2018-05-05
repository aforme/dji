package me.afor.dji;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

import com.secneo.sdk.Helper;

public class MApplication extends MultiDexApplication {

    private DjiInitApplication demoApplication;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Helper.install(MApplication.this);
        if (demoApplication == null) {
            demoApplication = new DjiInitApplication();
            demoApplication.setContext(this);
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (demoApplication != null) {
            demoApplication.onCreate();
        }
    }

}