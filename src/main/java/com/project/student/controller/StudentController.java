package com.project.student.controller;

import com.project.student.entity.Student;
import com.project.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getAllStudentDetails")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/studentDetailsById/{studentId}")
    public Student getStudentById(@PathVariable Long studentId){
        return studentService.getStudentById(studentId).get();
    }

    @DeleteMapping("/deleteStudentDetails/{studentId}")
    public String deleteStudentById(@PathVariable Long studentId){
        return studentService.deleteStudentById(studentId);
    }
    @PutMapping("/updateStudentDetails")
    public String updateStudentDetails(@RequestBody Student student){
        return studentService.updateStudentDetails(student);
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
}
