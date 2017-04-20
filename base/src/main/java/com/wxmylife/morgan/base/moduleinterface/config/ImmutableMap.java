package com.wxmylife.morgan.base.moduleinterface.config;

import com.wxmylife.morgan.base.utils.Util;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wxmylife on 2017/4/20.
 */

public class ImmutableMap {

    private Map<String,String> mPaths;


    public ImmutableMap() {
        mPaths = new HashMap<>();
    }

    public void addPath(String key,String value){
        if (Util.isNull(key,value)) return;
        mPaths.put(key,value);
    }

    public void addAll(Map<String,String> paths){
        if (mPaths==null) return;
        this.mPaths.putAll(paths);
    }

    public boolean containsKey(String key) {
        return mPaths.containsKey(key);
    }

    public String get(String key) {
        return mPaths.get(key);
    }
}
