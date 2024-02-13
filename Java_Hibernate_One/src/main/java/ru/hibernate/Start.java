package ru.hibernate;

import org.hibernate.Session;
import ru.hibernate.entity.client;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Start {

    //private static final Logger LOG = Logger.getLogger( ClientHelper.class.getName());

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        for (client client:new ClientHelper().getClientList()
            ) {
            System.out.println(client.getName());

        }
    }
}
