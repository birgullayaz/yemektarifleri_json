package com.birgulayaz.yemektariflerijson.Model;

public class Yemek {

  private int yemekId;
  private String yemekAdi;
  private String yemekAciklama;
  private String yemekTur;
  private String yemekPisirmeSuresi;
  private String yemekKisiSayisi;
  private String yemekResim;
  private String yemekMalzemeler;

    public Yemek(int yemekId, String yemekAdi, String yemekAciklama, String yemekTur, String yemekPisirmeSuresi, String yemekKisiSayisi, String yemekResim, String yemekMalzemeler) {
        this.yemekId = yemekId;
        this.yemekAdi = yemekAdi;
        this.yemekAciklama = yemekAciklama;
        this.yemekTur = yemekTur;
        this.yemekPisirmeSuresi = yemekPisirmeSuresi;
        this.yemekKisiSayisi = yemekKisiSayisi;
        this.yemekResim = yemekResim;
        this.yemekMalzemeler = yemekMalzemeler;
    }

    public Yemek(int yemekId, String yemekAdi, String yemekAciklama, String yemekTur, String yemekPisirmeSuresi, String yemekHazirlamaSuresi, String yemekKisiSayisi, String yemekResim, String yemekMalzemeler) {
    }

    public int getYemekId() {
        return yemekId;
    }

    public void setYemekId(int yemekId) {
        this.yemekId = yemekId;
    }

    public String getYemekAdi() {
        return yemekAdi;
    }

    public void setYemekAdi(String yemekAdi) {
        this.yemekAdi = yemekAdi;
    }

    public String getYemekAciklama() {
        return yemekAciklama;
    }

    public void setYemekAciklama(String yemekAciklama) {
        this.yemekAciklama = yemekAciklama;
    }

    public String getYemekTur() {
        return yemekTur;
    }

    public void setYemekTur(String yemekTur) {
        this.yemekTur = yemekTur;
    }

    public String getYemekPisirmeSuresi() {
        return yemekPisirmeSuresi;
    }

    public void setYemekPisirmeSuresi(String yemekPisirmeSuresi) {
        this.yemekPisirmeSuresi = yemekPisirmeSuresi;
    }

    public String getYemekKisiSayisi() {
        return yemekKisiSayisi;
    }

    public void setYemekKisiSayisi(String yemekKisiSayisi) {
        this.yemekKisiSayisi = yemekKisiSayisi;
    }

    public String getYemekResim() {
        return yemekResim;
    }

    public void setYemekResim(String yemekResim) {
        this.yemekResim = yemekResim;
    }

    public String getYemekMalzemeler() {
        return yemekMalzemeler;
    }

    public void setYemekMalzemeler(String yemekMalzemeler) {
        this.yemekMalzemeler = yemekMalzemeler;
    }
}
