package com.yixin.edu.myapplication.gaode;

import android.content.Context;

import com.amap.api.services.core.PoiItem;

import java.util.List;

/**
 * Created by Administrator on 2019/4/23/023.
 */

public interface SearchMapsInteractor {

    interface OnPoiSearchFinishedListener{
        public void onPoiSearchFinished(List<PoiItem> poiItems);
    }
    public void poiSearch(Context context, String keyWord, String city, OnPoiSearchFinishedListener listener);


}

