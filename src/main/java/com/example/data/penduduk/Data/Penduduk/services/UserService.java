package com.example.data.penduduk.Data.Penduduk.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.data.penduduk.Data.Penduduk.dto.UserRegistrationDto;
import com.example.data.penduduk.Data.Penduduk.models.entities.User;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
