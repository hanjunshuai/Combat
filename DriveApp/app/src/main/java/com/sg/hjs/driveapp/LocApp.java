package com.sg.hjs.driveapp;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;
import com.sg.hjs.driveapp.service.LocationService;

/**
 * Created by hjs on 17-6-20.
 */

public class LocApp extends Application {

    private LocationService mLocationService;

    @Override
    public void onCreate() {
        super.onCreate();

        mLocationService = new LocationService(getApplicationContext());

        SDKInitializer.initialize(getApplicationContext());
    }

    public LocationService getLocationService() {
        return mLocationService;
    }
}
