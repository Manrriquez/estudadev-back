package io.github.manrriquez.estudadev.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoDTO {

    private Long id;
    private String title;
    private String video_url;
    private String description;
    private CourseDTO course;
}
