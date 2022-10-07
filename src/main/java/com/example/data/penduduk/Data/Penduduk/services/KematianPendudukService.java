package com.example.data.penduduk.Data.Penduduk.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.data.penduduk.Data.Penduduk.models.entities.KematianPenduduk;
import com.example.data.penduduk.Data.Penduduk.models.repos.KematianPendudukRepo;

@Service
@Transactional
public class KematianPendudukService {

    @Autowired
    private KematianPendudukRepo kematianPendudukRepo;

    public KematianPenduduk save(KematianPenduduk kematianPenduduk) {
        return kematianPendudukRepo.save(kematianPenduduk);
    }

    public KematianPenduduk findById(Long id) {
        return kematianPendudukRepo.findById(id).get();
    }

    public Iterable<KematianPenduduk> findAll() {
        return kematianPendudukRepo.findAll();
    }

    public void removeOne(Long id) {
        kematianPendudukRepo.deleteById(id);
    }

    public List<KematianPenduduk> findByName(String idNIKpendataanpenduduk) {
        return kematianPendudukRepo.findByidNIKpendataanpendudukContaining(idNIKpendataanpenduduk);
    }
}
