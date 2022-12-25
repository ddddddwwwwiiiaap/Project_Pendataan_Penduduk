package com.example.data.penduduk.Data.Penduduk.models.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.data.penduduk.Data.Penduduk.models.entities.KematianPenduduk;

public interface KematianPendudukRepo extends CrudRepository<KematianPenduduk, Long> {

    List<KematianPenduduk> findBytempatkematianContaining(String tempatkematian);

    Optional<KematianPenduduk> findById(Long id);
}
