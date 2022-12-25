package com.example.data.penduduk.Data.Penduduk.models.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.data.penduduk.Data.Penduduk.models.entities.PendataanPenduduk;

public interface PendataanPendudukRepo extends CrudRepository<PendataanPenduduk, Long>{

    List<PendataanPenduduk> findByNamaContains(String nama); //nama method harus sesuai dengan nama entity

    PendataanPenduduk findByNikContains(String nik);

    PendataanPenduduk findByNik(String nik);

    Optional<PendataanPenduduk> findById(Long id);

}
