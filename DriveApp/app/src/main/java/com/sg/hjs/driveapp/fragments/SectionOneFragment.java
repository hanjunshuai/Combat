package com.sg.hjs.driveapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sg.hjs.driveapp.R;
import com.sg.hjs.driveapp.controller.SectionOneFragmentController;
import com.sg.hjs.driveapp.databinding.FragmentSectionOneBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class SectionOneFragment extends Fragment {


    public static final String NAME = "SectionOneFragment";

    public SectionOneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentSectionOneBinding binding = FragmentSectionOneBinding.inflate(inflater);
        SectionOneFragmentController controller = new SectionOneFragmentController(binding, this);
        binding.setController(controller);
        return binding.getRoot();
    }

}
