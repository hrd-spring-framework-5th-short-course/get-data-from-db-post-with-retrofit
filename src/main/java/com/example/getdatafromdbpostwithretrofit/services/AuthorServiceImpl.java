package com.example.getdatafromdbpostwithretrofit.services;

import com.example.getdatafromdbpostwithretrofit.models.Author;
import com.example.getdatafromdbpostwithretrofit.repositories.AuthorRepository;
import com.example.getdatafromdbpostwithretrofit.response.ResponseCustom;
import com.google.gson.JsonElement;
import org.springframework.stereotype.Service;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Service
public class AuthorServiceImpl {


    private AuthorRepository authorRepository;

    public AuthorServiceImpl(Retrofit retrofit) {
        this.authorRepository = retrofit.create(AuthorRepository.class);
    }



    public Response<JsonElement> getAllAuthor() throws IOException {
        return this.authorRepository.getAllAuthor().execute();
    }

    public Response<ResponseCustom<List<Author>>> getAllAuthor2() throws IOException {
        return this.authorRepository.getAllAuthor2().execute();
    }
}
