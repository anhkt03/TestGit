package com.example.crud_a.repository;

import com.example.crud_a.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositotry extends JpaRepository<Student, Long> {
}
