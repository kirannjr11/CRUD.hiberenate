package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();

        //create
//        Student student = new Student();
//
//        student.setName("kiran");
//        student.setAddress("korea");
//        student.setEmail("ghalekiran03@gmail.com");
//        student.setCollegeName("seoul national");
//
//        Student student1 = new Student();
//
//        student1.setName("Neymar");
//        student1.setAddress("Brazil");
//        student1.setEmail("njr03@gmail.com");
//        student1.setCollegeName("gangwon national");
//
//        Transaction tx = session.beginTransaction();
//
//        session.save(student);
//        session.save(student1);
//
//        tx.commit();
//        System.out.println("data saved");

        //read

//        List<Student> list = session.createQuery("from Student", Student.class).list();
//        list.forEach(e -> System.out.println(e));
//
//        session.close();
//        factory.close();

        //update

        Student st = session.get(Student.class,1);
        st.setName("Neymarupdate");
        st.setAddress("Brazilup");
        st.setEmail("njr03@gmail.comup");
        st.setCollegeName("gangwon nationalup");

        Transaction tx = session.beginTransaction();
        session.save(st);
        tx.commit();

      session.close();
      factory.close();
    }
}
