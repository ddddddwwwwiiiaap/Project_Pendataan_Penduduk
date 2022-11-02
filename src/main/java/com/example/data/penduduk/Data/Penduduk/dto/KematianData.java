package com.example.data.penduduk.Data.Penduduk.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

public class KematianData {
    
    @NotEmpty(message="NIK is required")
    @Column(name="nik",columnDefinition="char(16)", length = 16)
    private String nik;

    @NotEmpty(message="Nama is required")
    private String nama;

    @NotEmpty(message="Alamat is required")
    private String alamat;

    @NotEmpty(message="Jenis Kelamin is required")
    private String jenisKelamin;

    @NotEmpty(message="Agama is required")
    private String agama;

    @NotEmpty(message="Tempat Lahir is required")
    private String tempatLahir;

    @NotEmpty(message="Tanggal Lahir is required")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private String tanggalLahir;

    @NotEmpty(message="Kewarganegaraan is required")
    private String kewarganegaraan;

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    
}
