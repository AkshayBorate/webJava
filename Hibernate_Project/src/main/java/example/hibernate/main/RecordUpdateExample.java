package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateUtilities;

public class RecordUpdateExample {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtilities.getSessionFactory(); Session session = factory.openSession()) {
			// Loading an entity of type : Actor against an ID:403

			Actor foundActor = session.find(Actor.class, "A03");
			System.out.println("FoundActor: " + foundActor);
			Transaction tx = session.beginTransaction();
			foundActor.setFirstName("Ranbir");
			foundActor.setLastName("Kapoor");
			tx.commit();
			System.out.println("Record updated");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
