package com.wxmylife.morgan.base.moduleinterface.module.module2;

import android.support.v4.app.Fragment;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule2Provider;
import com.wxmylife.morgan.base.moduleinterface.router.ModuleManager;
import com.wxmylife.morgan.base.moduleinterface.router.ServiceManager;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class Module2Service {

    private static boolean hasModule2() {
        return ModuleManager.getInstance().hasModule(IModule2Provider.MODULE2_MAIN_SERVICE);
    }

    public static Fragment getModule2Fragment(Object... args) {
        if (!hasModule2()) return null;
        return ServiceManager.getInstance().getModule2Provider().newInstance(args);
    }

}
