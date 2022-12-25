package com.example.data.penduduk.Data.Penduduk.models.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tbl_pendataanPenduduk")
public class PendataanPenduduk implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition="char(16)", length = 16)
    private String nik;

    @Column(columnDefinition="char(16)", length = 16)
    private String nokk;

    //@NotEmpty(message = "nama harus di isi")
    @Column(length = 100)
    private String nama;

    @Column(length = 150)
    private String alamat;

    @Column(length = 100)
    private String tempatlahir;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date tanggallahir;

    @Column(length = 9)
    private String agama;

    @Column(length = 3)
    private String pendidikan;

    @Column(length = 50)
    private String pekerjaan;

    @Column(length = 11)
    private String statuspernikahan;

    @Column(length = 11)
    private String statuskeluarga;

    @Column(length = 3)
    private String kewarganegaraan;

    @Column(length = 17, unique = true)
    private String nopaspor;

    @Column(length = 16, unique = true)
    private String nokitas;

    @Column(length = 100)
    private String namaayah;

    @Column(length = 100)
    private String namaibu;

    @Column(length = 2)
    private String golongandarah;

    @Column(length = 9)
    private String jeniskelamin;

    public PendataanPenduduk() {
    }

    public PendataanPenduduk(Long id, String nik, String nokk, String nama, String alamat, String tempatlahir,
            Date tanggallahir, String agama, String pendidikan, String pekerjaan, String statuspernikahan,
            String statuskeluarga, String kewarganegaraan, String nopaspor, String nokitas, String namaayah,
            String namaibu, String golongandarah, String jeniskelamin) {
        this.id = id;
        this.nik = nik;
        this.nokk = nokk;
        this.nama = nama;
        this.alamat = alamat;
        this.tempatlahir = tempatlahir;
        this.tanggallahir = tanggallahir;
        this.agama = agama;
        this.pendidikan = pendidikan;
        this.pekerjaan = pekerjaan;
        this.statuspernikahan = statuspernikahan;
        this.statuskeluarga = statuskeluarga;
        this.kewarganegaraan = kewarganegaraan;
        this.nopaspor = nopaspor;
        this.nokitas = nokitas;
        this.namaayah = namaayah;
        this.namaibu = namaibu;
        this.golongandarah = golongandarah;
        this.jeniskelamin = jeniskelamin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNokk() {
        return nokk;
    }

    public void setNokk(String nokk) {
        this.nokk = nokk;
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

    public String getTempatlahir() {
        return tempatlahir;
    }

    public void setTempatlahir(String tempatlahir) {
        this.tempatlahir = tempatlahir;
    }

    public Date getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(Date tanggallahir) {
        this.tanggallahir = tanggallahir;
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

    public String getStatuspernikahan() {
        return statuspernikahan;
    }

    public void setStatuspernikahan(String statuspernikahan) {
        this.statuspernikahan = statuspernikahan;
    }

    public String getStatuskeluarga() {
        return statuskeluarga;
    }

    public void setStatuskeluarga(String statuskeluarga) {
        this.statuskeluarga = statuskeluarga;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getNopaspor() {
        return nopaspor;
    }

    public void setNopaspor(String nopaspor) {
        this.nopaspor = nopaspor;
    }

    public String getNokitas() {
        return nokitas;
    }

    public void setNokitas(String nokitas) {
        this.nokitas = nokitas;
    }

    public String getNamaayah() {
        return namaayah;
    }

    public void setNamaayah(String namaayah) {
        this.namaayah = namaayah;
    }

    public String getNamaibu() {
        return namaibu;
    }

    public void setNamaibu(String namaibu) {
        this.namaibu = namaibu;
    }

    public String getGolongandarah() {
        return golongandarah;
    }

    public void setGolongandarah(String golongandarah) {
        this.golongandarah = golongandarah;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    
}