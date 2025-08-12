package com.bookinfo.Bookinfo;


	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	public class DeleteOperation {


	    public static void main(String[] args) {
	        
	        // Get SessionFactory object
	        SessionFactory factory = 
	        		HibernateCONF.getSessionFactory();

	// Open session
	        Session ses = factory.openSession();
	        
	        // Start transaction
	        Transaction tx = ses.beginTransaction();
	        
	        // To delete 
	        Book b = new Book();
	        b.setBid(2);
	        ses.delete(b);
	        // Commit transaction
	        tx.commit();
	        
	        // Close session and factory
	        ses.close();
	        factory.close();
	    }
	}


