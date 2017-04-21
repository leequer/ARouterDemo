package com.wxmylife.morgan.lib3;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule3Provider;

import static com.wxmylife.morgan.base.moduleinterface.provider.IModule3Provider.MODULE3_MAIN_SERVICE;

/**
 * Created by wxmylife on 2017/4/21.
 */
@Route(path = MODULE3_MAIN_SERVICE)
public class Module3Provider implements IModule3Provider {
    @Override
        public Fragment newInstance(Object... args) {
            return Module3Fragment.newInstance(args);
        }

    @Override public void init(Context context) {

    }
}
