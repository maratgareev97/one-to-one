package hiber.config;

import hiber.model.Car;
import hiber.model.Password1;
import hiber.model.User;
import hiber.model.User1;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class AppConfig {
    private static SessionFactory sessionFactory;

    private static String userName = "root";
    private static String password = "GOGUDAserver123!";
    private static String url = "jdbc:mysql://localhost:3306/one_to_one";
    private static String driver = "com.mysql.cj.jdbc.Driver";

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();


                // Hibernate settings equivalent to hibernate.cfg.xml's properties
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, driver);
                settings.put(Environment.URL, url);
                settings.put(Environment.USER, userName);
                settings.put(Environment.PASS, password);
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

                settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.FORMAT_SQL, "true");
                settings.put(Environment.HBM2DDL_AUTO,"create");

                //settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                //settings.put(Environment.HBM2DDL_AUTO, "create-drop");

                configuration.setProperties(settings);

                configuration.addAnnotatedClass(User1.class);
                configuration.addAnnotatedClass(Password1.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }

    // реализуйте настройку соеденения с БД
    //System.out.println("-------Тестирование конектинга-------");
    private static Connection conn = null;



    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("С базой соеденились");
        } catch (Exception ex) {
            System.err.println("Ошибка соединения с базой");
            ex.printStackTrace();
        }
    }

    public static Connection getConn() {
        return conn;
    }
}
