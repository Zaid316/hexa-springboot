package com.hexa2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {


@Bean(name = "stud1")


    public Student getStudent(){
        Student s1 = new Student();
        s1.setRoll(101);
        s1.setName("ZAID");
        s1.setFee(2000);
        return s1;
    }

@Bean(name="res")
	public Result getResult()
	{
		Result r= new Result();
		r.setMarks(99);
		r.setGrade("A");
		return r;
    
}

}
