package com.example.dmitr.testapp.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by 123 on 04.02.2018.
 */
@Dao
public interface DrugDao {
    @Query("SELECT * FROM drug")
    List<Drug> getAll();

    @Query("SELECT * FROM drug WHERE uid IN (:userIds)")
    List<Drug> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM drug WHERE first_name LIKE :first AND "
            + "last_name LIKE :last LIMIT 1")
    Drug findByName(String first, String last);

    @Insert
    void insertAll(Drug... users);

    @Delete
    void delete(Drug user);
}