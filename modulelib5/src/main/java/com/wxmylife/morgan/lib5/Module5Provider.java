package com.wxmylife.morgan.lib5;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule5Provider;

/**
 * Created by wxmylife on 2017/4/21.
 */

@Route(path = IModule5Provider.MODULE5_MAIN_SERVICE)
public class Module5Provider implements IModule5Provider {
    @Override
    public Fragment newInstance(Object... args) {
        return null;
    }

    @Override
    public void init(Context context) {

    }
}