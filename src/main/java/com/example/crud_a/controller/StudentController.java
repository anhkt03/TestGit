package com.example.crud_a.controller;


import com.example.crud_a.entity.Student;
import com.example.crud_a.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService iStudentService;


    @GetMapping("/")
    public String test() {
        return "hello";
    }

    //API add student
    @PostMapping("/add")
    public Student add(@RequestBody Student student) {
        return iStudentService.addStudent(student);
    }

    //API update
    @PostMapping("/update")
    public Student update(@RequestParam("id") Long id, @RequestBody Student student) {
        return iStudentService.updateStudent(id, student);
    }

    //API delet
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return iStudentService.deleteStudent(id);
    }

    //API listall
    @GetMapping("/list")
    public List<Student> getALlStudeng() {
        return iStudentService.getAllStudents();
    }

    public IStudentService getiStudentService() {
        return iStudentService;
    }
}
