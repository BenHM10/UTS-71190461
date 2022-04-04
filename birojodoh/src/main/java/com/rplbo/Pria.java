package com.rplbo;

public class Pria {
    private String nama;
    private int usia;
    private String status;
    private double jumlahCinta;
    private Perempuan jodoh;
    private Perempuan temanKencan;

    public void PDKT(Perempuan calon) {

    }

    public void MenembakKekasih() {

    }

    public void MengajakKencan(Perempuan perempuan) {
        Perempuan.jumlahCinta = 0;
        Perempuan.jumlahCinta(0);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getJumlahCinta() {
        return jumlahCinta;
    }

    public void setJumlahCinta(double jumlahCinta) {
        this.jumlahCinta = jumlahCinta;
    }

    public Perempuan getJodoh() {
        return jodoh;
    }

    public void setJodoh(Perempuan jodoh) {
        this.jodoh = jodoh;
    }

    public Perempuan getTemanKencan() {
        return temanKencan;
    }

    public void setTemanKencan(Perempuan temanKencan) {
        this.temanKencan = temanKencan;
    }
}
