package com.wxmylife.morgan.base.moduleinterface.module.module5;

import com.wxmylife.morgan.base.moduleinterface.config.ModuleBundle;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule5Provider;
import com.wxmylife.morgan.base.moduleinterface.router.ModuleManager;
import com.wxmylife.morgan.base.moduleinterface.router.ModuleRouter;
import java.io.Serializable;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class Module5Intent {

    private static boolean hasModule5() {
        return ModuleManager.getInstance().hasModule(IModule5Provider.MODULE5_MAIN_SERVICE);
    }

    public static void launchModule5(Serializable data) {
        if (!hasModule5()) return;
        ModuleBundle bundle = new ModuleBundle();
        bundle.put("data", data);
        ModuleRouter.newInstance(IModule5Provider.MODULE5_ACT_MAIN)
            .withBundle(bundle)
            .navigation();
    }
}
