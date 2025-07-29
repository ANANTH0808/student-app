package com.example.StudentApp.service;

import com.example.StudentApp.entity.Student;
import com.example.StudentApp.exception.DuplicateEmailException;
import com.example.StudentApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements  StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student){
        if(studentRepository.findByMailId(student.getMailId()).isPresent()) {
            throw new DuplicateEmailException("email is already present");
        }
            return  studentRepository.save(student);


    }
    @Override
    public List<Student> getAllStudents(){
        return (List<Student>) studentRepository.findAll();
    }


}
