package com.klef.fsad.exam;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.*;

public class ClientDemo
{
public static void main(String[] args)
{

SessionFactory sf = new Configuration().configure().buildSessionFactory();
Session session = sf.openSession();

Transaction tx = session.beginTransaction();

Transport t1 = new Transport("Bus Service", new Date(), "Active", "Bus", "Hyderabad");
Transport t2 = new Transport("Metro Rail", new Date(), "Running", "Train", "Delhi");
Transport t3 = new Transport("Flight Service", new Date(), "Scheduled", "Air", "Mumbai");

session.save(t1);
session.save(t2);
session.save(t3);

tx.commit();

System.out.println("Records Inserted Successfully");


// HQL Query without WHERE clause using named parameter
String hql = "FROM Transport t WHERE t.status = :status";

Query query = session.createQuery(hql);
query.setParameter("status", "Active");

List<Transport> list = query.list();

System.out.println("\nTransport Records:");

for(Transport t : list)
{
System.out.println(t);
}

session.close();
sf.close();

}
}