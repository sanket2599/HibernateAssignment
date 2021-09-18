package com.bookstore.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table//(name = "chapter")
public class Chapter implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3161146984865936553L;
	@Id
	private ChapterPK chapterPK;
	//@Column(name = "title")
	private String title;
	
	public Chapter() {}

	public Chapter(ChapterPK chapterPK, String title) {
		super();
		this.chapterPK = chapterPK;
		this.title = title;
	}

	public ChapterPK getChapterPK() {
		return chapterPK;
	}

	public void setChapterPK(ChapterPK chapterPK) {
		this.chapterPK = chapterPK;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Chapter [chapterPK=" + chapterPK + ", title=" + title + "]";
	}	
	
}














