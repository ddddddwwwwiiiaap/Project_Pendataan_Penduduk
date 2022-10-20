package com.example.data.penduduk.Data.Penduduk.dto;

import javax.validation.constraints.NotEmpty;

public class KematianPendudukData {

    @NotEmpty(message = "penyebabkematian is required")
    private String penyebabkematian;

    @NotEmpty(message = "tempatkematian is required")
    private String tempatkematian;

    @NotEmpty(message = "tglkematian is required")
    private String tglkematian;

    @NotEmpty(message = "waktukematian is required")
    private String waktukematian;

    @NotEmpty(message = "idNIKpendataanpenduduk is required")
    private String idNIKpendataanpenduduk;

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

    public String getTglkematian() {
        return tglkematian;
    }

    public void setTglkematian(String tglkematian) {
        this.tglkematian = tglkematian;
    }

    public String getWaktukematian() {
        return waktukematian;
    }

    public void setWaktukematian(String waktukematian) {
        this.waktukematian = waktukematian;
    }

    public String getIdNIKpendataanpenduduk() {
        return idNIKpendataanpenduduk;
    }

    public void setIdNIKpendataanpenduduk(String idNIKpendataanpenduduk) {
        this.idNIKpendataanpenduduk = idNIKpendataanpenduduk;
    }

    
}
