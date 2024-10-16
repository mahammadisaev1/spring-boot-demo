package com.demo.springdemo.student;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class DBStudentService implements StudentService{

    private final StudentRepository studentRepository;

    public DBStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findByEmailIgnoreCase(email);
    }

    @Override
    public void delete(String email) {
        studentRepository.deleteByEmailIgnoreCase(email);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }
}
