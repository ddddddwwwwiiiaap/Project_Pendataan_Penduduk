package com.example.data.penduduk.Data.Penduduk.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.penduduk.Data.Penduduk.dto.SearchData;
import com.example.data.penduduk.Data.Penduduk.models.entities.PindahPenduduk;
import com.example.data.penduduk.Data.Penduduk.services.PindahPendudukService;

@RestController
@RequestMapping("/api/pindah")
public class PindahPendudukController {

    @Autowired
    private PindahPendudukService pindahService;

    @PostMapping
    public PindahPenduduk create(@RequestBody PindahPenduduk pindahPenduduk) {
        return pindahService.save(pindahPenduduk);
    }

    @PutMapping
    public PindahPenduduk edit(@RequestBody PindahPenduduk pindahPenduduk) {
        return pindahService.save(pindahPenduduk);
    }

    @GetMapping
    public Iterable<PindahPenduduk> findAll() {
        return pindahService.findAll();
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