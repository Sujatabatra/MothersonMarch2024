package com.sujata.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sujata.entity.Husband;
import com.sujata.entity.Wife;
import com.sujata.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        Wife wife1=new Wife("w001", "Wife 1");
        Wife wife2=new Wife("w002", "Wife 2");
        Wife wife3=new Wife("w003", "Wife 3");
        
        
        Husband husband1=new Husband("h001", "Husband 1");
        Husband husband2=new Husband("h002", "Husband 2");
        Husband husband3=new Husband("h003", "Husband 3");
        
        wife1.setHusband(husband3);
        wife2.setHusband(husband2);
        wife3.setHusband(husband1);
        
        Transaction transaction=null;
        try(Session session=HibernateUtil.getSessionFactory().openSession();){
        	
        	transaction=session.beginTransaction();
        	
        	session.persist(husband1);  //in hibernate 5 save()
        	session.persist(husband2);
        	session.persist(husband3);
        	
        	session.persist(wife1);
        	session.persist(wife2);
        	session.persist(wife3);
        	transaction.commit();
        }
        catch(Exception ex) {
        	transaction.rollback();
        }
    }
}
