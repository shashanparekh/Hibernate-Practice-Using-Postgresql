package com.support.demoHib;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {
    	
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
        
        ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
        SessionFactory sf=cfg.buildSessionFactory(sr);
        Session session=sf.openSession();
        session.beginTransaction();
        
        
        session.getTransaction().commit();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //SQL Query(Nativ Query)
//      SQLQuery query=session.createSQLQuery("Select marks,name from Student where marks>60");
//      query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//      //query.addEntity(Student.class);
//      List student=query.list();
//      for(Object o:student) {
//      	Map map=(Map)o;
//      	System.out.println(map.get("marks")+":"+map.get("name"));
//      }
//      
        
        //HQL Query Statements
        
//        int b=10;
//       Query q1=session.createQuery("select sum(marks) from Student s where s.rollno> :b");
//       q1.setParameter("b", b);
//       Object object=(Object)q1.uniqueResult();
//       System.out.println(object);
      // List<Object[]> students=(List<Object[]>)q1.list();
      // Student student=(Student) q1.uniqueResult();
//       List<Student> student=q1.list();
//       for(Student s:student) {
//    	   System.out.println(s);
//       }
    
        
        
    }
}
