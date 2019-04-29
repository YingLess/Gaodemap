package com.yixin.edu.myapplication.gaode;

/**
 * Created by Administrator on 2019/4/23/023.
 */

public interface MapsPresenter {

    public void loadDefaultCameraMarkers();

    public void enableDefaultGeoFences();

    public void disableDefaultGeoFences();

    public void changeMyLocationMode();

    public void stopFollowMode();

}

