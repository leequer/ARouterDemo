package com.wxmylife.morgan.base.moduleinterface.module.module1;

import android.support.v4.app.Fragment;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule1Provider;
import com.wxmylife.morgan.base.moduleinterface.router.ModuleManager;
import com.wxmylife.morgan.base.moduleinterface.router.ServiceManager;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class Module1Service {

    private static boolean hasModule1() {
        return ModuleManager.getInstance().hasModule(IModule1Provider.MODULE1_MAIN_SERVICE);
    }

    public static Fragment getModule1Frgment(Object... args) {
        if(!hasModule1()) return null;
        return ServiceManager.getInstance().getModule1Provider().newInstance(args);
    }

}
