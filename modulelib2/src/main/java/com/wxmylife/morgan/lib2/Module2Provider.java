package com.wxmylife.morgan.lib2;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule2Provider;

import static com.wxmylife.morgan.base.moduleinterface.provider.IModule2Provider.MODULE2_MAIN_SERVICE;

/**
 * Created by wxmylife on 2017/4/21.
 */
@Route(path = MODULE2_MAIN_SERVICE)
public class Module2Provider implements IModule2Provider {
    @Override public Fragment newInstance(Object... args) {
        return Module2Fragment.newInstance(args);
    }


    @Override public void init(Context context) {

    }
}
