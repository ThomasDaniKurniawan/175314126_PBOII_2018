/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class RumahSakit {
    private String nama;
    private String alamat;
    public static ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    public static ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();
    private ArrayList<AntrianKlinik> daftarAntrianKlinik;

    public RumahSakit() {
    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public void tambahPasien(Pasien pasien){
       getDaftarPasien().add(pasien);
    }
    public Pasien cariPasien(String noRM){
    for (int i = 0; i < getDaftarPasien().size(); i++) {
       if(getDaftarPasien().get(i).getNoRM().equalsIgnoreCase(noRM))
                return getDaftarPasien().get(i);
        }
        return null;
    }   
    
    public void tambahPasienBaru(Pasien test){
        getDaftarPasien().add(test);
    }
    public void simpanDaftarPasien(File file){
         try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < getDaftarPasien().size(); i++) {
                String data = getDaftarPasien().get(i).toString();
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
     public void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        try {
            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;
            
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    hasilBaca = hasilBaca + (char) dataInt;
                } else {
                    Pasien temp = new Pasien();
                    temp.setNama(hasilBaca);
                    tambahPasienBaru(temp);
                }
            }
            System.out.println(hasilBaca);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}   
    public void simpanObjekRumahSakit(File file){
        
    }
    public void bacaObjekRumahSakit(File file){
        
    }

    public  ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public static void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        RumahSakit.daftarPasien = daftarPasien;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void tambahKlinik(Klinik klinik){
        
    }
    public Klinik cariKlinik(String namaKlinik){
      for (int i = 0; i < getDaftarKlinik().size(); i++) {
            if(getDaftarKlinik().get(i).
                    getnamaKlinik().equalsIgnoreCase(namaKlinik))
            {
                return getDaftarKlinik().get(i);
            }
        }
        return null;
//}
    }
    public void buatAntrianKlinik(int tanggal, int bulan, int tahun, Klinik klinik){
        try {
            AntrianKlinik antrian = new AntrianKlinik();
            antrian.settanggalAntrian(tanggal);
            antrian.setbulanAntrian(bulan);
            antrian.settahunAntrian(tahun);
            antrian.setKlinik(klinik);
            // cari antrian dalam list daftarAntri
            if (cariAntrianKlinik(tanggal, bulan, tahun, klinik) <0) {
                // tambah dalam list antrian
                daftarAntrianKlinik.add(antrian);
            } else {
                System.out.println("antrian sudah ada");
            }
        } catch (Exception ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }
}    
    public int cariAntrianKlinik(int tanggal, int bulan, int tahun, Klinik klinik){
       return -1;
    }
    public static void daftarPasien(Pasien pasien,int tanggal,int bulan, int tahun,Klinik klinik) {
    
      /**
     * @return the daftarAntrianKlinik
     */
    }
    public ArrayList<AntrianKlinik> getDaftarAntrianKlinik(ArrayList<AntrianKlinik> daftarAntrianKlinik) {
        return daftarAntrianKlinik;
    }

    /**
     * @param daftarAntrianKlinik the daftarAntrianKlinik to set
     */
    public void setDaftarAntrianKlinik(ArrayList<AntrianKlinik> daftarAntrianKlinik) {
        this.daftarAntrianKlinik = daftarAntrianKlinik;
    }

    /**
     * @return the daftarKlinik
     */
    public ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    /**
     * @param daftarKlinik the daftarKlinik to set
     */
    public void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        this.daftarKlinik = daftarKlinik;
    }
}


