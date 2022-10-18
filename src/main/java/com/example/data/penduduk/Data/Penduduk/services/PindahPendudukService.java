package com.example.data.penduduk.Data.Penduduk.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.data.penduduk.Data.Penduduk.models.entities.PindahPenduduk;
import com.example.data.penduduk.Data.Penduduk.models.repos.PindahPendudukRepo;

@Service
@Transactional
public class PindahPendudukService {

    @Autowired
    private PindahPendudukRepo pindahRepo;

    public PindahPenduduk save(PindahPenduduk pindahPenduduk){
        return pindahRepo.save(pindahPenduduk);
    }
    
    public PindahPenduduk findOne(Long id){
        return pindahRepo.findById(id).get();
    }

    public Iterable<PindahPenduduk> findAll(){
        return pindahRepo.findAll();
    }

    public void removeOne(Long id){
        pindahRepo.deleteById(id);
    }

    public List<PindahPenduduk> findByName(String namakepalakeluarga){
        return pindahRepo.findBynamakepalakeluargaContaining(namakepalakeluarga);
    }
}
