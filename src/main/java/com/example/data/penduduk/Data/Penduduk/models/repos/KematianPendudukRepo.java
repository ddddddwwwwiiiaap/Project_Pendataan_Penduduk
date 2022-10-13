package com.example.data.penduduk.Data.Penduduk.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.data.penduduk.Data.Penduduk.models.entities.KematianPenduduk;

public interface KematianPendudukRepo extends CrudRepository<KematianPenduduk, Long> {

    List<KematianPenduduk> findByidNIKpendataanpendudukContaining(String idNIKpendataanpenduduk);
}
