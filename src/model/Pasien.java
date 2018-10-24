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
 * @author Lenovo
 */
public class Pasien {

    private String nama;
    private int tanggalLahir;
    private int bulanLahir, tahunLahir;   
    private String alamat;
    private String noRM;
    private String nik;
   
    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<Pasien>();

    public Pasien(String nama) {
        this.nama = nama;
    }

    public Pasien(String nama, String noRM) {
        this.nama = nama;
        this.noRM = noRM;
    }


        public static void tambahPasien(Pasien pasien){
        GetDaftarPasien().add(pasien);
    }
    public static void tambahPasienBaru(Pasien pasien) {
    daftarPasienKlinik.add(pasien);

    }

    public static Pasien cariPasien(String NoRM) {
        for (int i = 0; i < GetDaftarPasien().size(); i++) {
            if (GetDaftarPasien().get(i).getNoRM().equalsIgnoreCase(NoRM)) {
                return GetDaftarPasien().get(i);
            }
        }
        return null;
    }
    
    public static void simpanDaftarPasien(File file){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < daftarPasienKlinik.size(); i++) {
                String data = daftarPasienKlinik.get(i).toString();
                fos.write(data.getBytes());
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void bacaDaftarPasien(File file){
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

    public static ArrayList<Pasien> GetDaftarPasien() {
        return daftarPasienKlinik;

    }

    public static void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        daftarPasienKlinik = daftarPasien;
    }

    public Pasien() {
    }

    public Pasien(String puspa, String klaten, String medan, int i, int i0, int i1, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pasien(String nama, int tanggalLahir, int bulanLahir, int tahunLahir, String alamat, String noRM, String nik) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        this.alamat = alamat;
        this.noRM = noRM;
        this.nik = nik;
    }
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUsia(){
        return 0;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoRM() {
        return noRM;
    }

    public void setNoRM(String noRM) {
        this.noRM = noRM;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir < 32 && tanggalLahir > 0) {

            this.tanggalLahir = tanggalLahir;

        } else {
            throw new Exception("cuma ada tanggal 1 sampai 31");
 }
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }
     public void setBulanLAhir(int BulanLahir) throws Exception {
        if (BulanLahir < 13 && BulanLahir > 0) {

            this.bulanLahir= BulanLahir;

        } else {
            throw new Exception("jumlah bulan hanya 12");

           }
    }

    public int getBulanLahir() {
        return bulanLahir;
    }
      public void settahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("tahun lahir salah");

          }
    }

    public int getTahunLahir() {
        return tahunLahir;
    }
      public String toString(){
          return noRM +"\t"+nama +"\t"+ alamat +"\t"+tanggalLahir +"\t"+bulanLahir+"\t"+tahunLahir;    // mengubah nama, noRM,alamat ke string walaupun sudah string agar bisa dibaca di teststream
      }

    public void setnoRekamMedis(String noRM) {
        this.noRM = noRM ;
    }
    
}
    
///    public String toString() {
//        return noRekamMedis+"\t"+nama + "\t" + alamat +"\n";
//    }
//}
