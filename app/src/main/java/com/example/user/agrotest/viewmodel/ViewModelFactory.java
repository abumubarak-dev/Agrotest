package com.example.user.agrotest.viewmodel;

import com.example.user.agrotest.di.PerActivity;
import com.example.user.agrotest.model.Repositry;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.annotation.NonNull;


import javax.inject.Inject;

/*This class  is for dagger to work with viewmodel*/
@PerActivity
public class ViewModelFactory implements ViewModelProvider.Factory{

    @Inject
    Repositry repository;

    @Inject
    public ViewModelFactory() {

    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(AppViewModel.class)) {
            return (T) new AppViewModel(repository);
        }
        throw new IllegalArgumentException("Wrong ViewModel class");
    }

}
