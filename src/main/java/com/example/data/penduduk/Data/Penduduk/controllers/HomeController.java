package com.example.data.penduduk.Data.Penduduk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.data.penduduk.Data.Penduduk.dto.SearchData;
import com.example.data.penduduk.Data.Penduduk.models.entities.KematianPenduduk;
import com.example.data.penduduk.Data.Penduduk.models.entities.PendataanPenduduk;
import com.example.data.penduduk.Data.Penduduk.models.entities.PindahPenduduk;
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

    @PostMapping("/savependataanpenduduk")
    public String savependataanpenduduk(PendataanPenduduk pendataanPenduduk) {
        pendataanPendudukService.saveData(pendataanPenduduk);
        return "redirect:/tables_pendataanpenduduk.html";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        pendataanPendudukService.deleteById(id);
        return "redirect:/tables_pendataanpenduduk.html";
    }

    @GetMapping("/edit_datapenduduk/{id}")
    public String edit(@PathVariable("id") Long id, Model model){
        model.addAttribute("data_penduduk", pendataanPendudukService.findById(id));
        return "edit_datapenduduk";
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

    @GetMapping("/pindah_penduduk.html")
    public String inputpindahpenduduk(Model model) {
        model.addAttribute("pindah_penduduk", new PindahPenduduk());
        return "pindah_penduduk";
    }

    @PostMapping("/savepindahpenduduk")
    public String savepindahpenduduk(PindahPenduduk pindahPenduduk) {
        pindahPendudukService.saveData(pindahPenduduk);
        return "redirect:/tables_pindahpenduduk.html";
    }

    @GetMapping("/deletepindahpenduduk/{id}")
    public String deletepindahpenduduk(@PathVariable("id") Long id){
        pindahPendudukService.delete(id);
        return "redirect:/tables_pindahpenduduk.html";
    }

    @GetMapping("/edit_pindahpenduduk/{id}")
    public String editpindahpenduduk(@PathVariable("id") Long id, Model model){
        model.addAttribute("edit_pindahpenduduk", pindahPendudukService.findById(id));
        return "edit_datapenduduk";
    }

    @PostMapping("/updatepindahpenduduk")
    public String updatepindahpenduduk(PindahPenduduk pindahPenduduk, Model model){
        pindahPendudukService.updateData(pindahPenduduk);
        return "tables_pendataanpenduduk";
    }


























    @GetMapping("/tables_kematianpenduduk.html")
    public String tables_kematianpenduduk(Model model) {
        model.addAttribute("tables_kematianpenduduk", kematianPendudukService.findAll());
        return "tables_kematianpenduduk";
    }

    @GetMapping("/kematian_penduduk.html")
    public String inputkematianpenduduk(Model model) {
        model.addAttribute("kematian_penduduk", new KematianPenduduk());
        return "kematian_penduduk";
    }

    @PostMapping("/savekematianpenduduk")
    public String savekematianpenduduk(KematianPenduduk kematianPenduduk) {
        kematianPendudukService.saveData(kematianPenduduk);
        return "redirect:/tables_kematianpenduduk.html";
    }

    @GetMapping("/deletekematianpenduduk/{id}")
    public String deletekematianpenduduk(@PathVariable("id") Long id){
        kematianPendudukService.delete(id);
        return "redirect:/tables_kematianpenduduk.html";
    }

    @GetMapping("/edit_kematianpenduduk/{id}")
    public String editkematianpenduduk(@PathVariable("id") Long id, Model model){
        model.addAttribute("edit_kematianpenduduk", kematianPendudukService.findById(id));
        return "edit_kematianpenduduk";
    }

    @PostMapping("/updatekematianpenduduk")
    public String updatekematianpenduduk(KematianPenduduk kematianPenduduk, Model model){
        kematianPendudukService.updateData(kematianPenduduk);
        return "tables_kematianpenduduk";
    }
}
