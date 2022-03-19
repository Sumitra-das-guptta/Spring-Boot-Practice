package com.example.demonew.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	@Bean
	CommandLineRunner commandLineRunner(
			StudentRepository repository) {
		return args->{
			Student sumitra =new Student(
					"Sumitra",
					"sumi@gmail.com",
					LocalDate.of(2000, Month.FEBRUARY, 5)
				
					);
			Student nabilah =new Student(
					"Nabilah",
					"nabilah@gmail.com",
					LocalDate.of(2004, Month.MARCH, 25)
				
					);
			repository.saveAll(
					List.of(sumitra, nabilah)
					);
		};
	}
}
