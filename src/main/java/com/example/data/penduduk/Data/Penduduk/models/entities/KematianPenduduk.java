package com.example.data.penduduk.Data.Penduduk.models.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tbl_KematianPenduduk")
public class KematianPenduduk implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500)
    private String penyebabkematian;

    @Column(length = 100)
    private String tempatkematian;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date tglkematian;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss aa")
    private Time waktukematian;

    private Long idNIKpendataanpenduduk;

    @OneToOne
    @JoinTable(name = "tbl_kematianpenduduk_pendataanpenduduk", joinColumns = @JoinColumn(name = "KematianPenduduk_id"), inverseJoinColumns = @JoinColumn(name = "pendataanpenduduk_nik"))
    private PendataanPenduduk pendataanpenduduk;

    public KematianPenduduk() {

    }

    public KematianPenduduk(Long id, String penyebabkematian, String tempatkematian, Date tglkematian,
            Time waktukematian, Long idNIKpendataanpenduduk, PendataanPenduduk pendataanpenduduk) {
        this.id = id;
        this.penyebabkematian = penyebabkematian;
        this.tempatkematian = tempatkematian;
        this.tglkematian = tglkematian;
        this.waktukematian = waktukematian;
        this.idNIKpendataanpenduduk = idNIKpendataanpenduduk;
        this.pendataanpenduduk = pendataanpenduduk;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPenyebabkematian() {
        return penyebabkematian;
    }

    public void setPenyebabkematian(String penyebabkematian) {
        this.penyebabkematian = penyebabkematian;
    }

    public String getTempatkematian() {
        return tempatkematian;
    }

    public void setTempatkematian(String tempatkematian) {
        this.tempatkematian = tempatkematian;
    }

    public Date getTglkematian() {
        return tglkematian;
    }

    public void setTglkematian(Date tglkematian) {
        this.tglkematian = tglkematian;
    }

    public Time getWaktukematian() {
        return waktukematian;
    }

    public void setWaktukematian(Time waktukematian) {
        this.waktukematian = waktukematian;
    }

    public Long getIdNIKpendataanpenduduk() {
        return idNIKpendataanpenduduk;
    }

    public void setIdNIKpendataanpenduduk(Long idNIKpendataanpenduduk) {
        this.idNIKpendataanpenduduk = idNIKpendataanpenduduk;
    }

    public PendataanPenduduk getPendataanpenduduk() {
        return pendataanpenduduk;
    }

    public void setPendataanpenduduk(PendataanPenduduk pendataanpenduduk) {
        this.pendataanpenduduk = pendataanpenduduk;
    }

}