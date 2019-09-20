package com.example.task_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean
    public Student getStudent() {
        return new Student("Ali");
    }
    @Bean
    public Account getAccount(Student student){
        return new Account(student);
    }
}
