package com.example.data.penduduk.Data.Penduduk.dto;

import javax.validation.constraints.NotEmpty;

public class UserRegistrationDto {
    
    @NotEmpty(message="First Name is required")
    private String firstName;

    @NotEmpty(message = "Last Name is required")
    private String lastName;

    @NotEmpty(message="Email is required")
    private String email;

    @NotEmpty(message = "Password is required")
    private String password;

    public UserRegistrationDto() {
    }

    public UserRegistrationDto(@NotEmpty(message = "First Name is required") String firstName,
            @NotEmpty(message = "Last Name is required") String lastName,
            @NotEmpty(message = "Email is required") String email,
            @NotEmpty(message = "Password is required") String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

}

