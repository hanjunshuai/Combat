package com.sg.hjs.driveapp.controller;

import android.view.View;

import com.sg.hjs.driveapp.R;
import com.sg.hjs.driveapp.databinding.FragmentSectionOneBinding;
import com.sg.hjs.driveapp.fragments.ExamFragment;
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

    public void btnExamLisenter(View v) {
        fragment.getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment,new ExamFragment())
                .addToBackStack(ExamFragment.NAME)
                .commit();
    }
}
