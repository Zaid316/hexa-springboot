package com.hexa2;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    int roll;
	String name;
	double fee;

@Autowired
    private Result res;

    public Result getRes() {
		return res;
	}
 
	public void setRes(Result res) {
		this.res = res;
	}

	Student()
    {

	}

	public Student(int roll, String name, double fee) {
		super();
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

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", fee=" + fee + ", " + res.toString() + "]";
	}
    
}
