package com.greatlearning.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.library.model.GreatLearning;

@SpringBootApplication
public class SpringBootLibrarymanagenentDesignApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibrarymanagenentDesignApplication.class, args);
		System.out.println("Hello Spring boot");
		System.out.println("Hello Dev tools");

	}

	@Override
	public void run(String... args) throws Exception {
    Greatlearning greatLearning= new Greatlearning();
    greatLearning.setCourseName("DMS");
    greatLearning.setCourseType("IT");
    greatLearning.getCourseName();
    System.out.println("Course Name: "+ greatLearning);
	}
}

