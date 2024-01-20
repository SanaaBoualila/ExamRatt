package com.example.ratt.Controller;

import com.example.ratt.Entity.School;
import com.example.ratt.Service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/controller1")
@RequiredArgsConstructor
public class Controller1 {
    private final SchoolService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody School school){
        service.saveSchool(school);
    }
    @GetMapping
    public ResponseEntity<List<School>> findAllSchools(){
        return ResponseEntity.ok(service.findAllschools());
    }

}
