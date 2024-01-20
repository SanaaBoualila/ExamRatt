package com.example.ratt.Controller;

import com.example.ratt.Entity.FullSchoolResponse;
import com.example.ratt.Entity.School;
import com.example.ratt.Service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/controller2")
@RequiredArgsConstructor
public class Controller2 {
    private final SchoolService service;


    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponse> findAllSchools(@PathVariable("school-id") Integer schoolId){
        return ResponseEntity.ok(service.findAllschoolsWithStudents(schoolId));
    }

    @GetMapping("/student/{student-id}")
    public ResponseEntity<School> findAllSchool(@PathVariable("student-id") Integer studentId){

        return ResponseEntity.ok(service.findstudentwithschool(studentId));
    }

}
