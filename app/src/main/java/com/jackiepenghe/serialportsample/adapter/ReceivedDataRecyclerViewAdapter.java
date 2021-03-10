package com.jackiepenghe.serialportsample.adapter;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * 显示接收到的数据的列表适配器
 *
 * @author pengh
 */
public class ReceivedDataRecyclerViewAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public ReceivedDataRecyclerViewAdapter(@Nullable List<String> data) {
        super(android.R.layout.simple_list_item_1, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(android.R.id.text1, item);
    }


}
