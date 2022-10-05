package com.myagizoral.everythingjavaapp.Services;

import com.myagizoral.everythingjavaapp.Models.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")

    Call<List<CryptoModel>> getData();


}
