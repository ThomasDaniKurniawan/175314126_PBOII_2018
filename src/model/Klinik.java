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
class Klinik {
   private String idklinik;
   private String nama;
   
   public Klinik() {    };
   // merupakan constructor dari kelas dari sebuah kelas yang dideklarasikan dengan nama Klinik
   
   public void setidklinik(String idklinik){
       this.idklinik = idklinik;
         /* merupakan menthod setidklinik() dengan parameter berupa objek idklinik bertipe String */
         /* menthod akan menjalankan perintah untuk menyimpan nilai dari objek idklinik ke attribute idklinik dan mendeklarasikan attribute
            itu sendiri dengan perintah this*/
   }
   public void setnama(String nama){
       this.nama = nama;
       /* merupakan menthod setnama() dengan parameter berupa objek nama bertipe String */
       /* menthod akan menjalankan perintah untuk menyimpan nilai dari objek nama ke attribute nama dan mendeklarasikan attribute
            itu sendiri dengan perintah this*/
   }
   public String getnama(){
       return nama;
       /* merupakan menthod getnama() dengan parameter nilai dari objek nama*/
       /* menthod akan menjalankan perintah untuk mengembalikan nilai ke attribute nama dengan perintah return*/
   }
   public String getidklinik(){
       return idklinik;
         /* merupakan menthod getidklinik() dengan parameter nilai dari objek idklinik*/
         /* menthod akan menjalankan perintah untuk mengembalikan nilai ke attribute idklinik dengan perintah return*/
   }
}
