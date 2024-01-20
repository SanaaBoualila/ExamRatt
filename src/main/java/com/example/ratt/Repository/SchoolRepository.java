package com.example.ratt.Repository;

import com.example.ratt.Entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
    School findByStudentId(Integer studentId);

}
