package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateUtilities;


public class RecoedInsertedWithoutXMLExample {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtilities.getSessionFactory();
				Session session = factory.openSession()) {
			Actor actorobj = new Actor("A03", "Ranveer", "Singh", 39);
			Transaction tx = session.beginTransaction();
			session.persist(actorobj);
			tx.commit();
			System.out.println("Actor added");
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
