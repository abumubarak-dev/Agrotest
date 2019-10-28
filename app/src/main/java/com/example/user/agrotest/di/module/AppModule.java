package com.example.user.agrotest.di.module;


import com.example.user.agrotest.model.ApiEndPoint;
import com.example.user.agrotest.model.Repositry;
import com.example.user.agrotest.model.db.FarmersRecordDao;

import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class AppModule {

    @Provides
    @Singleton
    public Retrofit getRerofit(){
      return new Retrofit.Builder()
                .baseUrl("http://theagromall.com/api/v2/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    @Provides
    @Singleton
    public ApiEndPoint getApiEndPoint(Retrofit retrofit){
        return retrofit.create(ApiEndPoint.class);
    }

    @Provides
    @Singleton
    public Executor executor(){
        return Executors.newFixedThreadPool(2);
    }

}
