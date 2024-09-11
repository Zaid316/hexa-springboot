package com.hexa2;

public class Result {
    private int marks;
    private String grade;


    public Result() {
    }


    public Result(int marks, String grade) {
        this.marks = marks;
        this.grade = grade;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    // Setter for grade
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Result [Marks = " + marks + ", Grade = " + grade + "]";
    }
}
