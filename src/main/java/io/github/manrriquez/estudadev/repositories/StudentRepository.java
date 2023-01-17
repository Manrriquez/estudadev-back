package io.github.manrriquez.estudadev.repositories;

import io.github.manrriquez.estudadev.models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long> {
}
