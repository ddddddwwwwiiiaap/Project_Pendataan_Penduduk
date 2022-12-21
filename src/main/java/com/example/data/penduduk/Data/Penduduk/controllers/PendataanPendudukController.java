package com.example.data.penduduk.Data.Penduduk.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.data.penduduk.Data.Penduduk.dto.SearchData;
import com.example.data.penduduk.Data.Penduduk.models.entities.PendataanPenduduk;
import com.example.data.penduduk.Data.Penduduk.services.PendataanPendudukService;

@Controller
@RequestMapping("/api/pendataanpenduduk")
public class PendataanPendudukController {

    @Autowired
    private PendataanPendudukService pendataanPendudukService;
/*
    @GetMapping
    public Iterable<PendataanPenduduk> findAll() {
        return pendataanPendudukService.findAll();
    }
*/



    @GetMapping
    public Iterable<PendataanPenduduk> findAll() {
        return pendataanPendudukService.findAll();
    }

    @PostMapping
    public PendataanPenduduk create(@RequestBody PendataanPenduduk pendataanPenduduk) {
        return pendataanPendudukService.save(pendataanPenduduk);
    }

    @PutMapping
    public PendataanPenduduk edit(@RequestBody PendataanPenduduk pendataanPenduduk) {
        return pendataanPendudukService.save(pendataanPenduduk);
    }

    @DeleteMapping("/delete/{nik}")
    public void remove(@PathVariable("nik") String nik) {
        pendataanPendudukService.delete(nik);
    }

    @PostMapping("/{search}/{nama}")
    public List<PendataanPenduduk> findByName(@RequestBody SearchData searchData) {
        return pendataanPendudukService.findByName(searchData.getSearchKey());
    }

}
