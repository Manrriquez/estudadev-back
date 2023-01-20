package io.github.manrriquez.estudadev.repositories;

import io.github.manrriquez.estudadev.models.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseModel, Long> {
}
