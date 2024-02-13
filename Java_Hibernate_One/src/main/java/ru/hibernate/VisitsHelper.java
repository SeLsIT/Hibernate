
package ru.hibernate;

/*
public class VisitsHelper {

    private SessionFactory sessionFactory;

    public VisitsHelper() { sessionFactory = HibernateUtil.getSessionFactory(); }

    public List<visits> getVisitsList() {
        // открыть сессию - для манипуляции с персист. объектами
        Session session = sessionFactory.openSession();

        session.get(visits.class, 1L); // получение объекта по id


        // этап подготовки запроса
        // объкет-конструктор запросов для Criteria API
        CriteriaBuilder cb = session.getCriteriaBuilder();

        CriteriaQuery cq = cb.createQuery(visits.class);
        Root<visits> root = cq.from(visits.class); // первостепенный, корневой entity (в sql запросе - from)

        cq.select(root);// необязательный оператор, если нужно получить все значения



        // этап выполнения запроса

        Query query = session.createQuery(cq);

        List<visits> visitsList = query.getResultList();

        session.close();

        return visitsList;


    }

    public visits getvisits(Date Date) { return null; }
}
*/