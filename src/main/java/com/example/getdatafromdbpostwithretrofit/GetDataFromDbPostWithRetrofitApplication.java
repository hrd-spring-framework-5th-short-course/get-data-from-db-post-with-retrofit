package com.example.getdatafromdbpostwithretrofit;

import com.example.getdatafromdbpostwithretrofit.models.Author;
import com.example.getdatafromdbpostwithretrofit.models.Category;
import com.example.getdatafromdbpostwithretrofit.response.ResponseCustom;
import com.example.getdatafromdbpostwithretrofit.services.AuthorServiceImpl;
import com.example.getdatafromdbpostwithretrofit.services.BookServiceImpl;
import com.example.getdatafromdbpostwithretrofit.services.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class GetDataFromDbPostWithRetrofitApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(GetDataFromDbPostWithRetrofitApplication.class, args);
	}

	@Autowired
	private AuthorServiceImpl authorService;

	@Autowired
	private CategoryServiceImpl categoryService;

	@Autowired
	private BookServiceImpl bookService;

	@Override
	public void run(ApplicationArguments args) throws Exception {


		System.out.println(this.authorService.getAllAuthor().body());


		System.out.println(this.bookService.getAllBook().body());


		ResponseCustom<List<Author>> responseCustom = this.authorService.getAllAuthor2().body();

		System.out.println(responseCustom.getMessage());

		responseCustom.getT().forEach(System.out::println);

		this.bookService.getAllBook2().body().getT().forEach(System.out::println);

//		Category category = new Category("Cate name from retrofit!");
//		System.out.println(this.categoryService.saveCate(category).body());

		Category category1 = this.categoryService.getOneCategoryById(1);

		this.categoryService.saveCate(category1);
	}
}
