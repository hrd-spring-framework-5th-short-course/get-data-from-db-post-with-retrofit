package com.example.getdatafromdbpostwithretrofit.repositories;

import com.example.getdatafromdbpostwithretrofit.models.Book;
import com.example.getdatafromdbpostwithretrofit.response.ResponseCustom;
import com.google.gson.JsonElement;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface BookRepository {

    @GET("/api/v1/books")
    Call<JsonElement> getAllBook();


    @GET("/api/v1/books")
    Call<ResponseCustom<List<Book>>> getAllBook2();
}
