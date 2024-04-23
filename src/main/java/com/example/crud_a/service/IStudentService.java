package com.example.crud_a.service;

import com.example.crud_a.entity.Student;
import com.example.crud_a.repository.StudentRepositotry;

import java.util.List;

public interface IStudentService {
    //create
    public Student addStudent(Student student);

    //update
    public Student updateStudent(Long id, Student student);

    //delete
    public boolean deleteStudent(Long id);

    //read all
    public List<Student> getAllStudents();

    //read 1
    public Student getStudentById(Long id);


}
