/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testview;

import view.TambahPasienBaruDialog;

/**
 *
 * @author Thom
 */
public class testtambahpasienBaruDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    TambahPasienBaruDialog test = new TambahPasienBaruDialog("tambah pasien baru");
    test.setSize(700, 400);       
    test.setVisible(true);
    }
    
}
