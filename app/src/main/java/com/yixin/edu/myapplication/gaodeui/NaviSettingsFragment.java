package com.yixin.edu.myapplication.gaodeui;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.yixin.edu.myapplication.R;

/**
 * Created by Administrator on 2019/4/22/022.
 */

public class NaviSettingsFragment extends PreferenceFragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.navi_setting_activity_pref);

    }
}
