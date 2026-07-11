package com.example.studentapi.controller;

import com.example.studentapi.dto.StudentRequestDTO;
import com.example.studentapi.dto.StudentResponseDTO;
import com.example.studentapi.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // 1. Get all students
    @GetMapping
    public ResponseEntity<List<StudentResponseDTO>> getAllStudents() {
        List<StudentResponseDTO> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    // 2. Get student by ID
    @GetMapping("/{id}")
    public ResponseEntity<StudentResponseDTO> getStudentById(@PathVariable Long id) {
        StudentResponseDTO student = studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

    // 3. Get student by Roll Number
    @GetMapping("/roll/{rollNumber}")
    public ResponseEntity<StudentResponseDTO> getStudentByRollNumber(@PathVariable String rollNumber) {
        StudentResponseDTO student = studentService.getStudentByRollNumber(rollNumber);
        return ResponseEntity.ok(student);
    }

    // 4. Create a new student record
    @PostMapping
    public ResponseEntity<StudentResponseDTO> createStudent(@Valid @RequestBody StudentRequestDTO request) {
        StudentResponseDTO createdStudent = studentService.createStudent(request);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }

    // 5. Update an existing student record
    @PutMapping("/{id}")
    public ResponseEntity<StudentResponseDTO> updateStudent(
            @PathVariable Long id,
            @Valid @RequestBody StudentRequestDTO request) {
        StudentResponseDTO updatedStudent = studentService.updateStudent(id, request);
        return ResponseEntity.ok(updatedStudent);
    }

    // 6. Delete a student record
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}
