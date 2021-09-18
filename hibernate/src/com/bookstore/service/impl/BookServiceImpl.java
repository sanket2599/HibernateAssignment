package com.bookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.domain.Book;
import com.bookstore.persistant.dao.BookDao;
import com.bookstore.service.BookService;
@Service(value = "bookService")
@Transactional
public class BookServiceImpl implements BookService {
	BookDao bookDao;
	
	
	@Autowired
	public BookServiceImpl(BookDao bookDao) {
		super();
		this.bookDao = bookDao;
	}

	@Override
	public void persistObjectGraph(Book book) {
		// TODO Auto-generated method stub
		bookDao.persistObjectGraph(book);

	}

	@Override
	public Book retrieveObjectGraph(String isbn) {
		// TODO Auto-generated method stub
		return bookDao.retrieveObjectGraph(isbn);
	}

}
