package com.wxmylife.morgan.lib1.debug;

import com.alibaba.android.arouter.launcher.ARouter;
import com.wxmylife.morgan.base.BaseApplication;
import com.wxmylife.morgan.base.moduleinterface.config.ModuleOptions;
import com.wxmylife.morgan.base.moduleinterface.provider.IHomeProvider;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule1Provider;
import com.wxmylife.morgan.base.moduleinterface.router.ModuleManager;
import com.wxmylife.morgan.base.utils.LG;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class Module1DebugApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        initARouter();
    }

    private void initARouter() {
        if (LG.isDebug) {
            ARouter.openLog();
            ARouter.openDebug();
            ARouter.printStackTrace();
        }
        ARouter.init(this);
        ModuleOptions.ModuleBuilder builder = new ModuleOptions.ModuleBuilder(this)
            .addModule(IHomeProvider.HOME_MAIN_SERVICE, IHomeProvider.HOME_MAIN_SERVICE)
            .addModule(IModule1Provider.MODULE1_MAIN_SERVICE, IModule1Provider.MODULE1_MAIN_SERVICE);
        ModuleManager.getInstance().init(builder.build());
    }
}
