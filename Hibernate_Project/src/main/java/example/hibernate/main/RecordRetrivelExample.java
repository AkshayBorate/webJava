package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateUtilities;

public class RecordRetrivelExample {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtilities.getSessionFactory(); Session session = factory.openSession()) {
			// Loading an entity of type : Actor against an ID:403

			Actor foundActor = session.find(Actor.class, "A04");
			System.out.println("FoundActor: " + foundActor);
			if (foundActor != null) {
				System.out.println("FirstName: " + foundActor.getFirstName());
				System.out.println("LastName: " + foundActor.getLastName());
				System.out.println("FirstName: " + foundActor.getAge());
			} else {
				System.out.println("Actor not found");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
