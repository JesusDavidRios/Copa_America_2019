package com.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectWebApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(ProjectWebApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(ProjectWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("fin");

	}
}
