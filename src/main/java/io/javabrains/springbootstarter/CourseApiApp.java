package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {
    public static void main(String args[]) {
        //SpringApplication is the Static class with "run" method in it.
        SpringApplication.run(CourseApiApp.class, args);
    }
}
