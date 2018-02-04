package com.example.dmitr.testapp.data;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

/**
 * Created by 123 on 04.02.2018.
 */
public class DateConverter {
    @TypeConverter
    public static Date toDate(Long timestamp) {
        return timestamp == null ? null : new Date(timestamp);
    }

    @TypeConverter
    public static Long toTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
}