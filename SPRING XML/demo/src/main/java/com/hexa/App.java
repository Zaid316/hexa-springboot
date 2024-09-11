package com.hexa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student s1 = (Student) context.getBean("stud1");
        Result res = s1.getRes();
        System.out.println(s1.toString());
        System.out.println(res.toString());

    }
}

