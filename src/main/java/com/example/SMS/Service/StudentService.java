package com.example.SMS.Service;

import com.example.SMS.Model.Student;
import com.example.SMS.Repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    /* public StudentService(StudentRepository repository) {
        this.repository = repository;
    }  */

    public Student save(Student student) {
        return repository.save(student);
    }

    public List<Student> getAll() {
        return repository.findAll();
    }

    public Optional<Student> getById(Long id) {
        return repository.findById(id);
    }

    public Student update(Long id, Student updated) {
        return repository.findById(id).map(student -> {
            student.setName(updated.getName());
            student.setEmail(updated.getEmail());
            student.setCourse(updated.getCourse());
            return repository.save(student);
        }).orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
