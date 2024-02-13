package ru.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class HibernateUtil {
    private static SessionFactory sessionFactory; // настройка и работа с сессиями (фабрика сессий)

    static {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder() // получение реестра сервисов
                .configure() // настройка из hibernate.cfg.xml
                .build();
        try {
            // MetadataSources - для работа метаданными маппинга объектов
            sessionFactory = new MetadataSources( registry ) .buildMetadata() .buildSessionFactory();
        }
        catch (Exception e) {
            StandardServiceRegistryBuilder.destroy( registry );
        }
    }

    public static SessionFactory getSessionFactory() { return sessionFactory; }


}
