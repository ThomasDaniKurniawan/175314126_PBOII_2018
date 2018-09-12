/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author admin
 */
public class tambahpasienbarudialog extends JDialog {

  private JLabel JudulLabel;
    private JLabel namaLabel;
    private JLabel noRekamMedis;
    private JLabel alamat;
    
   public tambahpasienbarudialog() {
        init();
    }

    public tambahpasienbarudialog(String title) {
    this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);
        
        
        
        JudulLabel = new JLabel("PASIEN BARU");
        JudulLabel.setBounds(50, 10, 150, 10);
        this.add( JudulLabel);
        
        noRekamMedis = new JLabel("NoRM");
        noRekamMedis.setBounds(50, 50, 50, 10);
        this.add(noRekamMedis);
        
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(50, 70, 50, 10);
        this.add(namaLabel);
        
        alamat = new JLabel("tgl lahir");
        alamat.setBounds(50, 90, 50, 10);
        this.add( alamat);
        
   
    }
    }
    

