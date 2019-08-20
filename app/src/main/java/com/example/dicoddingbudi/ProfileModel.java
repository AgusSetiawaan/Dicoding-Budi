package com.example.dicoddingbudi;

import java.io.Serializable;

public class ProfileModel implements Serializable {

    private String nama;
    private String namaAsli;
    private String namaBeken;
    private String ttl;
    private String nationality;
    private String profesi;
    private String orangTua;
    private String image;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNamaAsli() {
        return namaAsli;
    }

    public void setNamaAsli(String namaAsli) {
        this.namaAsli = namaAsli;
    }

    public String getNamaBeken() {
        return namaBeken;
    }

    public void setNamaBeken(String namaBeken) {
        this.namaBeken = namaBeken;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getProfesi() {
        return profesi;
    }

    public void setProfesi(String profesi) {
        this.profesi = profesi;
    }

    public String getOrangTua() {
        return orangTua;
    }

    public void setOrangTua(String orangTua) {
        this.orangTua = orangTua;
    }
}
