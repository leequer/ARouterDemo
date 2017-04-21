package com.wxmylife.morgan;

import com.alibaba.android.arouter.launcher.ARouter;
import com.wxmylife.morgan.base.BaseApplication;
import com.wxmylife.morgan.base.moduleinterface.config.ModuleOptions;
import com.wxmylife.morgan.base.moduleinterface.provider.IHomeProvider;
import com.wxmylife.morgan.base.moduleinterface.router.ModuleManager;
import com.wxmylife.morgan.base.utils.LG;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class CustomApplication extends BaseApplication {

    @Override public void onCreate() {
        super.onCreate();
        initARouter();
    }


    private void initARouter() {
        LG.e(LG.isDebug+"");
        if (LG.isDebug){
            ARouter.openLog();
            ARouter.openDebug();
            ARouter.printStackTrace();
        }
        ARouter.init(this);
        ModuleOptions.ModuleBuilder builder=new ModuleOptions.ModuleBuilder(this)
            .addModule(IHomeProvider.HOME_MAIN_SERVICE,IHomeProvider.HOME_MAIN_SERVICE);
        ModuleManager.getInstance().init(builder.build());
    }
}
