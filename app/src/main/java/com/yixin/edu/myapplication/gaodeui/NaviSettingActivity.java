package com.yixin.edu.myapplication.gaodeui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.yixin.edu.myapplication.R;

//设置界面
public class NaviSettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi_setting);
        if (savedInstanceState == null){
            getFragmentManager().beginTransaction().replace(R.id.navi_setting_frame, new NaviSettingsFragment()).commit();
        }

        ImageView mBackView = (ImageView) findViewById(R.id.setting_back_image);
        mBackView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
