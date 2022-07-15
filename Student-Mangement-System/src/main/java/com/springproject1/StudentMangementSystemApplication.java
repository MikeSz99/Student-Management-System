package com.springproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springproject1.entity.Student;
import com.springproject1.repositories.StudentRepository;

@SpringBootApplication
public class StudentMangementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentMangementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
//		
//		Student student1 = new Student("Michal", "Szymonik", "michal.szymonik99@gmail.com"); 
//		repo.save(student1);
//		
//		Student student2 = new Student("Sandrzej", "Jadhav", "sandrzej1555@gmail.com"); 
//		repo.save(student2);
//		
//		Student student3 = new Student("Toony", "Starkv", "tony@gmail.com"); 
//		repo.save(student3);
		
	}
	
	

}
