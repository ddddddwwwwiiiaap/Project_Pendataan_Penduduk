package com.example.data.penduduk.Data.Penduduk.models.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_kematian")
public class Kematian implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(length=500)
    private String penyebab_kematian;

    @Column(length=100)
    private String tempat_kematian;

    private Date tgl_kematian;

    private Time waktu_kematian;

    private Long id_NIKpendataan_penduduk;

    @Column(length=50,  unique = true)
    private String pendataan_pendudukNIK;

    public Kematian(){

    }

    public Kematian(Long id, String penyebab_kematian, String tempat_kematian, Date tgl_kematian, Time waktu_kematian,
            Long id_NIKpendataan_penduduk, String pendataan_pendudukNIK) {
        this.id = id;
        this.penyebab_kematian = penyebab_kematian;
        this.tempat_kematian = tempat_kematian;
        this.tgl_kematian = tgl_kematian;
        this.waktu_kematian = waktu_kematian;
        this.id_NIKpendataan_penduduk = id_NIKpendataan_penduduk;
        this.pendataan_pendudukNIK = pendataan_pendudukNIK;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPenyebab_kematian() {
        return penyebab_kematian;
    }

    public void setPenyebab_kematian(String penyebab_kematian) {
        this.penyebab_kematian = penyebab_kematian;
    }

    public String getTempat_kematian() {
        return tempat_kematian;
    }

    public void setTempat_kematian(String tempat_kematian) {
        this.tempat_kematian = tempat_kematian;
    }

    public Date getTgl_kematian() {
        return tgl_kematian;
    }

    public void setTgl_kematian(Date tgl_kematian) {
        this.tgl_kematian = tgl_kematian;
    }

    public Time getWaktu_kematian() {
        return waktu_kematian;
    }

    public void setWaktu_kematian(Time waktu_kematian) {
        this.waktu_kematian = waktu_kematian;
    }

    public Long getId_NIKpendataan_penduduk() {
        return id_NIKpendataan_penduduk;
    }

    public void setId_NIKpendataan_penduduk(Long id_NIKpendataan_penduduk) {
        this.id_NIKpendataan_penduduk = id_NIKpendataan_penduduk;
    }

    public String getPendataan_pendudukNIK() {
        return pendataan_pendudukNIK;
    }

    public void setPendataan_pendudukNIK(String pendataan_pendudukNIK) {
        this.pendataan_pendudukNIK = pendataan_pendudukNIK;
    }

    
}