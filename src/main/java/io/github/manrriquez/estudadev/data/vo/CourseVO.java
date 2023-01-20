package io.github.manrriquez.estudadev.data.vo;

import io.github.manrriquez.estudadev.enums.TypeCourseEnum;
import io.github.manrriquez.estudadev.models.VideoModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class CourseVO {

    private Long id;
    private String title;
    private String description;
    private String image_location;
    @Enumerated(EnumType.STRING)
    private TypeCourseEnum category;

    @OneToMany
    @JoinColumn(name = "video_id")
    private List<VideoModel> videos;

}
