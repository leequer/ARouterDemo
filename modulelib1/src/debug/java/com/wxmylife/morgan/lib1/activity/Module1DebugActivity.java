package com.wxmylife.morgan.lib1.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.wxmylife.morgan.base.BaseActivity;
import com.wxmylife.morgan.base.moduleinterface.module.module1.Module1Service;
import com.wxmylife.morgan.modulelib1.R;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class Module1DebugActivity extends BaseActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module1_debug_activity);
        Fragment module1 = Module1Service.getModule1Frgment();
        getSupportFragmentManager().beginTransaction().add(R.id.moddule1_debug_content, module1)
            .commitAllowingStateLoss();
    }
}
