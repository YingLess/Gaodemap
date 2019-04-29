package com.yixin.edu.myapplication;

import android.app.Application;
import android.content.Context;

import com.amap.api.navi.AMapNavi;
import com.yixin.edu.myapplication.gaode.BJCamera;
import com.yixin.edu.myapplication.gaode.Constants;
import com.yixin.edu.myapplication.gaode.DaoMaster;
import com.yixin.edu.myapplication.gaode.DaoSession;
import com.yixin.edu.myapplication.gaode.FileUtils;
import com.yixin.edu.myapplication.gaode.JsonUtils;
import com.yixin.edu.myapplication.gaode.TTSController;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/22/022.
 */

public class MapsApplication extends Application {

    private static Context sContext;
    private static DaoMaster sDaoMaster;
    private static DaoSession sDaoSession;


    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
        TTSController ttsController = TTSController.getInstance(this.getApplicationContext());
        ttsController.init();

        AMapNavi navi = AMapNavi.getInstance(sContext);

        if (!FileUtils.readBooleanFromSharedPreference(Constants.PreferenceKeys.KEY_INIT, false)){
            ArrayList<BJCamera> cameraBeans = JsonUtils.prasePaperCameras(FileUtils.readStringFromAsset(MapsApplication.getAppContext(), "beijing_paper.json"));
            for (BJCamera camera: cameraBeans){
                getDaoSession().insert(camera);
            }
            FileUtils.writeBooleanToSharedPreference(Constants.PreferenceKeys.KEY_INIT,true);
        }

    }

    public static Context getAppContext() {
        return sContext;
    }

    public static DaoMaster getDaoMaster() {
        if (sDaoMaster == null) {
            DaoMaster.OpenHelper helper = new DaoMaster.DevOpenHelper(sContext, "maps.db", null);
            sDaoMaster = new DaoMaster(helper.getWritableDatabase());
        }
        return sDaoMaster;
    }

    public static DaoSession getDaoSession() {
        if (sDaoSession == null) {
            sDaoSession = getDaoMaster().newSession();
        }
        return sDaoSession;
    }

}