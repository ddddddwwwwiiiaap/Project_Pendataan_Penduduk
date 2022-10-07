package com.example.data.penduduk.Data.Penduduk.models.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_pindahPenduduk")
public class PindahPenduduk implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(length=100)
    private String namakepalakeluarga;

    @Column(length=150)
    private String alamatsekarang;

    @Column(length=50)
    private String jumlahkeluargapindah;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pendataanpendudukNIK", referencedColumnName = "NIK")
    private PendataanPenduduk pendataanpenduduk;

    public PindahPenduduk(){
    }

    public PindahPenduduk(Long id, String namakepalakeluarga, String alamatsekarang, String jumlahkeluargapindah,
            PendataanPenduduk pendataanpenduduk) {
        this.id = id;
        this.namakepalakeluarga = namakepalakeluarga;
        this.alamatsekarang = alamatsekarang;
        this.jumlahkeluargapindah = jumlahkeluargapindah;
        this.pendataanpenduduk = pendataanpenduduk;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamakepalakeluarga() {
        return namakepalakeluarga;
    }

    public void setNamakepalakeluarga(String namakepalakeluarga) {
        this.namakepalakeluarga = namakepalakeluarga;
    }

    public String getAlamatsekarang() {
        return alamatsekarang;
    }

    public void setAlamatsekarang(String alamatsekarang) {
        this.alamatsekarang = alamatsekarang;
    }

    public String getJumlahkeluargapindah() {
        return jumlahkeluargapindah;
    }

    public void setJumlahkeluargapindah(String jumlahkeluargapindah) {
        this.jumlahkeluargapindah = jumlahkeluargapindah;
    }

    public PendataanPenduduk getPendataanpenduduk() {
        return pendataanpenduduk;
    }

    public void setPendataanpenduduk(PendataanPenduduk pendataanpenduduk) {
        this.pendataanpenduduk = pendataanpenduduk;
    }

    
}
