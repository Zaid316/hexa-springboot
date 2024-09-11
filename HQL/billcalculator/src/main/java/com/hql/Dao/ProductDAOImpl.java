package com.hql.Dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hql.Connection.Connection;
import com.hql.Model.Product;

public class ProductDAOImpl implements DaoInter {
    Transaction transaction = null;



@Override
    public void addProduct(Product product) {
        try (Session session = Connection.getSessionFact().openSession()) {
            transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
            System.out.println("Product added successfully.");
        } catch (Exception e) {
            System.out.println(e);
            
            }
            
        }

@Override
    public void removeProduct(int pid) {
        try (Session session = Connection.getSessionFact().openSession()) {
            transaction = session.beginTransaction();
            String hql = "DELETE FROM Product WHERE pid = :pid";
            int result = session.createQuery(hql)
                                .setParameter("pid", pid)
                                .executeUpdate();
            transaction.commit();
            if (result > 0) {
                System.out.println("Product removed successfully.");
            } else {
                System.out.println("Product not found.");
            }
        } catch (Exception e) {
           System.out.println(e);
        }
    }


@Override
    public void updatePrice(int pid, double newPrice) {
        try (Session session = Connection.getSessionFact().openSession()) {
            transaction = session.beginTransaction();
            String hql = "UPDATE Product SET price = :newPrice WHERE pid = :pid";
            int result = session.createQuery(hql)
                                .setParameter("pid", pid)
                                .setParameter("newPrice", newPrice)
                                .executeUpdate();
            transaction.commit();
            if (result > 0) {
                System.out.println("Price updated successfully.");
            } else {
                System.out.println("Product not found.");
            }
        } catch (Exception e) {
            System.out.println(e);
           
        }
    }


@Override
    public double calculateBill(int pid, int quantity) {
        try (Session session = Connection.getSessionFact().openSession()) {
            String hql = "SELECT price FROM Product WHERE pid = :pid";
            Double price = session.createQuery(hql, Double.class)
                                  .setParameter("pid", pid)
                                  .uniqueResult();
            if (price != null) {
                return price * quantity;
            } else {
                System.out.println("Product not found.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0.0;
    }
}
