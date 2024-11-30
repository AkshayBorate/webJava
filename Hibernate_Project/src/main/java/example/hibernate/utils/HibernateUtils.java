package example.hibernate.utils;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	public static SessionFactory getSessionFactory() {
			Configuration conf = new Configuration();
			conf = conf.configure();
			SessionFactory factory = conf.buildSessionFactory();
		return factory;
		
	}

}
