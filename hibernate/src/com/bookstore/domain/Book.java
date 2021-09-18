package com.bookstore.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table//(name = "book")
public class Book {
	@Id
	private String isbn;
	
	private String bookName;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Publisher publisherCode;
	@OneToMany(fetch = FetchType.EAGER)
	private List<Chapter> chapters;
	
	public Book() {}
	public Book(String isbn, String name, Publisher publisher) {
		this.isbn = isbn;
		this.bookName = name;
		this.publisherCode = publisher;
	}

	public Book(String isbn, String name) {
		super();
		this.isbn = isbn;
		this.bookName = name;
	}
	public Book(String isbn, String name, Publisher publisher, List<Chapter> chapters) {
		super();
		this.isbn = isbn;
		this.bookName = name;
		this.publisherCode = publisher;
		this.chapters = chapters;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public Publisher getPublisherCode() {
		return publisherCode;
	}
	public void setPublisherCode(Publisher publisherCode) {
		this.publisherCode = publisherCode;
	}
	public List<Chapter> getChapters() {
		return chapters;
	}
	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", publisherCode=" + publisherCode + ", chapters="
				+ chapters + "]";
	}
	

}












































