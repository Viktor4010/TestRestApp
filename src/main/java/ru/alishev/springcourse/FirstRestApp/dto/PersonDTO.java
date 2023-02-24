package ru.alishev.springcourse.FirstRestApp.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

// dto does not relate with database. We do not need @Column annotation
// dto classes are used only on controller level. We do not dive dipper.
public class PersonDTO {

    @NotEmpty(message = "name should not be empty")
    @Size(min = 3, max = 20, message = "name should be between 2 and 30 characters")
    private String name;

    @Min(value = 0, message = "age should be greater then 0")
    private int age;

    @NotEmpty(message = "Email should not be empty")
    @Email
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
