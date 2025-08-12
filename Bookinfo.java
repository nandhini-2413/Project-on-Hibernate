package com.bookinfo.Bookinfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Bookinfo {

	 

		public static void main(String[] args) {

			// Get Factory object

			SessionFactory factory = HibernateCONF.getSessionFactory();

			// Session Object

			Session ses = factory.openSession();

			//Transaction Management

			Transaction tx=ses.beginTransaction();

			//Create Product object

			Book p = new Book(1,"Chemistry",500);

			//To insert 

			ses.save(p);

			tx.commit();

			//Close object

			ses.close();

			factory.close();

		}

	}




