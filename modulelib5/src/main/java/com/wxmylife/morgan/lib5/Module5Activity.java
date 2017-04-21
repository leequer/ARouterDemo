package com.wxmylife.morgan.lib5;

import android.os.Bundle;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.wxmylife.morgan.base.BaseActivity;
import com.wxmylife.morgan.base.dao.UserInfo;
import com.wxmylife.morgan.base.moduleinterface.provider.IModule5Provider;

/**
 * Created by wxmylife on 2017/4/21.
 */

@Route(path = IModule5Provider.MODULE5_ACT_MAIN)
public class Module5Activity extends BaseActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module5_activity_main);
        TextView textView = (TextView) findViewById(R.id.module5_activity_main_tv);
        UserInfo info = (UserInfo) getIntent().getSerializableExtra("data");
        if (info!=null) {
            textView.setText("从别的模块传递过来的数据\n" + "姓名是:" + info.getName() + "\n年龄是：" + info.getAge());
        }
    }
}

