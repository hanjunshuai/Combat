package com.sg.hjs.driveapp.controller;

import com.sg.hjs.driveapp.databinding.FragmentSectionOneBinding;
import com.sg.hjs.driveapp.fragments.SectionOneFragment;

/**
 * Created by hjs on 17-6-19.
 */

public class SectionOneFragmentController {
    private FragmentSectionOneBinding binding;
    private SectionOneFragment fragment;

    public SectionOneFragmentController(FragmentSectionOneBinding binding, SectionOneFragment fragment) {
        this.binding = binding;
        this.fragment = fragment;
    }
}
