package io.github.manrriquez.estudadev.models;

import io.github.manrriquez.estudadev.enums.CategoryEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static jakarta.persistence.GenerationType.*;


@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_COURSE")
public class CourseModel {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String image_location;
    @Column
    @Enumerated(EnumType.STRING)
    private CategoryEnum category;
    @ManyToOne()
    @JoinColumn(name = "student_id")
    private StudentModel  student;
    @OneToMany(mappedBy = "course")
    private List<VideoModel> videos;
}
