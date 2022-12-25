package com.example.data.penduduk.Data.Penduduk.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.data.penduduk.Data.Penduduk.dto.KematianData;
import com.example.data.penduduk.Data.Penduduk.models.entities.KematianPenduduk;
import com.example.data.penduduk.Data.Penduduk.models.entities.PendataanPenduduk;
import com.example.data.penduduk.Data.Penduduk.models.entities.PindahPenduduk;
import com.example.data.penduduk.Data.Penduduk.models.repos.KematianPendudukRepo;
import com.example.data.penduduk.Data.Penduduk.models.repos.PendataanPendudukRepo;

@Service
@Transactional
public class KematianPendudukService {

    @Autowired
    private KematianPendudukRepo kematianPendudukRepo;

    @Autowired
    private PendataanPendudukRepo pendataanPendudukRepo;
    

    public KematianPenduduk save(KematianPenduduk kematianPenduduk) {
        return kematianPendudukRepo.save(kematianPenduduk);
    }

    public KematianPenduduk findOne(Long id) {
        Optional<KematianPenduduk> kematianPenduduk = kematianPendudukRepo.findById(id);
        if (!kematianPenduduk.isPresent()) {
            return null;
        }
        return kematianPenduduk.get();
    }

    public Iterable<KematianPenduduk> findAll() {
        return kematianPendudukRepo.findAll();
    }

    // public PendataanPenduduk get(PendataanPenduduk pendataanPenduduk) {
    // return pendataanPenduduk;
    // }

    // public PendataanPenduduk findOne(String nik){
    /*
     * Optional<PendataanPenduduk> pendataanPenduduk =
     * kematianPendudukRepo.findByNik(nik);
     * if(!pendataanPenduduk.isPresent()){
     * return null;
     * }
     */
    // return KematianPendudukRepo.findByNik(nik);
    // }

    public List<KematianPenduduk> findByName(String tempatkematian) {
        return kematianPendudukRepo.findBytempatkematianContaining(tempatkematian);
    }

    public PendataanPenduduk findByNik(String nik) {
        return pendataanPendudukRepo.findByNikContains(nik);
    }

    public void saveData(KematianPenduduk kematianPenduduk){
        kematianPendudukRepo.save(kematianPenduduk);
    }

    public void delete(Long id) {
        kematianPendudukRepo.deleteById(id);
    }

    public void updateData(KematianPenduduk kematianPenduduk){
        kematianPendudukRepo.save(kematianPenduduk);
    }

    public Optional<KematianPenduduk> findById(Long id){
        return kematianPendudukRepo.findById(id);
    }
}
