package com.wxmylife.morgan;

import com.alibaba.android.arouter.launcher.ARouter;
import com.wxmylife.morgan.base.BaseApplication;
import com.wxmylife.morgan.base.moduleinterface.config.ModuleOptions;
import com.wxmylife.morgan.base.moduleinterface.provider.IHomeProvider;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule1Provider;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule2Provider;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule3Provider;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule4Provider;
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
        if (LG.isDebug){
            ARouter.openLog();
            ARouter.openDebug();
            ARouter.printStackTrace();
        }
        ARouter.init(this);
        ModuleOptions.ModuleBuilder builder=new ModuleOptions.ModuleBuilder(this)
            .addModule(IHomeProvider.HOME_MAIN_SERVICE,IHomeProvider.HOME_MAIN_SERVICE)
            .addModule(IModule1Provider.MODULE1_MAIN_SERVICE, IModule1Provider.MODULE1_MAIN_SERVICE)
            .addModule(IModule2Provider.MODULE2_MAIN_SERVICE, IModule2Provider.MODULE2_MAIN_SERVICE)
            .addModule(IModule3Provider.MODULE3_MAIN_SERVICE, IModule3Provider.MODULE3_MAIN_SERVICE)
            .addModule(IModule4Provider.MODULE4_MAIN_SERVICE, IModule4Provider.MODULE4_MAIN_SERVICE);

        ModuleManager.getInstance().init(builder.build());
    }
}
