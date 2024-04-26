package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class StoreProcedureProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StoreProcedureProjectApplication.class, args);
	}
	private IbookService bs;
	
	@Autowired
    public void setBookService(IbookService bs) {
        this.bs = bs;
	}
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		int total=bs.getBookCount("Shakesphere");
		System.out.println(total);
		List<Book> book=bs.getbooksbyAuthor("Shakesphere");
		System.out.println(book);
		total=bs.getCountBook("Shakesphere");
		System.out.println(total);
		total=bs.getCount("Shakesphere");
		System.out.println(total);
		List<Book> books=bs.getBookByAuthor("Shakesphere");
		books.forEach(System.out::println);
		
	}

}
