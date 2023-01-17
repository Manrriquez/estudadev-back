package io.github.manrriquez.estudadev.controllers;


import io.github.manrriquez.estudadev.data.vo.StudentVO;
import io.github.manrriquez.estudadev.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
