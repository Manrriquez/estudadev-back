package io.github.manrriquez.estudadev.dto;


import io.github.manrriquez.estudadev.enums.CategoryEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {


    private Long id;
    private String title;
    private String description;
    private String image_location;
    @Enumerated(EnumType.STRING)
    private CategoryEnum category;
}
