package com.example.data.penduduk.Data.Penduduk.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.data.penduduk.Data.Penduduk.models.entities.PindahPenduduk;

public interface PindahPendudukRepo extends CrudRepository<PindahPenduduk, Long> {

    //List<PindahPenduduk> findByNamaContains(String nama_kepalakeluarga);
}