package com.example.data.penduduk.Data.Penduduk.models.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_pendataanPenduduk")
public class PendataanPenduduk implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
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

    public PendataanPenduduk() {
    }

    public PendataanPenduduk(Long nik, Long noKK, String nama, String alamat, String tempatLahir, Date tanggalLahir,
            String agama, String pendidikan, String pekerjaan, String statusPernikahan, String statusKeluarga,
            String kewarganegaraan, String noPaspor, String noKITAS, String namaAyah, String namaIbu,
            String golonganDarah, PindahPenduduk pindahPenduduk) {
        this.nik = nik;
        this.noKK = noKK;
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.agama = agama;
        this.pendidikan = pendidikan;
        this.pekerjaan = pekerjaan;
        this.statusPernikahan = statusPernikahan;
        this.statusKeluarga = statusKeluarga;
        this.kewarganegaraan = kewarganegaraan;
        this.noPaspor = noPaspor;
        this.noKITAS = noKITAS;
        this.namaAyah = namaAyah;
        this.namaIbu = namaIbu;
        this.golonganDarah = golonganDarah;
    }

    public Long getNik() {
        return nik;
    }

    public void setNik(Long nik) {
        this.nik = nik;
    }

    public Long getNoKK() {
        return noKK;
    }

    public void setNoKK(Long noKK) {
        this.noKK = noKK;
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

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getStatusPernikahan() {
        return statusPernikahan;
    }

    public void setStatusPernikahan(String statusPernikahan) {
        this.statusPernikahan = statusPernikahan;
    }

    public String getStatusKeluarga() {
        return statusKeluarga;
    }

    public void setStatusKeluarga(String statusKeluarga) {
        this.statusKeluarga = statusKeluarga;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getNoPaspor() {
        return noPaspor;
    }

    public void setNoPaspor(String noPaspor) {
        this.noPaspor = noPaspor;
    }

    public String getNoKITAS() {
        return noKITAS;
    }

    public void setNoKITAS(String noKITAS) {
        this.noKITAS = noKITAS;
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    public void setNamaAyah(String namaAyah) {
        this.namaAyah = namaAyah;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public void setNamaIbu(String namaIbu) {
        this.namaIbu = namaIbu;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }
}
