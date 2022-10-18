package com.example.data.penduduk.Data.Penduduk.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.penduduk.Data.Penduduk.dto.ResponseData;
import com.example.data.penduduk.Data.Penduduk.dto.SearchData;
import com.example.data.penduduk.Data.Penduduk.models.entities.User;
import com.example.data.penduduk.Data.Penduduk.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<ResponseData<User>> create(@Valid @RequestBody User user, Errors errors){
        
        ResponseData<User> responseData = new ResponseData<>();
        
        if (errors.hasErrors()){
            for (ObjectError error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(userService.save(user));
        return ResponseEntity.ok(responseData);
    }

    @GetMapping
    public Iterable<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findOne(@PathVariable("id")Long nik){
        return userService.findOne(nik);
    }

    @PutMapping
    public ResponseEntity<ResponseData<User>> update(@Valid @RequestBody User user, Errors errors){
        ResponseData<User> responseData = new ResponseData<>();
        
        if (errors.hasErrors()){
            for (ObjectError error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(userService.save(user));
        return ResponseEntity.ok(responseData);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("nik")Long id){
        userService.removeOne(id);
    }

    @PostMapping("/{search}/{username}")
    public List<User> findByName(@RequestBody SearchData searchData) {
        return userService.findByName(searchData.getSearchKey());
    }

}
