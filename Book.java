package com.bookinfo.Bookinfo;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

	@Entity

	@Table(name = "bookinfo")

	public class Book {

		@Id

	    @GeneratedValue(strategy = GenerationType.AUTO)

	    @Column(name = "Book_id")

	   private int bid;

		@Column(name = "Book_name")

	   private String bname;

		@Column(name = "Book_price")

	   private int price;

		// No-argument constructor (Required by JPA)

	    public Book() {

	    }

	    //paramarized constructor

	   public Book(int bid, String bname, int price) {

		super();

		this.bid = bid;

		this.bname = bname;

		this.price = price;

	   }

	   public int getBid() {

		return bid;

	   }

	   public void setBid(int bid) {

		this.bid = bid;

	   }

	   public String getBname() {

		return bname;

	   }

	   public void setBname(String bname) {

		this.bname = bname;

	   }

	   public int getPrice() {

		return price;

	   }

	   public void setPrice(int price) {

		this.price = price;

	   }

	   @Override

	   public String toString() {

		return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + "]";

	   }

	   

	}




