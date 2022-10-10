package com.example.data.penduduk.Data.Penduduk.controllers;

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
import com.example.data.penduduk.Data.Penduduk.models.entities.PendataanPenduduk;
import com.example.data.penduduk.Data.Penduduk.services.PendataanPendudukService;

@RestController
@RequestMapping("/api/pendataanpenduduk")
public class PendataanPendudukController {
    
    @Autowired
    private PendataanPendudukService pendataanPendudukService;

    @PostMapping
    public ResponseEntity<ResponseData<PendataanPenduduk>> create(@Valid @RequestBody PendataanPenduduk pendataanPenduduk, Errors errors){
        
        ResponseData<PendataanPenduduk> responseData = new ResponseData<>();
        
        if (errors.hasErrors()){
            for (ObjectError error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(pendataanPendudukService.save(pendataanPenduduk));
        return ResponseEntity.ok(responseData);
    }

    @GetMapping
    public Iterable<PendataanPenduduk> findAll(){
        return pendataanPendudukService.findAll();
    }

    @GetMapping("/{nik}")
    public PendataanPenduduk findOne(@PathVariable("id")Character nik){
        return pendataanPendudukService.findOne(nik);
    }

    @PutMapping
    public ResponseEntity<ResponseData<PendataanPenduduk>> update(@Valid @RequestBody PendataanPenduduk pendataanPenduduk, Errors errors){
        ResponseData<PendataanPenduduk> responseData = new ResponseData<>();
        
        if (errors.hasErrors()){
            for (ObjectError error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(pendataanPendudukService.save(pendataanPenduduk)); //belum 100% valid karena dia akan memanggil class service lalu eksekusi database ada kemungkinan error saat save database.
        return ResponseEntity.ok(responseData);
    }

    @DeleteMapping("/{nik}")
    public void removeOne(@PathVariable("nik")Character nik){
        pendataanPendudukService.removeOne(nik);
    }

}
