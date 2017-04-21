package com.wxmylife.morgan.base.moduleinterface.module.module4;

import com.wxmylife.morgan.base.moduleinterface.provider.IModule4Provider;
import com.wxmylife.morgan.base.moduleinterface.router.ModuleManager;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class Module4Service {

    private boolean hasModule1() {
        return ModuleManager.getInstance().hasModule(IModule4Provider.MODULE4_MAIN_SERVICE);
    }

}
