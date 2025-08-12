package com.flipkart.Flipkart;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InsertOperation {



		public static void main(String[] args) {

			//Get Factory Object

			SessionFactory factory=

					HibernateCONF.getSessionFactory();

			//Session Factory

			Session ses=factory.openSession();

			//Transaction Management

			Transaction tx=ses.beginTransaction();

			//Create product object

			Product p=new Product(1001,"Samsung",16000);

			//To insert

			ses.save(p);

			tx.commit();

			//Close object

			ses.close();

			factory.close();

		}



	}




