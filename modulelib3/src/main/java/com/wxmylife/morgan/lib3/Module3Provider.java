package com.wxmylife.morgan.lib3;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule3Provider;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class Module3Provider implements IModule3Provider {
    @Override
        public Fragment newInstance(Object... args) {
            return Module3Fragment.newInstance(args);
        }

    @Override public void init(Context context) {

    }
}
