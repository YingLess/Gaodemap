package com.yixin.edu.myapplication.gaode;

import android.util.Log;

import com.amap.api.navi.AMapNaviListener;
import com.amap.api.navi.model.AMapNaviInfo;
import com.amap.api.navi.model.AMapNaviLocation;
import com.amap.api.navi.model.NaviInfo;

import static android.content.ContentValues.TAG;

/**
 * Created by Administrator on 2019/4/22/022.
 */

public abstract class NaviRouteListener implements AMapNaviListener {

    public abstract void onRouteSuccess();
    public abstract void onRouteFailed();


    @Override
    public void onInitNaviFailure() {

    }

    @Override
    public void onInitNaviSuccess() {

    }

    @Override
    public void onStartNavi(int i) {

    }

    @Override
    public void onTrafficStatusUpdate() {

    }

    @Override
    public void onLocationChange(AMapNaviLocation aMapNaviLocation) {

    }

    @Override
    public void onGetNavigationText(int i, String s) {

    }

    @Override
    public void onEndEmulatorNavi() {

    }

    @Override
    public void onArriveDestination() {
        onRouteSuccess();
//        aaa
//        Log.e(TAG, "到达目的地");
    }

    @Override
    public void onCalculateRouteSuccess() {
        onRouteSuccess();
    }

    @Override
    public void onCalculateRouteFailure(int i) {
        onRouteFailed();
    }

    @Override
    public void onReCalculateRouteForYaw() {

    }

    @Override
    public void onReCalculateRouteForTrafficJam() {

    }

    @Override
    public void onArrivedWayPoint(int i) {

    }

    @Override
    public void onGpsOpenStatus(boolean b) {

    }

    @Override
    public void onNaviInfoUpdated(AMapNaviInfo aMapNaviInfo) {

    }

    @Override
    public void onNaviInfoUpdate(NaviInfo naviInfo) {

    }
}
