package com.yixin.edu.myapplication.gaode;

/**
 * Created by Administrator on 2019/4/22/022.
 */

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

/**
 * {@inheritDoc}
 *
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig bJCameraDaoConfig;
    private final DaoConfig poiSearchTipDaoConfig;

    private final BJCameraDao bJCameraDao;
    private final PoiSearchTipDao poiSearchTipDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        bJCameraDaoConfig = daoConfigMap.get(BJCameraDao.class).clone();
        bJCameraDaoConfig.initIdentityScope(type);

        poiSearchTipDaoConfig = daoConfigMap.get(PoiSearchTipDao.class).clone();
        poiSearchTipDaoConfig.initIdentityScope(type);

        bJCameraDao = new BJCameraDao(bJCameraDaoConfig, this);
        poiSearchTipDao = new PoiSearchTipDao(poiSearchTipDaoConfig, this);

        registerDao(BJCamera.class, bJCameraDao);
        registerDao(PoiSearchTip.class, poiSearchTipDao);
    }

    public void clear() {
        bJCameraDaoConfig.getIdentityScope().clear();
        poiSearchTipDaoConfig.getIdentityScope().clear();
    }

    public BJCameraDao getBJCameraDao() {
        return bJCameraDao;
    }

    public PoiSearchTipDao getPoiSearchTipDao() {
        return poiSearchTipDao;
    }

}
