package com.example.HibernateJPADemo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.HibernateJPADemo.entity.Student;
public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
/*
 That's it. JpaRepository<Student, Long> gives you findAll(), findById(), save(), deleteById(), etc.
  with zero implementation code — Spring Data generates it at runtime.
*/