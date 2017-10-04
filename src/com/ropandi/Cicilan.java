/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ropandi;

/**
 *
 * @author ropandi
 */
class Cicilan {

    private int idBarang;
    private String namaBarang;
    private double hargaBarang;
    private int jangkaWaktu;

    /**
     * @return the idBarang
     */
    public Cicilan(int idBarang, String namaBarang, double hargaBarang, int jangkaWaktu) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jangkaWaktu = jangkaWaktu;
    }

    public double hitungCicilanPerbulan() {
        double cicilanPerBulan = hitungJumlahPinjamanPokokPerBulan() + hitungBungaPokokPerBulan();
        return cicilanPerBulan;
    }

    public int getIdBarang() {
        return idBarang;
    }

    /**
     * @param idBarang the idBarang to set
     */
    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    /**
     * @return the namaBarang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the jumlahCicilanPerBulan
     */
    /**
     * @param jumlahCicilanPerBulan the jumlahCicilanPerBulan to set
     */
    private double hitungJumlahPinjamanPokokPerBulan() {
        double jumlahPinjamanPokokPerBulan = hitungJumlahPinjamanPokok() / getJangkaWaktu();
        return jumlahPinjamanPokokPerBulan; //To change body of generated methods, choose Tools | Templates.
        //To change body of generated methods, choose Tools | Templates.
    }

    public double hitungJumlahPinjamanPokok() {
        return getHargaBarang();//To change body of generated methods, choose Tools | Templates.
    }

    private double hitungBungaPokokPerBulan() {
        double bungaPokokPerBulan = ((getSukuBungaPerTahun() * hitungJumlahPinjamanPokok()) / 12) * getJangkaWaktu();
        return bungaPokokPerBulan; //To change body of generated methods, choose Tools | Templates.
    }

    private double getSukuBungaPerTahun() {
        double sukuBungaPerTahun = 0.0;
        int jangkaWaktu = getJangkaWaktu();
        if (jangkaWaktu >= 6 && jangkaWaktu < 10) {
            sukuBungaPerTahun = 0.03;
        } else if (jangkaWaktu >= 10 && jangkaWaktu < 14) {
            sukuBungaPerTahun = 0.05; //To change body of generated methods, choose Tools | Templates.
        } else if (jangkaWaktu >= 14 && jangkaWaktu < 18) {
            sukuBungaPerTahun = 0.10;
        } else if (jangkaWaktu >= 18 && jangkaWaktu < 24) {
            sukuBungaPerTahun = 0.12;
        } else {
            sukuBungaPerTahun = 0.15;
        }
        return sukuBungaPerTahun;
    }
 public String getSukuBungaPerTahunDalamPersen() {
        int sukuBunga = (int) (getSukuBungaPerTahun() * 100);
        String fmsk = sukuBunga + " %";
        return fmsk;
    }
    /**
     * @return the jangkaWaktu
     */
    public int getJangkaWaktu() {
        return jangkaWaktu;
    }

    /**
     * @param jangkaWaktu the jangkaWaktu to set
     */
    public void setJangkaWaktu(int jangkaWaktu) {
        this.jangkaWaktu = jangkaWaktu;
    }
}
