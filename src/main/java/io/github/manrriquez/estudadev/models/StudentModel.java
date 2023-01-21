package io.github.manrriquez.estudadev.models;

import jakarta.persistence.*;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

public class StudentModel {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column
    private String name;
    @OneToMany(mappedBy = "student")
    private List<CourseModel> courses;
}
