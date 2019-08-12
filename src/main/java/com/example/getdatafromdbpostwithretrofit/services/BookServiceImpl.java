package com.example.getdatafromdbpostwithretrofit.services;

import com.example.getdatafromdbpostwithretrofit.models.Book;
import com.example.getdatafromdbpostwithretrofit.repositories.BookRepository;
import com.example.getdatafromdbpostwithretrofit.response.ResponseCustom;
import com.google.gson.JsonElement;
import org.springframework.stereotype.Service;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Service
public class BookServiceImpl {

    private BookRepository bookRepository;

    public BookServiceImpl(Retrofit retrofit) {
        this.bookRepository = retrofit.create(BookRepository.class);
    }


    public Response<JsonElement> getAllBook() throws IOException {
        return this.bookRepository.getAllBook().execute();
    }


    public Response<ResponseCustom<List<Book>>> getAllBook2() throws IOException {
        return this.bookRepository.getAllBook2().execute();
    }
}
