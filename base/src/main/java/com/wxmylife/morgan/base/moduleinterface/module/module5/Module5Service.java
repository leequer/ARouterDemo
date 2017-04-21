package com.wxmylife.morgan.base.moduleinterface.module.module5;

import com.wxmylife.morgan.base.moduleinterface.provider.IModule5Provider;
import com.wxmylife.morgan.base.moduleinterface.router.ModuleManager;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class Module5Service {
    private boolean hasModule1() {
        return ModuleManager.getInstance().hasModule(IModule5Provider.MODULE5_MAIN_SERVICE);
    }
}
