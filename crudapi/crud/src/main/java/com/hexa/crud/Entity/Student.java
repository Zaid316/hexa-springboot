package com.hexa.crud.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class Student {
    @Id 
    int roll;
    String name;
    Double fee;
    
    public Student() {
    }

    public Student(int roll, String name, Double fee) {
        this.roll = roll;
        this.name = name;
        this.fee = fee;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", fee=" + fee +
                ']';
    }
}
