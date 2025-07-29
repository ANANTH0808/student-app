package com.example.StudentApp.controller;

import com.example.StudentApp.entity.Student;
import com.example.StudentApp.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*") // if calling from frontend
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@Valid @RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
