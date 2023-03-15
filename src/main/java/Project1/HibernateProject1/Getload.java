package Project1.HibernateProject1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Getload {
   public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("HCodding.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
}
}
