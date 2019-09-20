package com.example.task_1;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//@Data
//@AllArgsConstructor
public class Account {
    private Student student;

    public Account(Student student) {
        this.student=student;
    }

    public Student getStudent() {
        return student;
    }
}
