package com.example.JobScheduler01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JobScheduler01Application {

	public static void main(String[] args) {
		SpringApplication.run(JobScheduler01Application.class, args);
	}

}
