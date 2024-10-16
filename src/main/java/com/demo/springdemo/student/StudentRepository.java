package com.demo.springdemo.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByEmailIgnoreCase(String email);

    void deleteByEmailIgnoreCase(String email);
}
