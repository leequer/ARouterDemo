package com.wxmylife.morgan.base.moduleinterface.router;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class ServiceManager {

    public ServiceManager() {
        ARouter.getInstance().inject(this);
    }

    private static final class ServiceManagerHolder {
        private static final ServiceManager instance = new ServiceManager();
    }

    public static ServiceManager getInstance() {
        return ServiceManagerHolder.instance;
    }
}
