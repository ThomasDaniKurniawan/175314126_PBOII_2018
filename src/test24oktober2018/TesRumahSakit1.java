/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test24oktober2018;

import java.io.File;
import model.Pasien;
import model.RumahSakit;

/**
 *
 * @author admin
 */
public class TesRumahSakit1 {
    public static void main(String[] args) {
        Pasien pasien1 = new Pasien();
        pasien1.setNama("Puspa\t");
        pasien1.setAlamat("klaten\n");
        
        Pasien pasien2 = new Pasien();
        pasien2.setNama("Adi\t");
        pasien2.setAlamat("yogya\n");
        
        RumahSakit rs = new RumahSakit("Panti Rapih\t","Yogyakarta");
        
        rs.tambahPasienBaru(pasien1);
        rs.tambahPasienBaru(pasien2);
        
        rs.simpanObjekRumahSakit(new File("rsku.dat"));
        System.out.println(" "+rs.getNama()+","+ rs.getAlamat()  +"\n");
        System.out.println(" "+pasien1.getNama() +pasien1.getAlamat() );
        System.out.println(" "+pasien2.getNama() + pasien2.getAlamat());
        
    }
}
