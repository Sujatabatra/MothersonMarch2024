package com.sujata.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sujata.entity.Book;
import com.sujata.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        Book book1=new Book(1, "Core Java", "Any Author", 1500, 1000);
        Book book2=new Book(2, "Learn Java", "Some Author", 1800, 2500);
        
        Transaction transaction=null;
        try(Session session=HibernateUtil.getSessionFactory().openSession();){
        	
        	transaction=session.beginTransaction();
        	
        	session.persist(book1);  //in hibernate 5 save()
        	session.persist(book2);
        	transaction.commit();
        }
        catch(Exception ex) {
        	transaction.rollback();
        }
    }
}
