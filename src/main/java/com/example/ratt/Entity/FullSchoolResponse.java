package com.example.ratt.Entity;

import com.example.ratt.Entity.Student;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullSchoolResponse {


        List<Student> students;

    }

