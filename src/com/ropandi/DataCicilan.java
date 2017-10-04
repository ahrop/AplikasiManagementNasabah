/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ropandi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ropandi
 */
public class DataCicilan extends ProfilNasabah {
    private List <Cicilan> cicilanList;

    public DataCicilan(long Id, String nama, long noKontak, String email, int jenisKelamin, int status, int umur, String pekerja, String alamat) {
        super(Id, nama, noKontak, email, jenisKelamin, status, umur, pekerja, alamat);
        this.cicilanList = new ArrayList();
    }
    public int jumlahCicilan() {
        int jumlah = 0;
        for (Cicilan cicilan : cicilanList) {
            jumlah ++;
            
        }
        return jumlah;
    }
    public String getGender() {
        String gender = "Laki-Laki";
        if(getGenderValue() ==1)
            gender ="Perempuan";
        return gender;
    }
    public Boolean getMarrige() {
        Boolean marriage = false;
        if(getStatusValue()==1)
            marriage =true;
        return marriage;
    }
    public String listNamaCicilan () {
        int count = 0;
      StringBuilder sb = new StringBuilder();
      for (Cicilan cicilan : cicilanList) {
          count ++;
          sb.append(cicilan.getNamaBarang());
          if(count != cicilanList.size() && count != (cicilanList.size()-1)) {
          sb.append(", ");
          } else if ( count == (cicilanList.size() - 1) && count != cicilanList.size()) {
          sb.append(" dan ");
          }else {
          sb.append(".");
          }
     
}
       return sb.toString();
    } 
    /**
     * @return the cicilan
     */
     public double calculateTotalCicilanPerbulan() {
       double total = 0.0;
       for (Cicilan cicil: cicilanList ){
           total += cicil.hitungCicilanPerbulan();
           
       }
       return total;
   }
    public List <Cicilan> getCicilanList() {
        return cicilanList;
    }

    /**
     * @param cicilanList the cicilan to set
     */
    public void setCicilanList(List <Cicilan> cicilanList) {
        this.cicilanList = cicilanList;
    }

    
    
}
