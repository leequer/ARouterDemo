package com.wxmylife.morgan.base.utils;

import android.util.Log;

/**
 * Created by wxmylife on 2017/4/20.
 */

public class LG {

    public static boolean isDebug = false;

    private static final String DETAULT_TAG = "---Module Sample Log>>>";

    public static void d(String msg) {
        d(DETAULT_TAG, msg);
    }

    private static void d(String tag, String msg) {
        Log.i(tag, msg);
    }

    public static void e(String msg) {
        e(DETAULT_TAG, msg);
    }

    private static void e(String tag, String msg) {
        Log.e(tag, msg);
    }


}
