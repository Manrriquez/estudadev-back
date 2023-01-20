package io.github.manrriquez.estudadev.data.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class VideoVO {

    private Long id;
    private String title;
    private String video_url;
    private String description;
}
