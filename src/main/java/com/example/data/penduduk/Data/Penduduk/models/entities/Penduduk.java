package com.example.data.penduduk.Data.Penduduk.models.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_pendudk")
public class Penduduk implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Column(length=100, nullable=false, unique = true)
    private Long nik;

    @Column(length=100, nullable=false, unique = true)
    private Long noKK;

    @Column(length=100)
    private String nama;

    @Column(length=150)
    private String alamat;

    @Column(length=100)
    private String tempatLahir;

    private Date tanggalLahir;

    @Column(length=10)
    private String agama;

    @Column(length=50)
    private String pendidikan;

    @Column(length=50)
    private String pekerjaan;

    @Column(length=50)
    private String statusPernikahan;

    @Column(length=50)
    private String statusKeluarga;

    @Column(length=50)
    private String kewarganegaraan;

    @Column(length=50,  unique = true)
    private String noPaspor;

    @Column(length=50,  unique = true)
    private String noKITAS;

    @Column(length=100)
    private String namaAyah;

    @Column(length=100)
    private String namaIbu;

    @Column(length=10)
    private String golonganDarah;
}
