/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lenovo
 */
public class mainPasien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       AntrianKlinik anpas = new AntrianKlinik();
       Pasien pas = new Pasien();
       /* membuat objek baru dari kelas Pasien yang dideklarasikan dengan nama  Pas*/
       Dokter doc = new Dokter();
       // membuat objek baru dari kelas Dokter yang dideklarasikan dengan nama  doc
       Klinik kl = new Klinik();
       // membuat objek baru dari kelas Klinik yang dideklarasikan dengan nama kl

        
       pas.setNoRM("7");
       /* input nilai 7 sebagai parameter dari menthod setnoRekamMedis() yang dijalankan oleh objek pas dari kelas Pasien*/
       pas.setAlamat("jl. sesama, no.1 Rt 2 Rw 3");
       /* input keterangan berupa "jl. sesama, no.1 Rt 2 Rw 3" yang digunakan sebagai parameter menthod setAlamat() yang dijalankan objek pas daeri kelas pasien*/
       pas.setBulanLAhir(11);
        /* input nilai 11 sebagai parameter dari menthod setBulanLAhir() yang dijalankan oleh objek pas dari kelas Pasien*/
       pas.setNama("parjo");
       /* input keterangan berupa "parjo" yang digunakan sebagai parameter menthod setNamat() yang dijalankan objek pas dari kelas pasien*/
       
       pas.setTanggalLahir(2);
       /* input nilai 2 sebagai parameter dari menthod setTanggalLahir() yang dijalankan oleh objek pas dari kelas Pasien*/
//       pas.setTempatLahir("Jayapura");
       /* input keterangan berupa "jayapura" yang digunakan sebagai parameter menthod setTempatLahir() yang dijalankan objek pas dari kelas pasien*/
       pas.settahunLahir(1999);
       /* input nilai 1999 sebagai parameter dari menthod settahunLahir() yang dijalankan oleh objek pas dari kelas Pasien*/

      
        kl.setidklinik("0021.5567.2280");
       /* input keterangan berupa "0021.5567.2280" yang digunakan sebagai parameter menthod setidklinik() yang dijalankan objek kl dari kelas Klinik*/
        kl.setnama("berguna berguna");
       /* input keterangan berupa "berguna berguna" yang digunakan sebagai parameter menthod setnama() yang dijalankan objek kl dari kelas Klinik*/
        anpas.settanggalAntrian(7);
       /* input nilai  17 yang digunakan sebagai parameter menthod settanggalAntrian() yang dijalankan objek pas dari kelas Pasien*/
       
        anpas.setbulanAntrian(9);
       /* input nilai 9 yang digunakan sebagai parameter menthod setbulanAntrian() yang dijalankan objek pas dari kelas Pasien*/     
        anpas.settahunAntrian(2015);
       /* input nilai 2015 yang digunakan sebagai parameter menthod settahunAntrian() yang dijalankan objek pas dari kelas Pasien*/     
        anpas.setKlinik(kl);
       /* input nilai dari objek kl yang digunakan sebagai parameter menthod SetKLinik() yang dijalankan objek pas dari kelas Pasien*/     

       
       doc.setnama("Yohanes");
       /* input keterangan berupa "Yohanes" yang digunakan sebagai parameter menthod setnama() yang dijalankan objek doc dari kelas Dokter*/
       doc.setalamat("Abepura");
       /* input keterangan berupa "Abepura" yang digunakan sebagai parameter menthod setalamat() yang dijalankan objek doc dari kelas Dokter*/     
       doc.setnoPegawai("1223434");
       /* input keterangan berupa "1223434" yang digunakan sebagai parameter menthod setnoPegawai() yang dijalankan objek doc dari kelas Dokter*/       
       doc.settempatlahir("Surabaya");
       /* input keterangan berupa "Surabaya" yang digunakan sebagai parameter menthod settempatlahir() yang dijalankan objek doc dari kelas Dokter*/    
       doc.settanggalLahir(13); 
       /* input nilai 13 yang digunakan sebagai parameter menthod settanggalLahir() yang dijalankan objek doc dari kelas Dokter*/     
      
       
        System.out.println("\t\tklinik :"+kl.getnamaKlinik());
        // cetak dan panggil menthod getnama yang dijalakan objek kl
        System.out.println("\t\tid     :"+kl.getidklinik());
        // cetak dan panggil menthod getidklinik yang dijalankan oleh objek kl
        System.out.println("");
        //
        System.out.println("Data Pasien");
        // 
        System.out.println("nomor rekam medis \t="+pas.getNoRM());
        // cetak "nomor rekam medis" dan panggil menthod getnoRekamMedis() yg tlah dijalankan oleh objek pas
        System.out.println("nama              \t="+pas.getNama());
        // cetak "nama" dan panggil menthod getnama() yang telah dijalankan oleh objek pas
        System.out.println("alamat            \t="+pas.getAlamat());
        // cetak "alamat" dan panggil menthod getAlamat()
        
//        System.out.print("tempat tanggal lahir\t="+pas.getTempatLahir());
        // cetak "tempat tanggal lahi" lalu panggil menthod getTempatLahir()
        System.out.print(","+pas.getTanggalLahir());
        System.out.print("/"+pas.getBulanLahir());
        System.out.println("/"+pas.getTahunLahir());
        System.out.print("tanggal antrian     \t="+anpas.gettanggalAntrian());
        System.out.print("/"+anpas.getbulanAntrian());
        System.out.println("/"+anpas.gettahunAntrian());
//      cetak berupa keterangan dan panggil menthod dari kelas Pasien dan turunan AntrianPasien yang telah dijalakan oleh objek pas

        System.out.println("Dokter-nya");
        System.out.println("nama\t"+doc.getnama());
        System.out.println("np  \t"+doc.getnoPegawai());
        System.out.println("ttl \t"+doc.gettempatLahir());
        System.out.println("");

       
      
        
    }
    
}
