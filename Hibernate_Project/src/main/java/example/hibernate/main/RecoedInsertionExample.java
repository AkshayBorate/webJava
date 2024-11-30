package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import example.hibernate.entity.Movie;

public class RecoedInsertionExample {
	public static void main(String[] args) {
		// Configure Hibernate using "Configuration class;
		Configuration conf = new Configuration();
		conf = conf.configure();

		// Obtain a session fatory using "Configuration class
		SessionFactory factory = conf.buildSessionFactory();

		// Obtain a session using sessionFactory
		Session currsession = factory.openSession();

		// Create an entity
		Movie movieobj = new Movie("M02", "Singhum Again", "Action", 2024);

		// Obtain a transaction and start the same
		Transaction tx = currsession.beginTransaction();

		// Store the entiti class object using session
		currsession.persist(movieobj);

		// Commit the transaction
		tx.commit();

		// Close the session
		currsession.close();

		// Close the factory
		factory.close();
		
		System.out.println("Movie Added");
	}
}
