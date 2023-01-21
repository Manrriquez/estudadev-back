package io.github.manrriquez.estudadev.models;

import io.github.manrriquez.estudadev.enums.CategoryEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;


@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_COURSE")
public class CourseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany(mappedBy = "courses", cascade = CascadeType.ALL)
    private List<VideoModel> videos;
}
