package com.yixin.edu.myapplication.gaode;

import com.amap.api.services.core.PoiItem;

import java.util.List;

/**
 * Created by Administrator on 2019/4/22/022.
 */

public interface ISearchMapsView {
    public void openDrawer();
    public void closeDrawer();

    public void enterSearch();
    public void exitSearch();

    public void showSearchResult(List<PoiItem> poiItems);
    public void showSearchProgress();
    public void hideSearchProgress();

    public void showPoiFloatWindow(PoiItem poiItem);
}
