package com.example.user.agrotest.di.module;

import android.content.Context;


import com.example.user.agrotest.di.PerActivity;
import com.example.user.agrotest.model.ApiEndPoint;
import com.example.user.agrotest.model.Repositry;
import com.example.user.agrotest.model.db.AppDatabase;
import com.example.user.agrotest.model.db.FarmersRecordDao;

import java.util.Date;
import java.util.concurrent.Executor;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.room.Room;
import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;


@Module
public class NetworkModule {

    Context context;

    public NetworkModule(Context context) {
        this.context=context;
    }

    @Provides
    @PerActivity
    public AppDatabase appDatabase(){
        return Room.databaseBuilder(context.getApplicationContext(),
                AppDatabase.class,"famersrecord.db")
                .build();
    }

    @Provides
    @PerActivity
    public FarmersRecordDao postDao(AppDatabase appDatabase){
        return appDatabase.farmersRecordDao();
    }

    @Provides
    @PerActivity
    public Repositry repositry(FarmersRecordDao farmersRecordDao,Executor
            executor, ApiEndPoint apiEndPoint){
        return new Repositry(farmersRecordDao,executor,apiEndPoint);
    }

    @Provides
    @PerActivity
    public CompositeDisposable compositeDisposable(){
        return new CompositeDisposable();
    }

    @Provides
    @PerActivity
     public LinearLayoutManager linearLayoutManager(){
        return new LinearLayoutManager(context);
    }

   }
