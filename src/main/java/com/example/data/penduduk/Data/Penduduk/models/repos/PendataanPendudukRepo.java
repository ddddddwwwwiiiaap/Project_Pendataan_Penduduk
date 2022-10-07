package com.example.data.penduduk.Data.Penduduk.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.data.penduduk.Data.Penduduk.models.entities.PendataanPenduduk;

public interface PendataanPendudukRepo extends CrudRepository<PendataanPenduduk, Long>{
<<<<<<< HEAD
    List<PendataanPenduduk> findByNamaContains(String nama);
=======
    
  //  List<PendataanPenduduk> findByNameConstains(String nama);
>>>>>>> fd0ee351c3f56dd87a35397437b2cfb7b91c2264
}
