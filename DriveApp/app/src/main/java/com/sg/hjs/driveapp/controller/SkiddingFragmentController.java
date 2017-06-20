package com.sg.hjs.driveapp.controller;

import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;

import com.sg.hjs.driveapp.R;
import com.sg.hjs.driveapp.activitys.LoginActivity;
import com.sg.hjs.driveapp.databinding.FragmentSkiddingBinding;
import com.sg.hjs.driveapp.fragments.SkiddingFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjs on 17-6-19.
 */

public class SkiddingFragmentController {
    private FragmentSkiddingBinding binding;
    private SkiddingFragment fragment;

    public SkiddingFragmentController(FragmentSkiddingBinding binding, SkiddingFragment fragment) {
        this.binding = binding;
        this.fragment = fragment;

        addToList();
    }

    public void layLisenter(View v) {
        fragment.startActivity(new Intent(fragment.getContext(), LoginActivity.class));
    }

    private void addToList() {
        List<String> list = new ArrayList<>();
        list.add("我的消息");
        list.add("教学视频");
        list.add("我的成绩");
        list.add("学车日记");
        list.add("教员中心");
        list.add("设置");
        binding.listView.setAdapter(new ArrayAdapter<String>(fragment.getContext(), android.R.layout.simple_list_item_1, list));
    }
}
