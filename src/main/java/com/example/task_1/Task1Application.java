package com.example.task_1;

import com.example.task_1.Account;
import com.example.task_1.Student;

//import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task1Application {

	public static void main(String[] args) {
		ApplicationContext appContext = (ApplicationContext) SpringApplication.run(Task1Application.class, args);

		Student student = (Student) appContext.getBean("getStudent");
		System.out.println(student.getName());

		Account account = (Account) appContext.getBean(Account.class);
		System.out.println(account.getStudent().getName());

	}

}
