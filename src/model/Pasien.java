/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Pasien {

    private String noRekamMedis;
    private String nama;
    private String alamat, tempatLahir;
    private int tanggalLahir, BulanLahir, tahunLahir;
    private String nik;
    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<Pasien>();

    public Pasien(String nama, String alamat, String temlahir, int i, int j, int k, String nik) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = temlahir;
        this.tanggalLahir = i;
        this.BulanLahir = j;
        this.tahunLahir = k;
        this.nik = nik;
    }

    public static void tambahPasienBaru(Pasien pasien) {
//        Pasien.daftarPasienKlinik.add(pasien);

    }

    public static Pasien cariPasien(String NoRM) {
        for (int i = 0; i < GetDaftarPasien().size(); i++) {
            if (GetDaftarPasien().get(i).getnoRekamMedis().equalsIgnoreCase(NoRM)) {
                return GetDaftarPasien().get(i);
            }
        }
        return null;
    }

    public String toString() {
        return nama + "," + alamat;
    }

    public static ArrayList<Pasien> GetDaftarPasien() {
        return daftarPasienKlinik;

    }

    public static void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        daftarPasienKlinik = daftarPasien;
    }

    public Pasien() {
    }

    // merupakan constructor dari kelas pasien
    public void setnik() {
        this.nik = nik;
    }

    public void setnoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;

        /* merupakan menthod setnoRekamMedis dengan parameter nilai dari objek noRekamMedis  yang diberikan kode
             throws exception untuk melemparkan kondisi yang mencegah eksekusi berjalan normal atau exception dari menthod setnoRekamMedis*/
 /* jika noRekamMedis yang diinput berniali kurang dari 21 dan lebih dari 5 maka program
            akan menjalankan perintah untuk menyimpan nilai dari objek noRekamMedis ke attribute noRekamMedis yang mendeklarasikan attribute
            itu sendiri dengan perintah this*/
 /* jika salah atau terdapat error maka menthod setnoRekamMedis() akan melemparkan exception ke baris 33 atau dalam peristiwa ini 
            adalah nomor rekam medis dibatasi 6 sampai 20*/
    }

    public void setNama(String nama) {
        this.nama = nama;

        /* menthod yang dideklarasikan dengan nama setNama() bersifat public yang memiliki nilai parameter berupa objek nama bertipe string
        menthod ini yang akan menjalankan perintah untuk menyimpan nilai dari objek nama ke attribute nama yang mendeklarasikan attribute itu sendiri
        dengan perintah this*/
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        /* menthod dideklarasikan dengan nama setAlamat() bersifat public yang memiliki nilai parameter berupa objek alamat bertipe string
       menthod ini akan menjalankan perintah untuk menyimpan nilai dari objek alamat ke attribute alamat yang mendeklarasikan attribute 
        itu sendiri dengan perintah this*/
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;

        /* menthod  dideklarasikan dengan nama setTempatLahir dengan parameter objek tempatLahir dngan tipe string
        lalu  menthod ini akan menjalankan perintah untuk menyimpan nilai dari objek tempatLahir ke attribute tempatLahir yang mendeklarasikan attribute 
        itu sendiri dengan perintah this*/
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir < 32 && tanggalLahir > 0) {

            this.tanggalLahir = tanggalLahir;

        } else {
            throw new Exception("cuma ada tanggal 1 sampai 31");

            /* menthod dideklarasikan dengan nama setTanggalLahir dengan parameter objek tanggalLahir bertipe integer diberikan kode
             throws exception pada menthod ini yang untuk melemparkan kondisi yang mencegah eksekusi berjalan normal atau exception
            dari menthod setnoRekamMedis*/
 /* akan diberikan sebuah kondisi jika nilai dari objek tanggalLahir lebih kecil dari 32 dan lebih besar dari 0 maka
            menthod ini akan menjalankan perintah untuk menyimpan nilai dari objek tanggalLahir ke attribute tanggalLahir yang mendeklarasikan attribute 
             itu sendiri dengan perintah this*/
 /* jika salah atau terdapat error maka menthod setnoRekamMedis() akan melemparkan exception ke baris 66 atau dalam peristiwa ini 
            adalah "cuma ada tanggal 1 sampai 31*/
        }
    }

    public void setBulanLAhir(int BulanLahir) throws Exception {
        if (BulanLahir < 13 && BulanLahir > 0) {

            this.BulanLahir = BulanLahir;

        } else {
            throw new Exception("jumlah bulan hanya 12");

            /* menthod dideklarasikan dengan nama setBulanlLAhir dengan parameter objek BulanlLahir bertipe integer diberikan kode
             throws exception pada menthod ini yang untuk melemparkan kondisi yang mencegah eksekusi berjalan normal atau exception
            dari menthod setBulanlLAhir*/
 /* akan diberikan sebuah kondisi jika nilai dari objek BulanLahir lebih kecil dari 13 dan lebih besar dari 0 maka
            menthod ini akan menjalankan perintah untuk menyimpan nilai dari objek BulanLahir ke attribute BulanLahir yang mendeklarasikan attribute 
             itu sendiri dengan perintah this*/
 /* jika salah atau terdapat error maka menthod setBulanLAhir akan melemparkan exception ke baris selanjutnya atau dalam peristiwa ini 
            adalah "jumlah bulan cuma 12" dengan perintah throw new exception*/
        }
    }

    public void settahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("tahun lahir salah");

            /* menthod dideklarasikan dengan nama settahunLahir dengan parameter objek tahunLahir bertipe integer diberikan kode
             throws exception pada menthod ini yang untuk melemparkan kondisi yang mencegah eksekusi berjalan normal atau exception
            dari menthod settahunLahirr*/
 /* akan diberikan sebuah kondisi jika nilai dari objek tahunLahir  lebih besar dari 0 maka
            menthod ini akan menjalankan perintah untuk menyimpan nilai dari objek BulanLahir ke attribute BulanLahir yang mendeklarasikan attribute 
             itu sendiri dengan perintah this*/
 /* jika salah atau terdapat error maka menthod settahunLahir akan melemparkan exception ke baris selanjutnya atau dalam peristiwa ini 
            adalah "tahun lahir salah" dengan perintah throw new exception*/
        }
    }

    public String getnoRekamMedis() {
        return noRekamMedis;

        /* menthod dideklarasikan dengan nama getnoRekamMedis() bertipe integer
              menthod ini akan mengembalikan nilai dari objek noRekamMedis dengan perintah return */
    }

    public String getNama() {
        return nama;

        /* menthod dideklarasikan dengan nama getNama()bertipe string
              menthod ini akan mengembalikan nilai dari objek nama dengan perintah return */
    }

    public String getAlamat() {
        return alamat;

        /* menthod dideklarasikan dengan nama getAlamat() bertipe string
              menthod ini akan mengembalikan nilai dari objek alamat dengan perintah return */
    }

    public String getTempatLahir() {
        return tempatLahir;

        /* menthod dideklarasikan dengan nama getTempatLahir() bertipe string
              menthod ini akan mengembalikan nilai dari objek tempatLahir dengan perintah return */
    }

    public int getTanggalLahir() {
        return tanggalLahir;

        /* menthod dideklarasikan dengan nama getTanggalLahir() bertipe integer
              menthod ini akan mengembalikan nilai dari objek tanggalLahir dengan perintah return */
    }

    public int getBulanLAhir() {
        return BulanLahir;

        /* menthod dideklarasikan dengan nama getBulanLAhir() bertipe int
              menthod ini akan mengembalikan nilai dari objek BulanLahir dengan perintah return */
    }

    public int gettahunLahir() {
        return tahunLahir;

        /* menthod dideklarasikan dengan nama gettahunLahir() bertipe int
              menthod ini akan mengembalikan nilai dari objek tahunLahir dengan perintah return */
    }

    public String getnik() {
        return nik;
    }
}
