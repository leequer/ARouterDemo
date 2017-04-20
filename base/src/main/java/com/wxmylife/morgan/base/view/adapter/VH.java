package com.wxmylife.morgan.base.view.adapter;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by wxmylife on 2017/4/20.
 */

public  abstract class VH<T> extends RecyclerView.ViewHolder {

    private Context context;
    private T data;

    public VH(View itemView) {
        super(itemView);
        context = itemView.getContext();
    }

    protected void init(T data) {
        this.data = data;
        setData(data);
    }

    protected abstract void setData(T data);

    protected <V extends View> V findvViewById(@IdRes int id) {
        return (V) itemView.findViewById(id);
    }

    protected T getData() {
        return data;
    }

}