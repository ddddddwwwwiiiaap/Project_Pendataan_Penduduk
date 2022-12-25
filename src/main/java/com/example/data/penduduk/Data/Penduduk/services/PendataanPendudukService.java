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

    public PendataanPenduduk save(PendataanPenduduk dPendataanPenduduk){
        return pendataanPendudukRepo.save(dPendataanPenduduk);
    }

    public Iterable <PendataanPenduduk> findAll(){
        return pendataanPendudukRepo.findAll();
    }

    public void delete(Long id){
        pendataanPendudukRepo.deleteById(id);
    }

    public List<PendataanPenduduk> findByName(String nama){
        return pendataanPendudukRepo.findByNamaContains(nama);
    }

    public void saveData(PendataanPenduduk PendataanPenduduk){
        pendataanPendudukRepo.save(PendataanPenduduk);
    }

    public void deleteById(Long id){
        pendataanPendudukRepo.deleteById(id);
    }
    
    public void updateData(PendataanPenduduk PendataanPenduduk){
        pendataanPendudukRepo.save(PendataanPenduduk);
    }

    public PendataanPenduduk findByNik(String nik){
        return pendataanPendudukRepo.findByNik(nik);
    }

    public Optional<PendataanPenduduk> findById(Long id){
        return pendataanPendudukRepo.findById(id);
    }
}
