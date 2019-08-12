package com.example.getdatafromdbpostwithretrofit.repositories;


import com.example.getdatafromdbpostwithretrofit.models.Category;
import com.example.getdatafromdbpostwithretrofit.response.ResponseSaveCate;
import org.apache.ibatis.annotations.Select;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.List;

public interface CategoryRepository {

    @POST("/api/v1/categories")
    Call<ResponseSaveCate> addCategory(@Body Category category);

}
