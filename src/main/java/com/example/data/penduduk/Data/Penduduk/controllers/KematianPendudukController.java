package com.example.data.penduduk.Data.Penduduk.controllers;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.penduduk.Data.Penduduk.models.entities.KematianPenduduk;
import com.example.data.penduduk.Data.Penduduk.services.KematianPendudukService;

@RestController
@RequestMapping("/api/kematian")
public class KematianPendudukController {

    @Autowired
    private KematianPendudukService kematianPendudukService;

    @PostMapping
    public KematianPenduduk create(@RequestBody KematianPenduduk kematianPenduduk) {
        return kematianPendudukService.save(kematianPenduduk);
    }

    @GetMapping
    public Iterable<KematianPenduduk> findAll() {
        return kematianPendudukService.findAll();
    }
}
