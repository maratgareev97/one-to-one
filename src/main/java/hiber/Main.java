package hiber;

import hiber.config.AppConfig;
import hiber.model.Password1;
import hiber.model.User1;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//// Получаем готовый SessionFactory и создаем сессию
//        try (Session session = AppConfig.getSessionFactory().openSession()) {
//
////  открываем транзакцию
//            session.getTransaction().begin();
//            User1 user1 = new User1();
//            user1.setName("Первый1");
//            session.save(user1); //фиксируем изменения в объекте
//
//            Password1 password1 = new Password1();
//            password1.setNumber("n1111");
//            password1.setSeria("s1111");
//
//            user1.setPassword1(password1); // добавляем в таблицу user1 id паспорта
//            session.save(password1);
//
//            System.out.println(user1.getId() + " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
////       подтверждение действий
//            session.getTransaction().commit();
//// закрываем
//            session.close(); //закрываем сессию
//            session.getSessionFactory().close(); // закрываем sessionFactory
//        } catch (Exception e) {
//            System.out.println("");
//        }


//        try (Session session = AppConfig.getSessionFactory().openSession()) {
//
//            System.out.println(session.get(User1.class, 1L).toString()); // получение по id
////--------------------------------------------------------
//
//            // этап подготовки
//// объект-конструктор запросов для Criteria API
//            CriteriaBuilder cb= session.getCriteriaBuilder();
//            CriteriaQuery cq = cb.createQuery(User1.class);
//            Root<User1> root = cq.from(User1.class);
//            cq.select(root); // необязательный оператор, если просто нужно получить все значения
//
//            // выполение занпроса
//            Query query = session.createQuery(cq);
//            List<User1> user1List=query.getResultList();
//            System.out.println(user1List);
//            session.close(); //закрываем сессию
//            session.getSessionFactory().close(); // закрываем sessionFactory
//        } catch (Exception e) {
//            System.out.println("");
//        }


        List<User1> users = new ArrayList<User1>();
        Transaction transaction = null;
        try (Session session = AppConfig.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            User1 user1 = new User1();
            Password1 password1 = new Password1();

            user1.setPassword1(password1);
            session.save(user1);


            //entityManager.persist(student);

            //Query query = session.createQuery("from User1");
            //users = query.list();
            //System.out.println("----------------------------" + users);

            //session.get(User1.class,17L).
            //            Password1 password1 = session.get(Password1.class, 32L);
            //            System.out.println(password1+" mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
            //session.delete(password1);

            transaction.commit();


            session.close(); //закрываем сессию
//            session.getSessionFactory().close(); // закрываем sessionFactory
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }


    }
}

