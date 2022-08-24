//package Util;
//
//import java.util.Properties;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.cfg.Environment;
//import org.hibernate.service.ServiceRegistry;
//
//import Model.Cours;
//import Model.Etudiant;
//import Model.Prof;
//
//public class HibernateUtil {
//	 private static SessionFactory sessionFactory;
//     
//     public static SessionFactory getSessionFactory() {
//          if (sessionFactory == null) {
//           try {
//            Configuration configuration = new Configuration();
//
//            // Hibernate settings equivalent to hibernate.cfg.xml's properties
//            Properties settings = new Properties();
//            settings.put(Environment.DRIVER, "org.postgresql.Driver");
//            settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/Gestion_Ecole");
//            settings.put(Environment.USER, "postgres");
//            settings.put(Environment.PASS, 1234);
//            settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
//            settings.put(Environment.SHOW_SQL, "true");
//            settings.put(Environment.HBM2DDL_AUTO, "create-drop");
//
//            settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
////            settings.put(Environment.HBM2DDL_AUTO, "create-drop");
//
//            configuration.setProperties(settings);
//            configuration.addAnnotatedClass(Prof.class);
//            configuration.addAnnotatedClass(Etudiant.class);
//            configuration.addAnnotatedClass(Cours.class);
//
//            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//              .applySettings(configuration.getProperties()).build();
//            System.out.println("je suis dans hibernate");
//            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//            return sessionFactory;
//
//           } catch (Exception e) {
//            e.printStackTrace();
//           }
//          }
//          return sessionFactory;
//         }
//}
