package com.example.affirmation.model;

public class Affirmation {
    private Integer teks;
    private Integer gambar;

    public Affirmation(Integer teks,Integer gambar) {
        this.teks = teks;
        this.gambar = gambar;
    }

    public Integer getTeks() {
        return teks;
    }

    public void setTeks(Integer teks) {
        this.teks = teks;
    }

    public Integer getGambar() {
        return gambar;
    }

    public void setGambar(Integer gambar) {
        this.gambar = gambar;
    }

}
