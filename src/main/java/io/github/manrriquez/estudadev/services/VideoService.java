package io.github.manrriquez.estudadev.services;


import io.github.manrriquez.estudadev.Exceptions.ResourceNotFoundException;
import io.github.manrriquez.estudadev.data.vo.VideoVO;
import io.github.manrriquez.estudadev.mapper.ModelMapper;
import io.github.manrriquez.estudadev.models.VideoModel;
import io.github.manrriquez.estudadev.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class VideoService {

    @Autowired
    VideoRepository videoRepository;

    private final Logger logger = Logger.getLogger(StudentService.class.getName());

    public List<VideoVO> findAll() {
        logger.info("Listando todos cursos cadastrados..");
        return ModelMapper.parseListObjects(videoRepository.findAll(), VideoVO.class);
    }

    public VideoVO findById(Long id) {
        logger.info("Buscando id curso..");
        var entity = videoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ID estudante não encontrado, tente novamente."));
        return ModelMapper.parseObject(entity, VideoVO.class);
    }

    public VideoVO create(VideoVO student) {
        logger.info("Criando entidade curso..");
        var entity = ModelMapper.parseObject(student, VideoModel.class);
         var resultEntity = videoRepository.save(entity);
        return ModelMapper.parseObject(resultEntity, VideoVO.class);
    }

    public VideoVO update(VideoVO person) {

        logger.info("Atualizando Entidade curso..");
        var entity = videoRepository.findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("ID curso não encontrado, tente novamente."));
//        entity.setCourseName(person.getCourseName());
//        entity.setCourseDescription(person.getCourseDescription());
//        entity.setCourseType(person.getCourseType());
//        entity.setCoverDownloadUrl(person.getCoverDownloadUrl());

        var vo = ModelMapper.parseObject(videoRepository.save(entity), VideoVO.class);
        return vo;
    }

    public void delete(Long id) {

        logger.info("Deletando Entidade curso..");
        var entity = videoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ID curso não encontrado, tente novamente."));
        videoRepository.delete(entity);
    }
}
