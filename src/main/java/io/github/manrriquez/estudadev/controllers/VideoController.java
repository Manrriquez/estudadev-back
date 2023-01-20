package io.github.manrriquez.estudadev.controllers;


import io.github.manrriquez.estudadev.data.vo.CourseVO;
import io.github.manrriquez.estudadev.data.vo.VideoVO;
import io.github.manrriquez.estudadev.services.CourseService;
import io.github.manrriquez.estudadev.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videos/v1")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<VideoVO> findAll() throws Exception{
        return videoService.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public VideoVO findById(@PathVariable(value = "id") Long id) throws Exception {
        return videoService.findById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public VideoVO create(@RequestBody VideoVO person) {
        return videoService.create(person);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public VideoVO update(@RequestBody VideoVO person) {
        return videoService.update(person);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        videoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
