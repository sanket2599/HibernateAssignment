package com.bookstore.domain;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table//(name = "publisher")
public class Publisher {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@OneToMany(fetch = FetchType.LAZY,mappedBy = "publisher")
	//@Column(name="code",nullable = false)
	private String code;
	//@Column(name = "publisher_name")
	private String name;
	//@OneToMany(mappedBy = "publisher")
	//private List<Book> book=new ArrayList<Book>();

	public Publisher() {}	
	public Publisher(String code, String name) {
		this.code = code;
		this.name = name;
	}

	/*
	 * public List<Book> getBook() { return book; } public void setBooks(List<Book>
	 * book) { this.book = book; }
	 */
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Publisher [code=" + code + ", name=" + name + "]";//, book=" + book + "]";
	}
	
	
}














