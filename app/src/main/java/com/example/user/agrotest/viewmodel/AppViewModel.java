package com.example.user.agrotest.viewmodel;

import com.example.user.agrotest.model.Records;
import com.example.user.agrotest.model.Repositry;
import com.example.user.agrotest.model.db.FarmersBean;

import java.util.List;

import javax.inject.Inject;

import androidx.lifecycle.ViewModel;
import io.reactivex.Flowable;

public class AppViewModel extends ViewModel {

    private Repositry repository;

    @Inject
    public AppViewModel(Repositry repository) {
        this.repository = repository;
    }

    public Flowable<List<FarmersBean>> getDataFromDatabase(){
        return repository.getDataFromDatabase();
    }

    public Flowable<FarmersBean> getSingleFarmer(int userid){
        return repository.getSingleFarmer(userid);
    }
    public void insert(){
       repository.insertData();
    }

    public void updateFarmerData(final String firstName, final String middleName, final String address, final int id){
       repository.updateFarmerData(firstName, middleName, address,id);
    }

}
