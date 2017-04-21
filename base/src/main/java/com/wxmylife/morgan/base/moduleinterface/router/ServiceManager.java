package com.wxmylife.morgan.base.moduleinterface.router;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;
import com.wxmylife.morgan.base.moduleinterface.provider.IHomeProvider;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule1Provider;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class ServiceManager {
    //服务注入看自己的具体实现
    //自动注入
    @Autowired
    IHomeProvider homeProvider;
    @Autowired
    IModule1Provider module1Provider;


    public ServiceManager() {
        ARouter.getInstance().inject(this);
    }

    private static final class ServiceManagerHolder {
        private static final ServiceManager instance = new ServiceManager();
    }

    public static ServiceManager getInstance() {
        return ServiceManagerHolder.instance;
    }


    public IHomeProvider getHomeProvider() {
        return homeProvider;
    }



    // public IModule1Provider getModule1Provider() {
    //     return  module1Provider != null ? module1Provider :
    //             (module1Provider = ((IModule1Provider) ModuleRouter.newInstance(IModule1Provider.MODULE1_MAIN_SERVICE).navigation()));
    // }


    public IModule1Provider getModule1Provider() {
        return module1Provider;
    }
}
