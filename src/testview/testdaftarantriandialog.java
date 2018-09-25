/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testview;

import view.DaftarAntrianDialog;

/**
 *
 * @author Lenovo
 */
public class testdaftarantriandialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     DaftarAntrianDialog daftar= new DaftarAntrianDialog("tambah antrian baru");
     daftar.setSize(700, 400);       
     daftar.setVisible(true);    }
    
}
