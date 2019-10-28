package com.example.user.agrotest.di.componet;


import com.example.user.agrotest.di.module.AppModule;
import com.example.user.agrotest.di.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    NetComponent appComponent(NetworkModule networkModule);

}
