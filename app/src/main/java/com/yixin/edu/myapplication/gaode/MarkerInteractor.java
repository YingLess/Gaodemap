package com.yixin.edu.myapplication.gaode;

import com.amap.api.maps.model.MarkerOptions;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/22/022.
 */

public interface MarkerInteractor {

    interface OnMarkerCreatedListener {
        void onMarkerCreated(ArrayList<MarkerOptions> markerOptions);
    }


    interface OnReadCamerasListener {
        void onReadCameras(ArrayList<BJCamera> cameraBeans);
    }

    void createMarkers(OnMarkerCreatedListener listener);

    void readCameras(OnReadCamerasListener listener);

}
