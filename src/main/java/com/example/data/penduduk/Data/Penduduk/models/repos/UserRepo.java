package com.example.data.penduduk.Data.Penduduk.models.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.data.penduduk.Data.Penduduk.models.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
    User findByEmail(String email);
}

