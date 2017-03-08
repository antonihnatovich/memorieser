package com.example.yoant.memorieser.sqlite.helper;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String LOG = "DatabaseHelper";

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "countriesManager";

    private static final String TABLE_COUNTRY_SUMMARY = "country_summary";
    private static final String TABLE_COUNTRY_PHOTOS = "country_photos";
    private static final String TABLE_COUNTRY_CONTINENT = "country_continent";

    private static final String KEY_ID = "id";
    private static final String KEY_CREATED_AT = "created_at";

    private static final String KEY_COUNTRY_NAME = "country_name";
    private static final String KEY_COUNTRY_RATE = "country_rate";
    private static final String KEY_COUNTRY_URL = "country_url";
    private static final String KEY_COUNTRY_CONTINENT = "country_continent";

    private static final String KEY_CONTINENT_NAME = "continent_name";
    private static final String KEY_CONTINENT_URL = "continent_url";

    private static final String KEY_COUNTRY_ID = "country_id";
    private static final String KEY_COUNTRY_PHOTO_URL = "country_photo";
    








    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
