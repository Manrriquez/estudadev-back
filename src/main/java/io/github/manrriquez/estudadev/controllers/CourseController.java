package io.github.manrriquez.estudadev.controllers;


import io.github.manrriquez.estudadev.data.vo.CourseVO;
import io.github.manrriquez.estudadev.data.vo.StudentVO;
import io.github.manrriquez.estudadev.services.CourseService;
import io.github.manrriquez.estudadev.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses/v1")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CourseVO> findAll() throws Exception{
        return courseService.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CourseVO findById(@PathVariable(value = "id") Long id) throws Exception {
        return courseService.findById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public CourseVO create(@RequestBody CourseVO person) {
        return courseService.create(person);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public CourseVO update(@RequestBody CourseVO person) {
        return courseService.update(person);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        courseService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
