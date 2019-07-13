package com.responsi.mvp.service;



import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataApi {
    @GET("people")
    Call<DataService> fetchPeople(
            @Query("results") int page,
            @Query("nat") String nat
    );
}
