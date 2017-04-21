package com.wxmylife.morgan.base.moduleinterface.module.module3;

import android.support.v4.app.Fragment;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule3Provider;
import com.wxmylife.morgan.base.moduleinterface.router.ModuleManager;
import com.wxmylife.morgan.base.moduleinterface.router.ServiceManager;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class Module3Service {
    private static boolean hasModule3() {
        return ModuleManager.getInstance().hasModule(IModule3Provider.MODULE3_MAIN_SERVICE);
    }

    public static Fragment getModule3Fragment(Object... args) {
        if (!hasModule3()) return null;
        return ServiceManager.getInstance().getModule3Provider().newInstance(args);
    }
}
