package com.sg.hjs.driveapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sg.hjs.driveapp.R;
import com.sg.hjs.driveapp.controller.SkiddingFragmentController;
import com.sg.hjs.driveapp.databinding.FragmentSkiddingBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class SkiddingFragment extends Fragment {


    public SkiddingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentSkiddingBinding binding = FragmentSkiddingBinding.inflate(inflater);
        SkiddingFragmentController controller = new SkiddingFragmentController(binding, this);
        binding.setController(controller);
        return binding.getRoot();
    }

}
