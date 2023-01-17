package io.github.manrriquez.estudadev.controllers;


import io.github.manrriquez.estudadev.data.vo.StudentVO;
import io.github.manrriquez.estudadev.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student/v1")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<StudentVO> findAll() throws Exception{
        return studentService.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentVO findById(@PathVariable(value = "id") Long id) throws Exception {
        return studentService.findById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public StudentVO create(@RequestBody StudentVO person) {
        return studentService.create(person);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public StudentVO update(@RequestBody StudentVO person) {
        return studentService.update(person);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        studentService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
