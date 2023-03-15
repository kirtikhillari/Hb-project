package Project1.HibernateProject1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration();
        cfg.configure("HCodding.cfg.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
      //  System.out.println(factory);
        
      Friends s=new Friends();
     
        s.setGender("M");
        s.setName("SAI");

        s.setStd("12th");
        //s.setAddress("pune");
        s.setMb(87667876);
        s.setAge(20);
        System.out.println("Friends details shown below");
        
        System.out.println(s);
        
        
        Session session=factory.openSession();
        
        session.beginTransaction();
        
        session.save(s);
        
        session.getTransaction().commit();
       
        session.close();
        
        System.out.println("project closed");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
