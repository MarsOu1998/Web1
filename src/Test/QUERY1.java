package Test;

import PO.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QUERY1 {
    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();

        Customer customer=new Customer();
        session.load(customer,"zhangsan2");

        Transaction transaction=session.beginTransaction();
        session.delete(customer);
        transaction.commit();


    }
}
