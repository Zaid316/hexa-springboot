package com.hql.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {
    @Id
    private int pid;
    
    private String name;
    private double price;

    public Product() {}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
    }
}
