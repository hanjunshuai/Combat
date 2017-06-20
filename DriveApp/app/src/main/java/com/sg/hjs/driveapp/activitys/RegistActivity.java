package com.sg.hjs.driveapp.activitys;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sg.hjs.driveapp.R;
import com.sg.hjs.driveapp.controller.RegistActivityController;
import com.sg.hjs.driveapp.databinding.ActivityRegistBinding;

/**
 * 注册模块
 */
public class RegistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_regist);

        ActivityRegistBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_regist);
        RegistActivityController controller = new RegistActivityController(binding, this);
        binding.setController(controller);

    }
}
