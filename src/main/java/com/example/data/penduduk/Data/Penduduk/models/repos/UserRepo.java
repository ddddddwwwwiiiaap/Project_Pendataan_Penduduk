package com.example.data.penduduk.Data.Penduduk.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.data.penduduk.Data.Penduduk.models.entities.User;

public interface UserRepo extends CrudRepository<User, Long>{
    
}
