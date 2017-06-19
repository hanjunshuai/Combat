package com.sg.hjs.driveapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sg.hjs.driveapp.R;
import com.sg.hjs.driveapp.controller.SectionFourFragmentController;
import com.sg.hjs.driveapp.databinding.FragmentSectionFourBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class SectionFourFragment extends Fragment {


    public static final String NAME = "SectionFourFragment";

    public SectionFourFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        FragmentSectionFourBinding binding = FragmentSectionFourBinding.inflate(inflater);
        SectionFourFragmentController controller = new SectionFourFragmentController(binding, this);
        binding.setController(controller);
        return binding.getRoot();
    }

}
