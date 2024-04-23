package com.example.crud_a.service;

import com.example.crud_a.entity.Student;
import com.example.crud_a.repository.StudentRepositotry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService{

    @Autowired
    private StudentRepositotry studentRepositotry;

    @Override
    public Student addStudent(Student student) {
        if(student != null) {
            return studentRepositotry.save(student);
        }
        return null;
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        if(student != null) {
            Student student1 = studentRepositotry.getById(id);
            if(student1 != null) {
                student1.setName(student.getName());
                student1.setAddress(student.getAddress());
                student1.setGender(student.isGender());

                return studentRepositotry.save(student1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteStudent(Long id) {
        if(id >= 1) {
            Student student1 = studentRepositotry.getById(id);
            if(student1 != null) {
                studentRepositotry.delete(student1);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepositotry.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepositotry.getById(id);
    }
}
