package io.github.manrriquez.estudadev.data.vo;

import io.github.manrriquez.estudadev.models.TeacherModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;




@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class TeacherVO {

    private Long id;
    private String firstName;
    private String lastName;
    private String cpf;


}
