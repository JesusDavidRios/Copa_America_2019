package com.project;

import com.project.facade.UserFacade;
import com.project.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
//@SpringBootApplication
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
