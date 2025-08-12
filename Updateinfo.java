package com.bookinfo.Bookinfo;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;

	public class Updateinfo{

	    public static void main(String[] args) {
	        
	        // Get SessionFactory object
	        SessionFactory factory = 
	        		HibernateCONF.getSessionFactory();
	// Open session
	        Session ses = factory.openSession();
	        
	        // Start transaction
	        Transaction tx = ses.beginTransaction();
	        
	        // To update
	        Book b = new Book();
	        b.setBid(3);
	        b.setBname("The end of us");
	        b.setPrice(1200);
	        ses.update(b);
	        // Commit transaction
	        tx.commit();
	        
	        // Close session and factory
	        ses.close();
	        factory.close();
	    }
	}



