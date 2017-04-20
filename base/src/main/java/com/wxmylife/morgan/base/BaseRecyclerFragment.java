package com.wxmylife.morgan.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by wxmylife on 2017/4/20.
 */

public abstract class BaseRecyclerFragment extends BaseFragment {

    protected RecyclerView mRecyclerView;


    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = findViewById(R.id.core_recycler_view);
        if (mRecyclerView == null) {
            throw new IllegalArgumentException("RecyclerView can not be null");
        }
        mRecyclerView.setLayoutManager(getLayoutManager());
        mRecyclerView.setAdapter(getAdapter());
    }


    protected abstract RecyclerView.Adapter getAdapter();

    protected RecyclerView.LayoutManager getLayoutManager() {
        return new LinearLayoutManager(getActivity());
    }
}
