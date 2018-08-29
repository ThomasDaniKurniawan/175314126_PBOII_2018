/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class pasien {
    private String nama;
    private String noRekamMedis;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    
    public pasien(){    }
    
    public void setnama(String nama){
        this.nama = nama;
    }
    public void setNORekamMEdis(String noRekamMedis){
        this.noRekamMedis = noRekamMedis;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setTempatLahir(String tempatLahir){
        this.tempatLahir = tempatLahir;
    }
    public void settanggalLahir(int tanggalLahir) throws Exception{
        if (tanggalLahir < 32 && tanggalLahir > 0) {
            this.tanggalLahir = tanggalLahir;
        }else {
            throw new Exception("tanggal salah");
        }
    }
    public void setbulanLahir(int bulanLahir)throws Exception{
        if (bulanLahir <13 && bulanLahir > 0) {
            this.bulanLahir = bulanLahir;
        }else { throw new Exception("bulan salah");  
    }
    }public void settahunLahir(int tahunLahir)throws Exception{
            if (tahunLahir > 0) {
                this.tahunLahir = tahunLahir;
            }else { throw new Exception("tahun tidak valid");
    }
}
}