package com.wxmylife.morgan.base.moduleinterface.module.app;

import com.wxmylife.morgan.base.moduleinterface.provider.IAppProvider;
import com.wxmylife.morgan.base.moduleinterface.router.ModuleManager;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class AppService {

    private static boolean hasModule(){
        return ModuleManager.getInstance().hasModule(IAppProvider.APP_MAIN_SERVICE);
    }
}
