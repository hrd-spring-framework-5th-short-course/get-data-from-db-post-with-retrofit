package com.example.getdatafromdbpostwithretrofit.services;

import com.example.getdatafromdbpostwithretrofit.local_repositories.LocalDBCategoryRepository;
import com.example.getdatafromdbpostwithretrofit.models.Category;
import com.example.getdatafromdbpostwithretrofit.repositories.CategoryRepository;
import com.example.getdatafromdbpostwithretrofit.response.ResponseSaveCate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Service
public class CategoryServiceImpl {

    private CategoryRepository categoryRepository;

    @Autowired
    private LocalDBCategoryRepository dbCategoryRepository;

    public CategoryServiceImpl(Retrofit retrofit) {
        this.categoryRepository = retrofit.create(CategoryRepository.class);
    }

    public Response<ResponseSaveCate> saveCate(Category category) throws IOException {

        return this.categoryRepository.addCategory(category).execute();
    }


    public List<Category> getAllCategory(){

        List<Category> categories = this.dbCategoryRepository.getAllCategory();

        System.out.println(categories);

        return categories;
    }

    public Category getOneCategoryById(Integer id){

        Category category = this.dbCategoryRepository.getOneCategoryById(id);

        System.out.println(category);

        return category;
    }
}
