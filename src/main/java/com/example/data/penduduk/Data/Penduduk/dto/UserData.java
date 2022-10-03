package com.example.data.penduduk.Data.Penduduk.dto;

import javax.validation.constraints.NotEmpty;

public class UserData {
    
    @NotEmpty(message="Name is required")
    private String nama;

    @NotEmpty(message = "Address is required")
    private String password;

}
