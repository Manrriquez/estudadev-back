package io.github.manrriquez.estudadev.models;


import javax.persistence.*;

@Entity
@Table(name = "TB_STUDENT")
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false, length = 80)
    private String firstName;
    @Column(name = "last_name", nullable = false, length = 80)
    private String lastName;
    @Column(name="cpf", nullable = false)
    private String cpf;
    @Column(name = "address", nullable = false, length = 120)
    private String address;
    @Column(name = "gender", nullable = false, length = 8)
    private String gender;
}
