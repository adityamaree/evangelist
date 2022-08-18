package com.fis.bookservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Component
@Entity(name = "book")
public class Books {
	@Id
	@Column(name="BOOK_ID")
	private String bookId;
	
	@Column(name ="BOOK_NAME")
	private String name;
	
	@Column(name = "AUTHOR")
	private String author;
	
	@Column(name = "AVAILABLE_COPIES")
	private Integer copiesAvailable;
	
	@Column(name="TOTAL_COPIES")
	private Integer totalCopies;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public Books(String bookId, String name, String author, Integer copiesAvailable, Integer totalCopies) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.copiesAvailable = copiesAvailable;
		this.totalCopies = totalCopies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getCopiesAvailable() {
		return copiesAvailable;
	}

	public void setCopiesAvailable(Integer copiesAvailable) {
		this.copiesAvailable = copiesAvailable;
	}

	public Integer getTotalCopies() {
		return totalCopies;
	}

	public void setTotalCopies(Integer totalCopies) {
		this.totalCopies = totalCopies;
	}

}
