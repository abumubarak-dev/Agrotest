package com.example.user.agrotest.model.db;



import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = FarmersBean.class,version = 1)
@TypeConverters(DateConverter.class)
public abstract class AppDatabase extends RoomDatabase {

    public abstract FarmersRecordDao farmersRecordDao();


}
