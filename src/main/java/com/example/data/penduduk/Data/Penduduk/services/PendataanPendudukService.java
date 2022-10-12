package com.example.data.penduduk.Data.Penduduk.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.data.penduduk.Data.Penduduk.models.entities.PendataanPenduduk;
import com.example.data.penduduk.Data.Penduduk.models.repos.PendataanPendudukRepo;

@Service
@Transactional
public class PendataanPendudukService {
    
    @Autowired
    private PendataanPendudukRepo pendataanPendudukRepo;

    public PendataanPenduduk save(PendataanPenduduk pendataanPenduduk){
        return pendataanPendudukRepo.save(pendataanPenduduk);
    }

    public PendataanPenduduk findOne(Long nik){
        Optional<PendataanPenduduk> pendataanPenduduk = pendataanPendudukRepo.findById(nik);
        if(!pendataanPenduduk.isPresent()){
            return null;
        }
        return pendataanPenduduk.get();
    }
    
    public Iterable<PendataanPenduduk> findAll(){
        return pendataanPendudukRepo.findAll();
    }

    public void removeOne(Long nik){
        pendataanPendudukRepo.deleteById(nik);
    }

    public List<PendataanPenduduk> findByName(String nama){
        return pendataanPendudukRepo.findByNamaContaining(nama);
    }
}
