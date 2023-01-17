package io.github.manrriquez.estudadev.services;


import io.github.manrriquez.estudadev.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class StudentService {


    @Autowired
    private StudentRepository studentRepository;
    private final Logger logger = Logger.getLogger(StudentService.class.getName());

}
