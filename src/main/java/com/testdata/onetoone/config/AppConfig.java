package com.testdata.onetoone.config;

import com.testdata.onetoone.model.Car;
import com.testdata.onetoone.model.Owner;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

@Configuration
@EnableWebMvc
@ComponentScan("com.testdata.onetoone")
public class AppConfig implements WebMvcConfigurer {

//    private static SessionFactory sessionFactory;
//
//    private static String userName = "root";
//    private static String password = "GOGUDAserver123!";
//    private static String url = "jdbc:mysql://localhost:3306/one_to_one";
//
//    public static SessionFactory getSessionFactory() {
//        if (sessionFactory == null) {
//            try {
//                org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
//
//                // Hibernate settings equivalent to hibernate.cfg.xml's properties
//                Properties settings = new Properties();
//                settings.put(org.hibernate.cfg.Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
//                settings.put(org.hibernate.cfg.Environment.URL, "jdbc:mysql://localhost:3306/one_to_one");
//                settings.put(org.hibernate.cfg.Environment.USER, "root");
//                settings.put(org.hibernate.cfg.Environment.PASS, "GOGUDAserver123!");
//                settings.put(org.hibernate.cfg.Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
//
//                settings.put(org.hibernate.cfg.Environment.SHOW_SQL, "true");
//
//                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
//
//                //settings.put(Environment.HBM2DDL_AUTO, "create-drop");
//
//                configuration.setProperties(settings);
//
//                configuration.addAnnotatedClass(Car.class);
//                configuration.addAnnotatedClass(Owner.class);
//
//
//                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//                        .applySettings(configuration.getProperties()).build();
//
//                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return sessionFactory;
//    }
//
//    // реализуйте настройку соеденения с БД
//    //System.out.println("-------Тестирование конектинга-------");
//    private static Connection conn = null;
//
//
//
//    static {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conn = DriverManager.getConnection(url, userName, password);
//            System.out.println("С базой соеденились");
//        } catch (Exception ex) {
//            System.err.println("Ошибка соединения с базой");
//            ex.printStackTrace();
//        }
//    }
//
//    public static Connection getConn() {
//        return conn;
//    }
}

