package io.github.manrriquez.estudadev.services;


import io.github.manrriquez.estudadev.Exceptions.ResourceNotFoundException;
import io.github.manrriquez.estudadev.data.vo.StudentVO;
import io.github.manrriquez.estudadev.mapper.ModelMapper;
import io.github.manrriquez.estudadev.models.StudentModel;
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

    public StudentVO findById(Long id) {
        logger.info("Buscando id estudante..");
        var entity = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ID estudante não encontrado, tente novamente."));
        return ModelMapper.parseObject(entity, StudentVO.class);
    }

    public StudentVO create(StudentVO student) {
        logger.info("Criando entidade estudante..");
        var entity = ModelMapper.parseObject(student, StudentModel.class);
        var vo = ModelMapper.parseObject(studentRepository.save(entity), StudentVO.class);
        return vo;
    }

    public StudentVO update(StudentVO person) {

        logger.info("Atualizando Entidade Pessoa..");
        var entity = studentRepository.findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("ID estudante não encontrado, tente novamente."));
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
        var vo = ModelMapper.parseObject(studentRepository.save(entity), StudentVO.class);
        return vo;
    }

    public void delete(Long id) {

        logger.info("Deletando Entidade Pessoa..");
        var entity = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ID estudante não encontrado, tente novamente."));
        studentRepository.delete(entity);
    }
}
