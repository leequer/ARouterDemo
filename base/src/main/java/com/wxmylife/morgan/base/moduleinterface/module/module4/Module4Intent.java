package com.wxmylife.morgan.base.moduleinterface.module.module4;

import android.app.Activity;
import com.wxmylife.morgan.base.moduleinterface.config.ModuleBundle;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule4Provider;
import com.wxmylife.morgan.base.moduleinterface.router.ModuleManager;
import com.wxmylife.morgan.base.moduleinterface.router.ModuleRouter;
import java.io.Serializable;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class Module4Intent {
    private static boolean hasModule4() {
        return ModuleManager.getInstance().hasModule(IModule4Provider.MODULE4_MAIN_SERVICE);
    }

    public static void launchModule4(Activity activity, int requestCode, Serializable data) {
        if (!hasModule4()) return;
        ModuleBundle bundle = new ModuleBundle();
        bundle.put("data", data);
        ModuleRouter.newInstance(IModule4Provider.MODULE4_ACT_MAIN)
            .withBundle(bundle)
            .navigation(activity, requestCode);
    }
}
