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
public class Dokter {
   private String nopegawai;
   private String nama;
   private String alamat;
   private String temLahir;
   private int tglLahir;
   
   public Dokter(){  }
   // merupakan consructor dari kelas yang dideklarasikan dengan nama Dokter
  
   public void setnoPegawai(String nopegawai){
       this.nopegawai = nopegawai;
         /* merupakan menthod setnopegawai() dengan parameter nilai dari objek nopegawai bertipe String */
         /* menthod akan menjalankan perintah untuk menyimpan nilai dari objek nopegawai ke attribute nopegawai dan mendeklarasikan attribute
            itu sendiri dengan perintah this*/
   }
   public void setnama(String nama){
     this.nama = nama;
         /* merupakan menthod setnama() dengan parameter berupa objek nama bertipe String */
         /* menthod akan menjalankan perintah untuk menyimpan nilai dari objek nama ke attribute nama dan mendeklarasikan attribute
            itu sendiri dengan perintah this*/
   }
   public void setalamat(String alamat){
       this.alamat = alamat;
         /* merupakan menthod setalamat() dengan parameter berupa objek alamat bertipe String */
         /* menthod akan menjalankan perintah untuk menyimpan nilai dari objek alamat ke attribute alamat dan mendeklarasikan attribute
            itu sendiri dengan perintah this*/
   }
   public void settempatlahir(String temLahir){
       this.temLahir = temLahir;
         /* merupakan menthod settempatlahir() dengan parameter berupa objek temlahir bertipe String */
         /* menthod akan menjalankan perintah untuk menyimpan nilai dari objek temlahir ke attribute temlahir dan mendeklarasikan attribute
            itu sendiri dengan perintah this*/
   }
   public void settanggalLahir(int tglLahir){
       this.tglLahir = tglLahir;
        /* merupakan menthod settanggalLahir() dengan parameter berupa objek tglLahir bertipe int */
         /* menthod akan menjalankan perintah untuk menyimpan nilai dari objek tglLahir ke attributetglLahir dan mendeklarasikan attribute
            itu sendiri dengan perintah this*/
   }
   public String getnoPegawai(){
       return nopegawai;
         /* merupakan menthod getnoPegawai() dengan parameter nilai dari objek noPegawai*/
         /* menthod akan menjalankan perintah untuk mengembalikan nilai ke attribute noPegawai dengan perintah return*/
   }
  public String getnama(){
      return nama;
         /* merupakan menthod getnama() dengan parameter nilai dari objek nama*/
         /* menthod akan menjalankan perintah untuk mengembalikan nilai ke attribute nama dengan perintah return*/
  }
  public String getalamat(){
      return alamat;
         /* merupakan menthod getalamat) dengan parameter nilai dari objek alamat*/
         /* menthod akan menjalankan perintah untuk mengembalikan nilai ke attribute alamat dengan perintah return*/
  }
  public String gettempatLahir(){
      return temLahir;
       /* merupakan menthod gettempatLahir() dengan parameter nilai dari objek temLahir*/
       /* menthod akan menjalankan perintah untuk mengembalikan nilai ke attribute temLahir dengan perintah return*/
  }
  public int tanggalLahir(){
      return tglLahir;
       /* merupakan menthod gettanggalLahir() dengan parameter nilai dari objek  tglLahir*/
       /* menthod akan menjalankan perintah untuk mengembalikan nilai ke attribute  tglLahir dengan perintah return*/
  }
}

