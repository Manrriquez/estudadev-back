package io.github.manrriquez.estudadev.services;


import io.github.manrriquez.estudadev.dto.CourseDTO;
import io.github.manrriquez.estudadev.dto.VideoDTO;
import io.github.manrriquez.estudadev.models.CourseModel;
import io.github.manrriquez.estudadev.models.VideoModel;
import io.github.manrriquez.estudadev.repositories.CourseRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
@AllArgsConstructor
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    private final ModelMapper modelMapper;


    public CourseDTO save(CourseDTO dto) {
        CourseModel course = modelMapper.map(dto, CourseModel.class);
        return modelMapper.map(course, CourseDTO.class);
    }

}
