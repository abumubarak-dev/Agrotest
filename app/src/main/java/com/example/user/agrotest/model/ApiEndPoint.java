package com.example.user.agrotest.model;


import java.util.List;

import io.reactivex.Flowable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiEndPoint {

    @POST("get-sample-farmers")
    Call<Records> getPostCall();

}
