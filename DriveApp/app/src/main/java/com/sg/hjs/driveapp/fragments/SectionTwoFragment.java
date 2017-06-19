package com.sg.hjs.driveapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sg.hjs.driveapp.R;
import com.sg.hjs.driveapp.controller.SectionTwoFragmentController;
import com.sg.hjs.driveapp.databinding.FragmentSectionTwoBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class SectionTwoFragment extends Fragment {


    public static final String NAME = "SectionTwoFragment";

    public SectionTwoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentSectionTwoBinding binding = FragmentSectionTwoBinding.inflate(inflater);
        SectionTwoFragmentController controller = new SectionTwoFragmentController(binding, this);
        binding.setController(controller);

        return binding.getRoot();
    }

}
