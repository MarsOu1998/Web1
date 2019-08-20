package Test;

import PO.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//Hibernate实现添加
public class INSERT1 {
    public static void main(String[] args) {
        //1.读取hibernate配置文件
        Configuration configuration=new Configuration().configure();
        //2.hibernate操作使用session来完成，session由sessionFactory管理，生成sessionFactory
        SessionFactory  sessionFactory=configuration.buildSessionFactory();
        //3.打开session，session的事务不是自动提交的
        Session session =sessionFactory.openSession();
        Customer customer=new Customer("zhangsan2","oushile","张三",20,"男");
        Transaction transaction=session.beginTransaction();
        session.save(customer);
        transaction.commit();

    }
}
