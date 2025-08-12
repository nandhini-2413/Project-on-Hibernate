package com.bookinfo.Bookinfo;


	import java.util.Properties;

	import org.hibernate.SessionFactory;

	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

	import org.hibernate.cfg.Configuration;



	public class HibernateCONF {

		

		private static SessionFactory factory;

		

		public static SessionFactory getSessionFactory()

		{

			try {



	// To configure 

			Configuration cnf = new Configuration();

			Properties p = new Properties();

			// Configure database details

			cnf.setProperty("hibernate.connection.driver_class", 

					"com.mysql.cj.jdbc.Driver");

	        cnf.setProperty("hibernate.connection.url",

	        		"jdbc:mysql://localhost:3306/flipkart");

	        cnf.setProperty("hibernate.connection.username", 

	        		"root");

	cnf.setProperty("hibernate.connection.password",

	        		"root");

	        // Hibernate details

	        cnf.setProperty("hibernate.dialect", 

	        		"org.hibernate.dialect.MySQL8Dialect");

	        cnf.setProperty("hibernate.hbm2ddl.auto",

	        		"update");

	        cnf.setProperty("hibernate.show_sql", "true");

	        cnf.addAnnotatedClass(Book.class);

	return cnf.buildSessionFactory(

	            new StandardServiceRegistryBuilder().applySettings(cnf.getProperties()).build()

	        );

	    } catch (Throwable ex) {

	        throw new ExceptionInInitializerError("Initial SessionFactory creation failed: " + ex);

	    }	

		}

	}






