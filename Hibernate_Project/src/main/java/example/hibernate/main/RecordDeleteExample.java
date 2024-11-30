package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateUtilities;

public class RecordDeleteExample {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtilities.getSessionFactory(); Session session = factory.openSession()) {
			Actor foundActor = session.find(Actor.class, "A02");
			Transaction tx = session.beginTransaction();
			session.remove(foundActor);
			tx.commit();
			System.out.println("Record Deleted");
					
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
