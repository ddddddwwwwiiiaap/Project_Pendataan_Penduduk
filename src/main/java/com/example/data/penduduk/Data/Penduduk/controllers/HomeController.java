package com.example.data.penduduk.Data.Penduduk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.data.penduduk.Data.Penduduk.dto.SearchData;
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
        model.addAttribute("searchData", new SearchData());
        model.addAttribute("pendataan", pendataanPendudukService.findAll());
        model.addAttribute("pindah", pindahPendudukService.findAll());
        model.addAttribute("kematian", kematianPendudukService.findAll());
        return "index";
    }

    @PostMapping("/search")
    public String search(SearchData searchData, Model model){
        model.addAttribute("searchData", searchData);
        model.addAttribute("pendataan", pendataanPendudukService.findByName(searchData.getSearchKey()));
        return "index";
    }

    @GetMapping("/tables_pendataanpenduduk")
    public String tables_pendataanpenduduk(Model model) {
        model.addAttribute("tables_pendataanpenduduk", pendataanPendudukService.findAll());
        return "tables_pendataanpenduduk";
    }

    @GetMapping("/tables_pindahpenduduk")
    public String tables_pindahpenduduk(Model model) {
        model.addAttribute("tables_pindahpenduduk", pindahPendudukService.findAll());
        return "tables_pindahpenduduk";
    }

    @GetMapping("/tables_kematianpenduduk")
    public String tables_kematianpenduduk(Model model) {
        model.addAttribute("tables_kematianpenduduk", kematianPendudukService.findAll());
        return "tables_kematianpenduduk";
    }
}
