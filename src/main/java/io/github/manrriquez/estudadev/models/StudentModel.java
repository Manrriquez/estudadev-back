package io.github.manrriquez.estudadev.models;


import javax.persistence.*;
import java.util.Objects;

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

    public StudentModel() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentModel that = (StudentModel) o;
        return id.equals(that.id) && firstName.equals(that.firstName) && lastName.equals(that.lastName) && cpf.equals(that.cpf) && address.equals(that.address) && gender.equals(that.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, cpf, address, gender);
    }
}
