package com.example.getdatafromdbpostwithretrofit.repositories;


import com.example.getdatafromdbpostwithretrofit.models.Author;
import com.example.getdatafromdbpostwithretrofit.response.ResponseCustom;
import com.google.gson.JsonElement;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface AuthorRepository {


    @GET("/api/v1/authors")
    Call<JsonElement> getAllAuthor();

    @GET("/api/v1/authors")
    Call<ResponseCustom<List<Author>>> getAllAuthor2();



}
