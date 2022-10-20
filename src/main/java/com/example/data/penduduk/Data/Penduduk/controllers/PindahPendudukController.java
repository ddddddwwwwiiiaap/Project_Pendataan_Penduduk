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
import com.example.data.penduduk.Data.Penduduk.models.entities.PendataanPenduduk;
import com.example.data.penduduk.Data.Penduduk.models.entities.PindahPenduduk;
import com.example.data.penduduk.Data.Penduduk.services.PindahPendudukService;

@RestController
@RequestMapping("/api/pindah")
public class PindahPendudukController {

    @Autowired
    private PindahPendudukService pindahService;

    @PostMapping
    public ResponseEntity<ResponseData<PindahPenduduk>> create(@Valid @RequestBody PindahPenduduk pindahPenduduk, Errors errors) {

        ResponseData<PindahPenduduk> responseData = new ResponseData<>();

        if(errors.hasErrors()){
            for (ObjectError error : errors.getAllErrors()){
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(pindahService.save(pindahPenduduk));
        return ResponseEntity.ok(responseData);
    }

    @GetMapping
    public Iterable<PindahPenduduk> findAll() {
        return pindahService.findAll();
    }

    @PutMapping
    public ResponseEntity<ResponseData<PindahPenduduk>> edit(@Valid @RequestBody PindahPenduduk pindahPenduduk, Errors errors) {
        ResponseData<PindahPenduduk> responseData = new ResponseData<>();
        
        if(errors.hasErrors()){
            for (ObjectError error : errors.getAllErrors()){
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(pindahService.save(pindahPenduduk));
        return ResponseEntity.ok(responseData);
    }

    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable("id") Long id) {
        pindahService.delete(id);
    }

    @PostMapping("/{search}/{namakepalakeluarga}")
    public List<PindahPenduduk> findByName(@RequestBody SearchData searchData) {
        return pindahService.findByName(searchData.getSearchKey());
    }
}