package com.hexa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITBook")
public class Book {

    @Id
    int Bno;

    @Column
    String name;

    @Column
    double price;

    public int geBno(){
        return Bno;
    }

    public void setBno(int Bno){
        this.Bno = Bno;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
        
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bno=" + Bno +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
