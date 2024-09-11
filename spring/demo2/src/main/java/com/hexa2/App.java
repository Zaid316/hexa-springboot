package com.hexa2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        Student s1 = (Student) context.getBean("stud1");
        System.out.println(s1.toString());

    }
}
