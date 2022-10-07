package com.example.data.penduduk.Data.Penduduk.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.data.penduduk.Data.Penduduk.models.entities.User;
import com.example.data.penduduk.Data.Penduduk.models.repos.UserRepo;

@Service
@Transactional
public class UserService {
    
    @Autowired
    private UserRepo userRepo;

    public User save(User user){
        return userRepo.save(user);
    }

    public User findOne(Long id){
        Optional<User> user = userRepo.findById(id);
        if(!user.isPresent()){
            return null;
        }
        return user.get();
    }
    
    public Iterable<User> findAll(){
        return userRepo.findAll();
    }

    public void removeOne(Long id){
        userRepo.deleteById(id);
    }

    public List<User> findByName(String username){
        return userRepo.findByUsernameContains(username);
    }

}
