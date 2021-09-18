package com.bookstore.service;

import java.util.List;

import com.bookstore.domain.Book;

public interface BookService {
	void persistObjectGraph(Book book);
	Book retrieveObjectGraph(String isbn);
}
