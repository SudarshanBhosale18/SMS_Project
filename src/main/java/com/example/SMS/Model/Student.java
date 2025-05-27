package com.example.SMS.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String name;
    private String email;
    private String course;

    // Constructors
    //public Student() {}
    
    /* public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    } */

    
    
}
