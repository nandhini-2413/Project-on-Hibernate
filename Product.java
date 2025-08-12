package com.flipkart.Flipkart;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;

	@Entity

	@Table(name ="productinfo")



	public class Product {

		//fields

		@Id

		@GeneratedValue(strategy=GenerationType.AUTO)

		@Column(name="Product_id")

		private int pid;

		@Column(name="Product_name")

		private String pname;

		private int price;

		//Constructor

		public Product(int pid, String pname, int price) {

			super();

			this.pid = pid;

			this.pname = pname;

			this.price = price;

		}

		public int getPid() {

			return pid;

		}

		public void setPid(int pid) {

			this.pid = pid;

		}

		public String getPname() {

			return pname;

		}

		public void setPname(String pname) {

			this.pname = pname;

		}

		public int getPrice() {

			return price;

		}

		public void setPrice(int price) {

			this.price = price;

		}

		



	}




