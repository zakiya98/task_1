package com.example.task_1;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//@Data
//@AllArgsConstructor
public class Student {
    private String name;

    public Student(String name) {
        this.name=name;
    }

    public String  getName() {
        return name;
    }
}
