package com.example.data.penduduk.Data.Penduduk.dto;

import javax.validation.constraints.NotEmpty;

public class PindahPendudukData {
    
    @NotEmpty(message = "namakepalakeluarga is required")
    private String namakepalakeluarga;

    @NotEmpty(message = "alamatsekarang is required")
    private String alamatsekarang;

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
}