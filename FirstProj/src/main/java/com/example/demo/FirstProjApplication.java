package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(FirstProjApplication.class, args);
		Employee e=context.getBean(Employee.class);
		Worker w=context.getBean(Worker.class);
		e.setEname("Ram");
		e.getdata();
		//System.out.println("Hello World...");
	
		
	}

}
