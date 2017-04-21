package com.wxmylife.morgan.base.moduleinterface.provider;

import android.app.Activity;

/**
 * Created by wxmylife on 2017/4/21.
 */

public interface IHomeProvider extends IBaseProvider{

    //Service
    String HOME_MAIN_SERVICE = "/home/main/service";
    //开屏
    String HOME_ACT_SPLASH = "/home/act/splash";
    //home主页
    String HOME_ACT_HOME = "/home/act/home";

    String HOME_TABTYPE = "home_tab_type";

    void toast(String msg);

    void selectedTab(Activity activity, int position);
}
