package com.bookstore.persistant.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookstore.domain.Book;
import com.bookstore.domain.Chapter;
import com.bookstore.domain.Publisher;
import com.bookstore.persistant.dao.BookDao;
@Repository
public class BookDaoImpl implements BookDao {
	private SessionFactory sessionFactory;
	@Autowired
	public BookDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void persistObjectGraph(Book book) {
		// TODO Auto-generated method stub
		List<Chapter> chapter = book.getChapters();
		Publisher publisherCode = book.getPublisherCode();
		getSession().save(book);
		getSession().save(publisherCode);
		for(Chapter chap:chapter)
		getSession().save(chap);
		
	}
	@Override
	public Book retrieveObjectGraph(String isbn) {
		// TODO Auto-generated method stub
		Book book=getSession().get(Book.class,isbn);
		return book;
	}
	
}
