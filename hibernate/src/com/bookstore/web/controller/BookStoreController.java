package com.bookstore.web.controller;

import java.util.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.bookstore.config.AppConfig;
import com.bookstore.domain.Book;
import com.bookstore.domain.Chapter;
import com.bookstore.domain.ChapterPK;
import com.bookstore.domain.Publisher;
import com.bookstore.service.BookService;

@Controller
public class BookStoreController {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		BookService bookService=ac.getBean("bookService",BookService.class);
		Book book = new Book("1", "Harry Potter" );
		Publisher publisher = new Publisher("ABC", "Jk Rowling");
		book.setPublisherCode(publisher);
		int count = 0;
		List<ChapterPK> chapterPk = new ArrayList<>();
		chapterPk.add(new ChapterPK(book.getIsbn(), count));
		List<Chapter> chapter = new ArrayList<>();
		chapter.add(new Chapter(chapterPk.get(count++),"The Boy Who Lived"));
		

		chapterPk.add(new ChapterPK(book.getIsbn(), count));
		chapter.add(new Chapter(chapterPk.get(count++),"The Vanishing Glass"));
		
		chapterPk.add(new ChapterPK(book.getIsbn(), count));
		chapter.add(new Chapter(chapterPk.get(count++),"The Letters from No One"));
		
		chapterPk.add(new ChapterPK(book.getIsbn(), count));
		chapter.add(new Chapter(chapterPk.get(count++),"The Keeper of Keys"));
		
		chapterPk.add(new ChapterPK(book.getIsbn(), count));
		chapter.add(new Chapter(chapterPk.get(count++),"Diagon Alley"));
		
		book.setChapters(chapter);
		
		bookService.persistObjectGraph(book);
		
		System.out.println(bookService.retrieveObjectGraph("1"));
	}

}
