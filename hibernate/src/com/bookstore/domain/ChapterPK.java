package com.bookstore.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
@Embeddable
public class ChapterPK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//@ManyToOne(cascade = CascadeType.ALL,targetEntity = Book.class) --> Embeddded mein ManyToOne nahi lagana hota
	//@Column(name = "book_isbn")
	private String bookIsbn;
	//@Column(name = "chapter_num")
	private Integer chapterNumber;
	
	public ChapterPK() {}	
	

	public ChapterPK(String book, Integer chapterNumber) {
		super();
		this.bookIsbn = book;
		
		this.chapterNumber = chapterNumber;
	}
	
	
	public String getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public Integer getChapterNumber() {
		return chapterNumber;
	}
	public void setChapterNumber(Integer chapterNumber) {
		this.chapterNumber = chapterNumber;
	}
	@Override
	public String toString() {
		return "ChapterPK [bookIsbn=" + bookIsbn + ", chapterNumber=" + chapterNumber + "]";
	}
	

}














