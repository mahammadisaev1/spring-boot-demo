package com.demo.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student("Mahammad","Isayev", LocalDate.now(),"",27),
                new Student("Ali","Isayev", LocalDate.now(),"",24)
        );
    }
}
