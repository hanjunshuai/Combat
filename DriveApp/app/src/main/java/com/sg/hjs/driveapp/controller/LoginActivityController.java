package com.sg.hjs.driveapp.controller;

import android.content.Intent;
import android.view.View;

import com.sg.hjs.driveapp.activitys.LoginActivity;
import com.sg.hjs.driveapp.activitys.RegistActivity;
import com.sg.hjs.driveapp.databinding.ActivityLoginBinding;
import com.sg.hjs.driveapp.databinding.ActivityMainBinding;

/**
 * Created by hjs on 17-6-20.
 */

public class LoginActivityController {
    private ActivityLoginBinding binding;
    private LoginActivity activity;

    public LoginActivityController(ActivityLoginBinding binding, LoginActivity activity) {
        this.binding = binding;
        this.activity = activity;
    }

    public void tvRegistLisenter(View v) {
        activity.startActivity(new Intent(activity, RegistActivity.class));
    }
}
