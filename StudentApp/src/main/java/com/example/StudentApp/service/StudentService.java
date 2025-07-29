package com.example.StudentApp.service;

import com.example.StudentApp.entity.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
}
