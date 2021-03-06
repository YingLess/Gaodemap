package com.yixin.edu.myapplication.gaode;

/**
 * Created by Administrator on 2019/4/22/022.
 */

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

/**
 * DAO for table "POI_SEARCH_TIP".
 */
public class PoiSearchTipDao extends AbstractDao<PoiSearchTip, Void> {

    public static final String TABLENAME = "POI_SEARCH_TIP";

    /**
     * Properties of entity PoiSearchTip.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Name = new Property(0, String.class, "name", false, "NAME");
        public final static Property District = new Property(1, String.class, "district", false, "DISTRICT");
        public final static Property Adcode = new Property(2, String.class, "adcode", false, "ADCODE");
    };


    public PoiSearchTipDao(DaoConfig config) {
        super(config);
    }

    public PoiSearchTipDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"POI_SEARCH_TIP\" (" + //
                "\"NAME\" TEXT," + // 0: name
                "\"DISTRICT\" TEXT," + // 1: district
                "\"ADCODE\" TEXT);"); // 2: adcode
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"POI_SEARCH_TIP\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, PoiSearchTip entity) {
        stmt.clearBindings();

        String name = entity.getName();
        if (name != null) {
            stmt.bindString(1, name);
        }

        String district = entity.getDistrict();
        if (district != null) {
            stmt.bindString(2, district);
        }

        String adcode = entity.getAdcode();
        if (adcode != null) {
            stmt.bindString(3, adcode);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }

    /** @inheritdoc */
    @Override
    public PoiSearchTip readEntity(Cursor cursor, int offset) {
        PoiSearchTip entity = new PoiSearchTip( //
                cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // name
                cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // district
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // adcode
        );
        return entity;
    }

    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, PoiSearchTip entity, int offset) {
        entity.setName(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setDistrict(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAdcode(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
    }

    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(PoiSearchTip entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }

    /** @inheritdoc */
    @Override
    public Void getKey(PoiSearchTip entity) {
        return null;
    }

    /** @inheritdoc */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

}
