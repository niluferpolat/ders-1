package com.example.deneme.Service;

import com.example.deneme.Model.Student;
import com.example.deneme.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllList(){
        return studentRepository.findAll();
    }
}
