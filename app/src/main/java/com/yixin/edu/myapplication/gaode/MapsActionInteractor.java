package com.yixin.edu.myapplication.gaode;

/**
 * Created by Administrator on 2019/4/23/023.
 */

public interface MapsActionInteractor {
    interface OnMyLocationModeChangedListener {
        void onMyLocationModeChanged(int mode);
        void onStopFollowMode();
    }

    void changeMyLocationMode(OnMyLocationModeChangedListener listener);

    void stopFollowMode(OnMyLocationModeChangedListener listener);
}

