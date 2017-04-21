package com.wxmylife.morgan.home;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.wxmylife.morgan.base.moduleinterface.provider.IHomeProvider;

/**
 * Created by wxmylife on 2017/4/21.
 */

@Route(path = IHomeProvider.HOME_MAIN_SERVICE)
public class HomeProvider implements IHomeProvider {

    private Context context;

    @Override public void toast(String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }


    @Override public void selectedTab(Activity activity, int position) {
        if (activity instanceof HomeActivity) {
            ((HomeActivity) activity).selectedTab(position);
        }
    }


    @Override public void init(Context context) {
        this.context = context;
    }
}
