package io.github.manrriquez.estudadev.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;


@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_VIDEO")
public class VideoModel {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String video_url;
    @Column
    private String description;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private CourseModel course;
}
