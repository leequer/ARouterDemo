package com.wxmylife.morgan.lib1;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule1Provider;

import static com.wxmylife.morgan.base.moduleinterface.provider.IModule1Provider.MODULE1_MAIN_SERVICE;

/**
 * Created by wxmylife on 2017/4/21.
 */
@Route(path = MODULE1_MAIN_SERVICE)
public class Module1Provider implements IModule1Provider {

    @Override
    public Fragment newInstance(Object... args) {
        return Module1Fragment.newInstance(args);
    }

    @Override
    public void init(Context context) {

    }
}
