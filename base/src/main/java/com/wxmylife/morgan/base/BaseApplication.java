package com.wxmylife.morgan.base;

import android.app.Application;
import com.wxmylife.morgan.base.utils.LG;

/**
 * Created by wxmylife on 2017/4/20.
 */

public class BaseApplication extends Application {

    @Override public void onCreate() {
        super.onCreate();
        LG.isDebug=true;
    }
}
