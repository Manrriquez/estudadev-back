package io.github.manrriquez.estudadev.controllers;


import io.github.manrriquez.estudadev.data.vo.LessonVO;
import io.github.manrriquez.estudadev.data.vo.StudentVO;
import io.github.manrriquez.estudadev.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/lessons")
public class LessonService {

    @Autowired
    private LessonService lessonService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LessonVO> findAll() throws Exception{
        return lessonService.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public LessonVO findById(@PathVariable(value = "id") Long id) throws Exception {
        return lessonService.findById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public LessonVO create(@RequestBody LessonVO person) {
        return lessonService.create(person);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public LessonVO update(@RequestBody LessonVO person) {
        return lessonService.update(person);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        lessonService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
