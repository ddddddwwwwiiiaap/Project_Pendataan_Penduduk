package com.example.data.penduduk.Data.Penduduk.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_pindah")
public class Pindah implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(length=100)
    private String nama_kepalakeluarga;

    @Column(length=150)
    private String alamat_sekarang;

    @Column(length=50)
    private String jumlah_keluargapindah;

    @Column(length=50)
    private String pendataan_pendudukNIK;

    public Pindah(){
    }

    public Pindah(Long id, String nama_kepalakeluarga, String alamat_sekarang, String jumlah_keluargapindah,
            String pendataan_pendudukNIK) {
        this.id = id;
        this.nama_kepalakeluarga = nama_kepalakeluarga;
        this.alamat_sekarang = alamat_sekarang;
        this.jumlah_keluargapindah = jumlah_keluargapindah;
        this.pendataan_pendudukNIK = pendataan_pendudukNIK;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama_kepalakeluarga() {
        return nama_kepalakeluarga;
    }

    public void setNama_kepalakeluarga(String nama_kepalakeluarga) {
        this.nama_kepalakeluarga = nama_kepalakeluarga;
    }

    public String getAlamat_sekarang() {
        return alamat_sekarang;
    }

    public void setAlamat_sekarang(String alamat_sekarang) {
        this.alamat_sekarang = alamat_sekarang;
    }

    public String getJumlah_keluargapindah() {
        return jumlah_keluargapindah;
    }

    public void setJumlah_keluargapindah(String jumlah_keluargapindah) {
        this.jumlah_keluargapindah = jumlah_keluargapindah;
    }

    public String getPendataan_pendudukNIK() {
        return pendataan_pendudukNIK;
    }

    public void setPendataan_pendudukNIK(String pendataan_pendudukNIK) {
        this.pendataan_pendudukNIK = pendataan_pendudukNIK;
    }

    
}
