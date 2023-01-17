package io.github.manrriquez.estudadev.data.vo;
import java.util.Objects;

public class StudentVO {

    private Long id;
    private String firstName;
    private String lastName;
    private String cpf;
    private String address;
    private String gender;

    public StudentVO() {}

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
        StudentVO studentVO = (StudentVO) o;
        return id.equals(studentVO.id) && firstName.equals(studentVO.firstName) && lastName.equals(studentVO.lastName) && cpf.equals(studentVO.cpf) && address.equals(studentVO.address) && gender.equals(studentVO.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, cpf, address, gender);
    }
}
