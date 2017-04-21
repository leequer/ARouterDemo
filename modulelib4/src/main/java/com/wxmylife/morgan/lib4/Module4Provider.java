package com.wxmylife.morgan.lib4;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule4Provider;

/**
 * Created by wxmylife on 2017/4/21.
 */
@Route(path = IModule4Provider.MODULE4_MAIN_SERVICE)
public class Module4Provider implements IModule4Provider {
    @Override
    public Fragment newInstance(Object... args) {
        return null;
    }

    @Override
    public void init(Context context) {

    }
}