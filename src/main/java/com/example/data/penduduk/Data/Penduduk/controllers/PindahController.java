package com.example.data.penduduk.Data.Penduduk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.penduduk.Data.Penduduk.models.entities.PindahPenduduk;
import com.example.data.penduduk.Data.Penduduk.services.PindahService;

@RestController
@RequestMapping("/api/pindah")
public class PindahController {

    @Autowired
    private PindahService pindahService;

    @PostMapping
    public PindahPenduduk create(@RequestBody PindahPenduduk pindahPenduduk){
        return pindahService.save(pindahPenduduk);
    }

    @GetMapping
    public Iterable<PindahPenduduk> findAll(){
        return pindahService.findAll();
    }
}