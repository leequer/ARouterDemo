package com.wxmylife.morgan.base;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import java.lang.reflect.Field;

/**
 * Created by wxmylife on 2017/4/20.
 */

public abstract class BaseFragment extends Fragment {

    private static final String TAG = BaseFragment.class.getSimpleName();

    protected View mRootView;


    public <T extends View> T findViewById(@IdRes int id) {
        return (T) mRootView.findViewById(id);
    }


    protected void log(String msg) {
        Log.i(TAG, msg);
    }


    @Override public void onCreate(@Nullable Bundle savedInstanceState) {
        log("OnCreate");
        super.onCreate(savedInstanceState);
    }


    @Nullable @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        log("onCreateView");
        return mRootView=getContentView(inflater,container,savedInstanceState);
    }


    protected abstract View getContentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);


    @Override public void onStart() {
        log("onStart");
        super.onStart();
    }


    @Override public void onResume() {
        log("onResume");
        super.onResume();
    }


    @Override public void onPause() {
        log("onPause");
        super.onPause();
    }


    @Override public void onStop() {
        log("onStop");
        super.onStop();
    }


    @Override public void onDestroyView() {
        log("onDestroyView");
        super.onDestroyView();

        try {
            Field childFragmentManager = Fragment.class.getDeclaredField("mChildFragmentManager");
            childFragmentManager.setAccessible(true);
            childFragmentManager.set(this, null);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }


    @Override public void onDestroy() {
        log("onDestroy");
        super.onDestroy();
    }
}
