package com.yixin.edu.myapplication.gaode;

import android.content.Context;

import com.amap.api.services.core.PoiItem;

import java.util.List;

/**
 * Created by Administrator on 2019/4/23/023.
 */

public class SearchMapsPresenter implements SearchMapsInteractor.OnPoiSearchFinishedListener {


    private ISearchMapsView mSearchMapsView;
    private SearchMapsInteractor mSearchInteractor;


    public SearchMapsPresenter(ISearchMapsView searchMapsView) {
        this.mSearchMapsView = searchMapsView;
        this.mSearchInteractor = new SearchMapsInteractorImpl();
    }

    public void openDrawer() {
        mSearchMapsView.openDrawer();
    }

    public void closeDrawer() {
        mSearchMapsView.closeDrawer();
    }

    public void enterSearch() {
        mSearchMapsView.enterSearch();
    }


    public void exitSearch() {
        mSearchMapsView.exitSearch();
    }

    public void searchPoi(Context context, String keyWord, String city) {
        mSearchMapsView.showSearchProgress();
        mSearchInteractor.poiSearch(context, keyWord, city, this);
    }

    @Override
    public void onPoiSearchFinished(List<PoiItem> poiItems) {
        mSearchMapsView.hideSearchProgress();
        mSearchMapsView.showSearchResult(poiItems);
    }

    public void showPoiFloatWindow(PoiItem poiItem) {
        mSearchMapsView.showPoiFloatWindow(poiItem);
    }
}
