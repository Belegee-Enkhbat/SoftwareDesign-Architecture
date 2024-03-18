package com.example.BookModule.BookController;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookModule.model.Book;

@RestController
@RequestMapping("v1/book")
  
public class BookController {
	   List<Book> books = new ArrayList<>();
	   
		 @GetMapping("/books")
		    public List<Book> getBook()
		    {
			 books = Arrays.asList(new Book(1, "Уран зохиол", 10000),
		         new Book(2, "Шилдэг зохиолууд", 12000),
		         new Book(3, "Монголын нууц товчоо", 24000),
		         new Book(4, "Нарны өнгө", 6000),
		         new Book(5, "Гэмт хэргийн дууль", 23000));
	             return books;
	         }
		        
		    @GetMapping("/book/{id}")
		    @ResponseBody
		    public Book getByidBook(@PathVariable String id)
		    {
		        books = getBook();
		        Book book =  books.stream()
		                .filter(f-> f.getId() == Integer.parseInt(id))
		                .findAny()
		                .orElse(null);
		        return book;
		    }
	

}