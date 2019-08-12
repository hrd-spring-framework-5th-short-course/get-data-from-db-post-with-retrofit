package com.example.getdatafromdbpostwithretrofit.local_repositories;

import com.example.getdatafromdbpostwithretrofit.models.Category;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalDBCategoryRepository {

    // Get Data from our database using mybatis

    @Select("select * from tb_category")
    @Results({
            @Result(property = "createdAt", column = "created_at")
    })
    List<Category> getAllCategory();


    @Select("select * from tb_category_local where id=#{id}")
    Category getOneCategoryById(@Param("id") Integer id);

}
