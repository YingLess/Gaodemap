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
 * DAO for table "BJCAMERA".
 */
public class BJCameraDao extends AbstractDao<BJCamera, Long> {

    public static final String TABLENAME = "BJCAMERA";

    /**
     * Properties of entity BJCamera.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Address = new Property(2, String.class, "address", false, "ADDRESS");
        public final static Property Latitude = new Property(3, Double.class, "latitude", false, "LATITUDE");
        public final static Property Longtitude = new Property(4, Double.class, "longtitude", false, "LONGTITUDE");
        public final static Property Direction = new Property(5, String.class, "direction", false, "DIRECTION");
    };


    public BJCameraDao(DaoConfig config) {
        super(config);
    }

    public BJCameraDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BJCAMERA\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"NAME\" TEXT NOT NULL ," + // 1: name
                "\"ADDRESS\" TEXT," + // 2: address
                "\"LATITUDE\" REAL," + // 3: latitude
                "\"LONGTITUDE\" REAL," + // 4: longtitude
                "\"DIRECTION\" TEXT);"); // 5: direction
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BJCAMERA\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, BJCamera entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getName());

        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(3, address);
        }

        Double latitude = entity.getLatitude();
        if (latitude != null) {
            stmt.bindDouble(4, latitude);
        }

        Double longtitude = entity.getLongtitude();
        if (longtitude != null) {
            stmt.bindDouble(5, longtitude);
        }

        String direction = entity.getDirection();
        if (direction != null) {
            stmt.bindString(6, direction);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    /** @inheritdoc */
    @Override
    public BJCamera readEntity(Cursor cursor, int offset) {
        BJCamera entity = new BJCamera( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.getString(offset + 1), // name
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // address
                cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3), // latitude
                cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // longtitude
                cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // direction
        );
        return entity;
    }

    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, BJCamera entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.getString(offset + 1));
        entity.setAddress(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLatitude(cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3));
        entity.setLongtitude(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setDirection(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
    }

    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(BJCamera entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    /** @inheritdoc */
    @Override
    public Long getKey(BJCamera entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

}