package com.example.HibernateJPADemo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.HibernateJPADemo.entity.Student;
import com.example.HibernateJPADemo.repo.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private final StudentRepository studentRepository;

    public StudentRestController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // GET - Get all students
    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    // POST - Add a new student
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    // DELETE - Delete student by id
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {

        if (!studentRepository.existsById((long) id)) {
            return "Student with id " + id + " not found";
        }

        studentRepository.deleteById((long) id);
        return "Student with id " + id + " deleted successfully";
    }
}