package com.example.data.penduduk.Data.Penduduk.models.repos;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.data.penduduk.Data.Penduduk.models.entities.PindahPenduduk;

public interface PindahPendudukRepo extends CrudRepository<PindahPenduduk, Long> {

    @Query("SELECT p FROM PindahPenduduk p WHERE p.namakepalakeluarga LIKE :namakepalakeluarga")
    List<PindahPenduduk> findBynamakepalakeluargaContaining(@PathParam("namakepalakeluarga") String namakepalakeluarga);

}