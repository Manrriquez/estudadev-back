package io.github.manrriquez.estudadev.services;


import io.github.manrriquez.estudadev.data.vo.StudentVO;
import io.github.manrriquez.estudadev.mapper.ModelMapper;
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

    public List<StudentVO> findAll() {
        logger.info("Listando todos estudantes cadastrados..");
        return ModelMapper.parseListObjects(studentRepository.findAll(), StudentVO.class);
    }
}
