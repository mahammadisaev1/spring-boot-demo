package com.demo.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InMemoryStudentService implements StudentService{

    private final InMemoryStudentDao dao;

    public InMemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();

    }

    @Override
    public Student save(Student student) {
        return dao.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }

    @Override
    public Student update(Student student) {
        return dao.update(student);
    }

}
