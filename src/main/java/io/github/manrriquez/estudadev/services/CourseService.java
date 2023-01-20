package io.github.manrriquez.estudadev.services;

import io.github.manrriquez.estudadev.Exceptions.ResourceNotFoundException;
import io.github.manrriquez.estudadev.data.vo.CourseVO;
import io.github.manrriquez.estudadev.mapper.ModelMapper;
import io.github.manrriquez.estudadev.models.CourseModel;
import io.github.manrriquez.estudadev.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    private final Logger logger = Logger.getLogger(StudentService.class.getName());

    public List<CourseVO> findAll() {
        logger.info("Listando todos cursos cadastrados..");
        return ModelMapper.parseListObjects(courseRepository.findAll(), CourseVO.class);
    }

    public CourseVO findById(Long id) {
        logger.info("Buscando id curso..");
        var entity = courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ID estudante não encontrado, tente novamente."));
        return ModelMapper.parseObject(entity, CourseVO.class);
    }

    public CourseVO create(CourseVO student) {
        logger.info("Criando entidade curso..");
        var entity = ModelMapper.parseObject(student, CourseModel.class);
        var entityModel = courseRepository.save(entity);
        return ModelMapper.parseObject(entityModel, CourseVO.class);

    }

    public CourseVO update(CourseVO person) {

        logger.info("Atualizando Entidade curso..");
        var entity = courseRepository.findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("ID curso não encontrado, tente novamente."));
//        entity.setCourseName(person.getCourseName());
//        entity.setCourseDescription(person.getCourseDescription());
//        entity.setCourseType(person.getCourseType());
//        entity.setCoverDownloadUrl(person.getCoverDownloadUrl());

        var vo = ModelMapper.parseObject(courseRepository.save(entity), CourseVO.class);
        return vo;
    }

    public void delete(Long id) {

        logger.info("Deletando Entidade curso..");
        var entity = courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ID curso não encontrado, tente novamente."));
        courseRepository.delete(entity);
    }
}
