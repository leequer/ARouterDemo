package com.wxmylife.morgan.base.moduleinterface.module.home;

import com.wxmylife.morgan.base.moduleinterface.config.ModuleBundle;
import com.wxmylife.morgan.base.moduleinterface.provider.IHomeProvider;
import com.wxmylife.morgan.base.moduleinterface.router.ModuleManager;
import com.wxmylife.morgan.base.moduleinterface.router.ModuleRouter;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class HomeIntent {

    private static boolean hasModule() {
        return ModuleManager.getInstance().hasModule(IHomeProvider.HOME_MAIN_SERVICE);
    }

    public static void launchHome(int tabType) {
        ModuleBundle bundle=new ModuleBundle();
        bundle.put(IHomeProvider.HOME_TABTYPE,tabType);
        ModuleRouter.newInstance(IHomeProvider.HOME_ACT_HOME)
            .withBundle(bundle)
            .navigation();
    }
}
