package tta.summerproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SummerprojectApplication {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(SummerprojectApplication.class, args);
	}

	
}
