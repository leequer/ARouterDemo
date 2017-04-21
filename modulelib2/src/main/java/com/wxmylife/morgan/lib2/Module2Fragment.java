package com.wxmylife.morgan.lib2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.wxmylife.morgan.base.BaseFragment;
import com.wxmylife.morgan.base.moduleinterface.module.home.HomeService;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class Module2Fragment extends BaseFragment implements OnClickListener{

    private Button tab1;

    private Button tab2;

    public static Module2Fragment newInstance(Object... args) {
        return new Module2Fragment();
    }

    @Override
    protected View getContentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.module2_main_fragment,null);
    }


    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tab1= (Button) view.findViewById(R.id.module2_main_fragment_tab1);
        tab2= (Button) view.findViewById(R.id.module2_main_fragment_tab2);
        tab1.setOnClickListener(this);
        tab2.setOnClickListener(this);
    }


    @Override public void onClick(View view) {
        if (view.getId() == R.id.module2_main_fragment_tab1) {
            HomeService.selectedTab(getActivity(), 0);
        } else if (view.getId() == R.id.module2_main_fragment_tab2) {
            HomeService.selectedTab(getActivity(), 1);
        }
    }

}
