package com.example.data.penduduk.Data.Penduduk.controllers;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
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

import com.example.data.penduduk.Data.Penduduk.dto.KematianData;
import com.example.data.penduduk.Data.Penduduk.dto.ResponseData;
import com.example.data.penduduk.Data.Penduduk.dto.SearchData;
import com.example.data.penduduk.Data.Penduduk.models.entities.KematianPenduduk;
import com.example.data.penduduk.Data.Penduduk.models.entities.PendataanPenduduk;
import com.example.data.penduduk.Data.Penduduk.models.repos.PendataanPendudukRepo;
import com.example.data.penduduk.Data.Penduduk.services.KematianPendudukService;
import com.example.data.penduduk.Data.Penduduk.services.PendataanPendudukService;

@RestController
@RequestMapping("/api/kematian")
public class KematianPendudukController {

    @Autowired
    private KematianPendudukService kematianPendudukService;

    @Autowired
    private PendataanPendudukRepo pendataanPendudukRepo;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public KematianPenduduk create(@RequestBody KematianPenduduk pendataanPenduduk) {
        return kematianPendudukService.save(pendataanPenduduk);
    }

    @GetMapping
    public Iterable<KematianPenduduk> findAll() {
        return kematianPendudukService.findAll();
    }

    @PutMapping
    public ResponseEntity<ResponseData<KematianPenduduk>> edit(@Valid @RequestBody KematianPenduduk kematianPenduduk, Errors errors) {
        ResponseData<KematianPenduduk> responseData = new ResponseData<>();
        
        if(errors.hasErrors()){
            for (ObjectError error : errors.getAllErrors()){
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(kematianPendudukService.save(kematianPenduduk));
        return ResponseEntity.ok(responseData);
    }

    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable("id") Long id) {
        kematianPendudukService.delete(id);
    }

    @PostMapping("/{search}/{tempatkematian}")
    public List<KematianPenduduk> findByName(@RequestBody SearchData searchData) {
        return kematianPendudukService.findByName(searchData.getSearchKey());
    }

    @PostMapping("/kematiandto/{nik}")
    public PendataanPenduduk findByNik(@RequestBody KematianData kematianData) {
        return kematianPendudukService.findByNik(kematianData.getNik());
    }
    

    /*@PostMapping("/kematiandto/{nik}")
    public ResponseEntity<ResponseData<PendataanPenduduk>> getdto(@Valid @RequestBody KematianData kematianData, Errors errors) {

        ResponseData<PendataanPenduduk> responseData = new ResponseData<>();

        if(errors.hasErrors()){
            for (ObjectError error : errors.getAllErrors()){
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }

        PendataanPenduduk pendataanPenduduk = modelMapper.map(kematianData, PendataanPenduduk.class);
        responseData.setStatus(true);
        responseData.setPayload(kematianPendudukService.findByNik(kematianData.getNik()));
        return ResponseEntity.ok(responseData);
    }*/
}
