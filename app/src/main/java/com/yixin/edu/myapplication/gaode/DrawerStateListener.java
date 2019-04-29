package com.yixin.edu.myapplication.gaode;

import android.view.View;

/**
 * Created by Administrator on 2019/4/22/022.
 */

public interface DrawerStateListener {
    public void onDrawerSlide(View drawerView, float slideOffset);

    public void onDrawerOpened(View drawerView);

    public void onDrawerClosed(View drawerView);

    public void onDrawerStateChanged(int newState);
}
