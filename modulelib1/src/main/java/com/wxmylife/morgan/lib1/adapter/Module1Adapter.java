package com.wxmylife.morgan.lib1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wxmylife.morgan.base.view.adapter.BaseAdapter;
import com.wxmylife.morgan.base.view.adapter.VH;
import com.wxmylife.morgan.lib1.R;
import com.wxmylife.morgan.lib1.bean.Books;
import java.util.List;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class Module1Adapter extends BaseAdapter<Books, Module1Adapter.Module1Holder> {

    public Module1Adapter(List<Books> mDatas) {
        super(mDatas);
    }

    @Override
    protected Module1Holder getHolder(ViewGroup parent, int viewType) {
        return new Module1Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.module1_fragment_main_item, parent, false));
    }

    class Module1Holder extends VH<Books> {

        private TextView name;
        private TextView author;

        public Module1Holder(View itemView) {
            super(itemView);
            name = findvViewById(R.id.module1_fragment_main_item_name);
            author = findvViewById(R.id.module1_fragment_main_item_author);
        }

        @Override
        protected void setData(Books data) {
            name.setText(data.getName());
            author.setText(data.getAuthor());
        }
    }

}
