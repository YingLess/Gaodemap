package com.yixin.edu.myapplication.gaode;

import com.amap.api.maps.model.MarkerOptions;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/23/023.
 */

public interface IGaoDeMapsView {

    public void addMarker(MarkerOptions marker);

    public void addMarkers(ArrayList<MarkerOptions> markers);

    public void removeMarker(int markerId);

    public void changeMyLocationMode(int mode);

    public void stopFollowMode();

    public void changeMapStyle(int style);

}
