package com.example.data.penduduk.Data.Penduduk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.data.penduduk.Data.Penduduk.dto.SearchData;
import com.example.data.penduduk.Data.Penduduk.models.entities.PendataanPenduduk;
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

    @GetMapping("/index.html")
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






    @GetMapping("/tables_pendataanpenduduk.html")
    public String displaypendataanpenduduk(Model model) {
        model.addAttribute("tables_pendataanpenduduk", pendataanPendudukService.findAll());
        return "tables_pendataanpenduduk";
    }

    @GetMapping("/data_penduduk.html")
    public String inputpendataanpenduduk(Model model) {
        model.addAttribute("data_penduduk", new PendataanPenduduk());
        return "data_penduduk";
    }

    @PostMapping("/save")
    public String savependataanpenduduk(PendataanPenduduk pendataanPenduduk) {
        //System.out.println(pendataanPenduduk.getNama());
        pendataanPendudukService.save(pendataanPenduduk);
        return "redirect:/";
    }

    @GetMapping("/delete/{nik}")
    public String delete(@PathVariable("nik") String nik){
        pendataanPendudukService.deleteByNik(nik);
        return "redirect:/tables_pendataanpenduduk.html";
    }

    @GetMapping("/edit_datapenduduk/{nik}")
    public String edit(@PathVariable("nik") String nik, Model model){
        model.addAttribute("data_penduduk", pendataanPendudukService.findByNik(nik));
        return "edit_datapenduduk.html";
    }

    @PostMapping("/update")
    public String update(PendataanPenduduk pendataanPenduduk, Model model){
        pendataanPendudukService.updateData(pendataanPenduduk);
        return "tables_pendataanpenduduk";
    }










    @GetMapping("/tables_pindahpenduduk.html")
    public String tables_pindahpenduduk(Model model) {
        model.addAttribute("tables_pindahpenduduk", pindahPendudukService.findAll());
        return "tables_pindahpenduduk";
    }

    @GetMapping("/delete_tables_pindahpenduduk/{id}")
    public String delete(@PathVariable("id") Long id){
        pindahPendudukService.delete(id);
        return "redirect:/tables_pindahpenduduk.html";
    }

    @GetMapping("/tables_kematianpenduduk.html")
    public String tables_kematianpenduduk(Model model) {
        model.addAttribute("tables_kematianpenduduk", kematianPendudukService.findAll());
        return "tables_kematianpenduduk";
    }
}
