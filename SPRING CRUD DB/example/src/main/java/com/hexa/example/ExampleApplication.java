package com.hexa.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hexa.example.UserRepo.UserRepository;
import com.hexa.example.Entities.*;


@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		ApplicationContext  context=SpringApplication.run(ExampleApplication.class, args);
		UserRepository rep=	context.getBean(UserRepository.class);

		Iterable<User> users = rep.findAll();
		users.forEach((temp)->System.out.println(temp.toString()));
		
		/*User user1= new User();
		user1.setUserId(200);
		user1.setName("zaid");
		
		user1.setFee(6900.9);
		rep.save(user1);
		*/
	}

}
