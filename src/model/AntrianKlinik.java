/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class AntrianKlinik {
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    ArrayList<Pasien> daftarPasienAntri;
    public static ArrayList<AntrianKlinik> daftarAntrian = new ArrayList<AntrianKlinik>();
    
    
    
//        public static void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) throws Exception {
//        AntrianKlinik antri = new AntrianKlinik();
//        antri.settanggalAntrian(tanggal);
//        antri.setbulanAntrian(bulan);
//        antri.settahunAntrian(tahun);
//        antri.SetKLinik(klinik);
//        // cari antrian dalam list daftarAntri
//        if (cariAntrian(tanggal, bulan, tahun, klinik) <0) {
//           daftarAntrian.add(antri);
//        } else {
//            System.out.println("antrian sudah ada");
//        }
//    }
//        public static int cariAntrian(int tglantri,int blnantri,int thnantri,Klinik klinik) {
//        return -1; // index list
//    }
//        public void daftarpasien(Pasien pasien, int tanggal,int bulan, int tahun){
//        this.tanggalAntrian = tanggal;
//        this.bulanAntrian = bulan;
//        this.tahunAntrian = tahun;
//    }
        
        
    public AntrianKlinik(){
    }

    public AntrianKlinik(int tanggalAntrian, int bulanAntrian, int tahunAntrian, Klinik klinik) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
        this.tahunAntrian = tahunAntrian;
        this.klinik = klinik;
    }
     public void mendaftar(Pasien pasien){
        getDaftarPasien().add(pasien);
    } 
     
    
    public ArrayList<Pasien> getDaftarPasien() {       
        return daftarPasienAntri;
    }
    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        this.daftarPasienAntri = daftarPasien;
    }
  
//
//    public ArrayList<Pasien> getDaftarPasienAntri() {
//        return daftarPasienAntri;
//    }
//
//    public void setDaftarPasienAntri(ArrayList<Pasien> daftarPasienAntri) {
//        this.daftarPasienAntri = daftarPasienAntri;
//    }
    
      
    
    
    public void settanggalAntrian(int tanggalAntrian)throws Exception{
        if (tanggalAntrian < 32 && tanggalAntrian > 0) {
            this.tanggalAntrian = tanggalAntrian;
    } else { throw new Exception(JOptionPane.showInputDialog(null," tanggal tidak valid"));
    
       /* merupakan menthod settanggalAntrian dengan parameter nilai dari objek tanggalAntrian bertipe integer,menthod diberikan kode
             throws exception untuk melemparkan kondisi yang mencegah eksekusi berjalan normal atau exception dari menthod settanggalAntrian*/
       /* jika noRekamMedis yang diinput bernilai kurang dari 32 dan lebih dari 0 maka program
            akan menjalankan perintah untuk menyimpan nilai dari objek tanggalAntrian ke attribute tanggalAntrian yang mendeklarasikan attribute
            itu sendiri dengan perintah this*/
       /* jika salah atau terdapat error maka menthod settanggalAntrian() akan melemparkan exception ke baris selanjutnya atau dalam peristiwa ini 
            adalah "tanggal tidak valid"*/
        }
     }
    public void setbulanAntrian(int bulanAntrian) throws Exception{
        if (bulanAntrian < 13 && bulanAntrian > 0) {
            this.bulanAntrian = bulanAntrian;
        }  else { throw new Exception(" bulan anda salah");
         /* merupakan menthod setbulanAntrian() dengan parameter nilai dari objek bulanAntrian bertipr integer, menthod ini diberi kode
             throws exception untuk melemparkan kondisi yang mencegah eksekusi berjalan normal atau exception dari menthod setbulanAntrian() */
         /* jika bulanAntrian yang diinput bernilai kurang dari 13 dan lebih dari 0 maka program
            akan menjalankan perintah untuk menyimpan nilai dari objek bulanAntrian ke attribute bulanAntrian yang mendeklarasikan attribute
            itu sendiri dengan perintah this*/
         /* jika salah atau terdapat error maka menthod setbulanAntrian() akan melemparkan exception ke baris selanjutnya atau dalam peristiwa ini 
            adalah " bulan anda salah "*/
        }  
    }
    public void settahunAntrian(int tahunAntrian) throws Exception {
        if (tahunAntrian > 0) {
            this.tahunAntrian = tahunAntrian;
        } else { throw new Exception(" tahun anda salah");
        
        /* merupakan menthod settahunAntrian() dengan parameter nilai dari objek tahunAntrian bertipe integer, menthod ini diberi kode
             throws exception untuk melemparkan kondisi yang mencegah eksekusi berjalan normal atau exception dari menthod settahunAntrian() */
         /* jika tahunAntrian yang diinput bernilai  lebih dari 0 maka program
            akan menjalankan perintah untuk menyimpan nilai dari objek tahunAntrian ke attribute tahunAntrian yang mendeklarasikan attribute
            itu sendiri dengan perintah this*/
         /* jika salah atau terdapat error maka menthod settahunAntrian() akan melemparkan exception ke baris selanjutnya atau dalam peristiwa ini 
            adalah " tahun anda salah "*/
        }
    }
    public void setKlinik(Klinik klinik){
        this.klinik = klinik;
        
        /* merupakan menthod setKlinik() dengan parameter nilai dari objek klinik yang bertipe Klinik, menthod ini diberi kode
             throws exception untuk melemparkan kondisi yang mencegah eksekusi berjalan normal atau exception dari menthod setKlinik() */
        /* menthod akan menjalankan perintah untuk menyimpan nilai dari objek klinik ke attribute klinik dan mendeklarasikan attribute
            itu sendiri dengan perintah this*/
       
    }
    public int gettanggalAntrian(){
        return tanggalAntrian;
        /* merupakan menthod gettanggalAntrian() dengan parameter nilai dari objek tanggalAntrian */
         /* menthod akan menjalankan perintah untuk mengembalikan nilai ke attribute tanggalAntrian dengan perintah return*/
    }
    public int getbulanAntrian(){
        return bulanAntrian;
          /* merupakan menthod getbulanAntrian() dengan parameter nilai dari objek bulanAntrian*/
         /* menthod akan menjalankan perintah untuk mengembalikan nilai ke attribute bulanAntrian dengan perintah return*/
    }
    public int gettahunAntrian(){
        return tahunAntrian;
         /* merupakan menthod gettahunAntrian() dengan parameter nilai dari objek tahunAntrian*/
         /* menthod akan menjalankan perintah untuk mengembalikan nilai ke attribute tahunAntrian dengan perintah return*/
    }
    public Klinik getklinik(){
        return klinik;
         /* merupakan menthod getklinik() dengan parameter nilai dari objek klinik*/
         /* menthod akan menjalankan perintah untuk mengembalikan nilai ke attribute klinik dengan perintah return*/
    }
    public String toString() {
        return String.valueOf(tahunAntrian)
                + String.valueOf(bulanAntrian)
                + String.valueOf(tanggalAntrian)
                + klinik.getidklinik()
                + klinik.getnamaKlinik();
    }
   }





