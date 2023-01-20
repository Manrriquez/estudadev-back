package io.github.manrriquez.estudadev.repositories;

import io.github.manrriquez.estudadev.models.VideoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<VideoModel, Long> {
}
