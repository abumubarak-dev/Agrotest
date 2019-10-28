package com.example.user.agrotest.di.componet;


import com.example.user.agrotest.di.PerActivity;
import com.example.user.agrotest.di.module.NetworkModule;
import com.example.user.agrotest.view.EditActivity;
import com.example.user.agrotest.view.MainActivity;

import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = NetworkModule.class)
public interface NetComponent {

    void inject(MainActivity mainActivity);
    void inject(EditActivity editActivity);


}
