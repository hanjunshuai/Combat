package com.sg.hjs.driveapp.controller;

import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.sg.hjs.driveapp.LocApp;
import com.sg.hjs.driveapp.activitys.LoginActivity;
import com.sg.hjs.driveapp.databinding.FragmentSkiddingBinding;
import com.sg.hjs.driveapp.fragments.SkiddingFragment;
import com.sg.hjs.driveapp.service.LocationService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjs on 17-6-19.
 */

public class SkiddingFragmentController implements BDLocationListener {
    private LocationService mLocationService;
    private FragmentSkiddingBinding binding;
    private SkiddingFragment fragment;

    public SkiddingFragmentController(FragmentSkiddingBinding binding, SkiddingFragment fragment) {
        this.binding = binding;
        this.fragment = fragment;

        addToList();
        getAppLocaService();
    }

    /**
     * 定位
     */
    private void getAppLocaService() {
        mLocationService = ((LocApp) fragment.getActivity().getApplication()).getLocationService();
        mLocationService.registerListener(this);
        mLocationService.start();
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


    @Override
    public void onReceiveLocation(final BDLocation bdLocation) {
        fragment.getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                binding.loacTv.setText(bdLocation.getCity());
            }
        });
    }

    @Override
    public void onConnectHotSpotMessage(String s, int i) {

    }
}
