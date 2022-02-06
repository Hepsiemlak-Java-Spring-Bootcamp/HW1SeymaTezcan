package com.company.entities.concretes;

import com.company.entities.abstracts.Entity;

import java.util.*;

public class Kullanici implements Entity {


    private String email;
    private String sifre;
    Set<Ilan> favoriIlanlar=new HashSet<>();
    List<Ilan> yayinlananIlanlar=new ArrayList<>();
    List<Mesaj> mesajlar;
    List<KayitliArama> kayitliAramalar;

    public Kullanici() {
    }

    public Kullanici(String email) {
        this.email = email;
    }

    public Kullanici(String email, String sifre) {
        this.email = email;
        this.sifre = sifre;
    }

    public Set<Ilan> getFavoriIlanlar() {
        return favoriIlanlar;
    }

    public void setFavoriIlanlar(Set<Ilan> favoriIlanlar) {
        this.favoriIlanlar = favoriIlanlar;
    }

    public List<Ilan> getYayinlananIlanlar() {
        return yayinlananIlanlar;
    }

    public void setYayinlananIlanlar(List<Ilan> yayinlananIlanlar) {
        this.yayinlananIlanlar = yayinlananIlanlar;
    }

    public List<Mesaj> getMesajlar() {
        return mesajlar;
    }

    public void setMesajlar(List<Mesaj> mesajlar) {
        this.mesajlar = mesajlar;
    }

    public List<KayitliArama> getKayitliAramalar() {
        return kayitliAramalar;
    }

    public void setKayitliAramalar(List<KayitliArama> kayitliAramalar) {
        this.kayitliAramalar = kayitliAramalar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

}
