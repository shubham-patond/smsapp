package equ.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication {

	public static void main(String[] args) 
	{
		System.out.println("Spring Boot StudentManagement Project");
		SpringApplication.run(StudentManagementApplication.class, args);
	}

}
