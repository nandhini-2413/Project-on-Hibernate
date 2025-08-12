package com.bookinfo.Bookinfo;



	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	public class Select {


	    public static void main(String[] args) {
	        
	        // Get SessionFactory object
	        SessionFactory factory = 
	        		HibernateCONF.getSessionFactory();

	// Open session
	        Session ses = factory.openSession();
	        
	        // Start transaction
	        Transaction tx = ses.beginTransaction();
	        
	        // To select
	        //Book b = new Book();
	       //ses.load(b, 3);//load get
	        //Another model
	        Book b = ses.get(Book.class, 3);
	      System.out.println("b");
	        // Commit transaction
	        tx.commit();
	        
	        // Close session and factory
	        ses.close();
	        factory.close();
	    }
	}





