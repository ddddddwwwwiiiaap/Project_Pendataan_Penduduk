package com.example.data.penduduk.Data.Penduduk.services;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.stereotype.Service;

import com.example.data.penduduk.Data.Penduduk.models.entities.PendataanPenduduk;
import com.example.data.penduduk.Data.Penduduk.models.entities.PindahPenduduk;
import com.example.data.penduduk.Data.Penduduk.models.repos.PindahPendudukRepo;

@Service
@Transactional
public class PindahPendudukService {

    @Autowired
    private PindahPendudukRepo pindahRepo;

    public PindahPenduduk save(PindahPenduduk pindahPenduduk) {
        return pindahRepo.save(pindahPenduduk);
    }

    public PindahPenduduk findOne(Long id){
        Optional<PindahPenduduk> pindahPenduduk = pindahRepo.findById(id);
        if(!pindahPenduduk.isPresent()){
            return null;
        }
        return pindahPenduduk.get();
    }

    public Iterable<PindahPenduduk> findAll() {
        return pindahRepo.findAll();
    }

    public void delete(Long id) {
        pindahRepo.deleteById(id);
    }

    public List<PindahPenduduk> findByName(String namakepalakeluarga) {
        return pindahRepo.findByNamakepalakeluargaContains(namakepalakeluarga);
    }
}
