package com.example.mlanyuni.Repository;

import com.example.mlanyuni.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.support.Repositories;

import java.util.Optional;

import static org.hibernate.loader.Loader.SELECT;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.email=?1")
    Optional<Student> findStudentByEmail(String email);
}
