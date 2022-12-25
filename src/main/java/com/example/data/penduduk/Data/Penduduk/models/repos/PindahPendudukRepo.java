package com.example.data.penduduk.Data.Penduduk.models.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.data.penduduk.Data.Penduduk.models.entities.PindahPenduduk;

public interface PindahPendudukRepo extends CrudRepository<PindahPenduduk, Long> {

    List<PindahPenduduk> findByNamakepalakeluargaContains(String namakepalakeluarga);

    Optional<PindahPenduduk> findById(Long id);
}