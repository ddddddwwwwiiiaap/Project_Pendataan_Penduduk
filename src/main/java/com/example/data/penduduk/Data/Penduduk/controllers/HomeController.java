package com.example.data.penduduk.Data.Penduduk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.data.penduduk.Data.Penduduk.services.KematianPendudukService;
import com.example.data.penduduk.Data.Penduduk.services.PendataanPendudukService;
import com.example.data.penduduk.Data.Penduduk.services.PindahPendudukService;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    private PendataanPendudukService pendataanPendudukService;

    @Autowired
    private PindahPendudukService pindahPendudukService;

    @Autowired
    private KematianPendudukService kematianPendudukService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("pendataan", pendataanPendudukService.findAll());
        model.addAttribute("pindah", pindahPendudukService.findAll());
        model.addAttribute("kematian", kematianPendudukService.findAll());
        return "index";
    }
}
