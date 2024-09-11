package com.hql.Dao;

import com.hql.Model.Product;

public interface DaoInter {
    void addProduct(Product product);
    void removeProduct(int pid);
    void updatePrice(int pid, double newPrice);
    double calculateBill(int pid, int quantity);
}
