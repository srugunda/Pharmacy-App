package com.solo.erispharmacyapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/jsonrepo/accounts.json")
    Call<List<Statement>> getStatements();
}
