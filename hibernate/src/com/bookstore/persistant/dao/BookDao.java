package com.bookstore.persistant.dao;

import java.util.List;

import com.bookstore.domain.Book;

public interface BookDao {
	void persistObjectGraph(Book book);
	Book retrieveObjectGraph(String isbn);
}
