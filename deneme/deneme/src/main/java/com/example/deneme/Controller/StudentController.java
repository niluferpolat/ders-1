package com.example.deneme.Controller;

import java.util.List;

import com.example.deneme.Model.Student;
import com.example.deneme.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
  private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return service.getAllList();
    }
}
