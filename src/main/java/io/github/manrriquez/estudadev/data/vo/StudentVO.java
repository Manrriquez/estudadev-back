package io.github.manrriquez.estudadev.data.vo;
import io.github.manrriquez.estudadev.models.CourseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Objects;





@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class StudentVO {

    private Long id;
    private CourseModel course;
    private String firstName;
    private String lastName;
    private String cpf;
    private String address;
    private String gender;

}
