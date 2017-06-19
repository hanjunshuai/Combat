package com.sg.hjs.driveapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sg.hjs.driveapp.R;
import com.sg.hjs.driveapp.controller.SectionThreeFragmentController;
import com.sg.hjs.driveapp.databinding.FragmentSectionThreeBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class SectionThreeFragment extends Fragment {


    public static final String NAME = "SectionThreeFragment";

    public SectionThreeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentSectionThreeBinding binding = FragmentSectionThreeBinding.inflate(inflater);
        SectionThreeFragmentController controller = new SectionThreeFragmentController(binding, this);
        binding.setController(controller);

        return binding.getRoot();
    }

}
