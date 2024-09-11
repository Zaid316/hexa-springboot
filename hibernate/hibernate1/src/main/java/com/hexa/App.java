package com.hexa;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
 
 
public class App {
	SessionFactory fac;
	Session ses;
	Transaction tx;
	
	App()
	{
        fac=new Configuration().configure("hiber.cfg.xml").addAnnotatedClass(Book.class).buildSessionFactory();
    	
    	 ses=fac.openSession();
		
	}
	
	
	    void insertBook()
	    {
	    	 tx=ses.beginTransaction();
	         
	         Book b= new Book();
	         b.setBno(103);
	         b.setName("React");
	         b.setPrice(2000.9);
	         ses.save(b);
	         tx.commit();
	    }

        void RemoveBook()
	    {
	    	int bn=102;
	    	 tx=ses.beginTransaction();
	    	Book b= ses.find(Book.class,bn);
	    	if(b!=null)
	    	{
	    		ses.delete(b);
	    		tx.commit();
	    	}
	    	else
	    	{
	    		System.out.println("Not Found");
	    	}
	    }

        void updateBookPrice() {
            int bno = 100;
            tx = ses.beginTransaction();
            Book b = ses.find(Book.class, bno);
            if (b != null) {
                b.setPrice(2000);
                ses.update(b); 
                tx.commit();
                System.out.println("Book price updated successfully");
            } else {
                System.out.println("Book not found");
            }
        }

        void searchBookByNumber() {
            int bno = 103;
            tx = ses.beginTransaction();
            Book b = ses.find(Book.class, bno);
            if (b != null) {
                System.out.println(b.toString()); 
            } else {
                System.out.println("Book with number " + bno + " not found");
            }
            tx.commit();
        }

        void showAll()
	    {
	    	
	    	 tx=ses.beginTransaction();
	    	
	    	 Query<Book> q=ses.createQuery("from Book ");
	    	 List<Book> books= q.list();
	    	
	    	 for(Book b : books)
	    	 {
	    		 System.out.println(b.toString());
	    		
	    	 }
	    	
	    	
 
	    }
	
    public static void main(String[] args) {
 
    	App app= new App();
    	//app.insertBook();
        //app.RemoveBook();
        //app.updateBookPrice();
        //app.searchBookByNumber();
    	app.showAll();
    	//System.out.println("Welcome");
 
    }
}
