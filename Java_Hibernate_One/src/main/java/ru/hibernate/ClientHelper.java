package ru.hibernate;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.hibernate.entity.client;

import java.util.List;

public class ClientHelper {

    private SessionFactory sessionFactory;

    public ClientHelper() { sessionFactory = HibernateUtil.getSessionFactory(); }

    public List<client> getClientList() {
        // открыть сессию - для манипуляции с персист. объектами
        Session session = sessionFactory.openSession();

        session.get(client.class, 1L); // получение объекта по id


        // этап подготовки запроса
        // объкет-конструктор запросов для Criteria API
        CriteriaBuilder cb = session.getCriteriaBuilder();

        CriteriaQuery cq = cb.createQuery(client.class);
        Root<client> root = cq.from(client.class); // первостепенный, корневой entity (в sql запросе - from)

        cq.select(root);// необязательный оператор, если нужно получить все значения



        // этап выполнения запроса

        Query query = session.createQuery(cq);

        List<client> clientList = query.getResultList();

        session.close();

        return clientList;


    }

    public client getClient(long name) { return null; }

}
