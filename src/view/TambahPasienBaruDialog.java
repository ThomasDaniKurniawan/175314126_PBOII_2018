/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class TambahPasienBaruDialog extends JDialog {
    private JLabel JudulLabel;
    private JLabel namaLabel;
    private JLabel alamatLabel;
    private JLabel TTLLabel;
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField TTLText;
    private JRadioButton tambahbutton;
    private JButton save;
    private JTextField noRekamMedistext;
    
   public TambahPasienBaruDialog() {
        init();
    }

    public TambahPasienBaruDialog(String title) {
        init();
    }

    public void init() {
        this.setLayout(null);
        
        
        
        JudulLabel = new JLabel("TAMBAH PASIEN ");
        JudulLabel.setBounds(50, 10, 150, 10);
        this.add(JudulLabel);
        
        namaLabel = new JLabel("NAMA");
        namaLabel.setFont(new Font(null,Font.BOLD,14)); 
        namaLabel.setBounds(20, 80, 50, 30);
        this.add(namaLabel);
        
        alamatLabel= new JLabel("ALAMAT");
        alamatLabel.setFont(new Font(null,Font.BOLD,14));
        alamatLabel.setBounds(20, 120, 150, 30);
        this.add( alamatLabel);
      
        TTLLabel= new JLabel("TTL");
        TTLLabel.setFont(new Font(null,Font.BOLD,14));
        TTLLabel.setBounds(20, 160, 150, 30);
        this.add( TTLLabel);
        
        namaText= new JTextField();
        namaText.setFont(new Font(null,Font.TRUETYPE_FONT,16)); 
        namaText.setBounds(90, 80, 150, 30);
        this.add(namaText);
        
        alamatText= new JTextField();
        alamatText.setFont(new Font(null,Font.PLAIN,16));
        alamatText.setBounds(90, 120, 150, 30);
        this.add( alamatText);
      
        TTLText= new JTextField();
        TTLText.setFont(new Font(null,Font.PLAIN,16));
        TTLText.setBounds(90, 160, 150, 30);
        this.add( TTLText);
        

         
        this.setLayout(null);
        save = new JButton("SAVE");
        save.setBounds(100, 300, 100, 30);
        save.setFont(new Font(null,Font.BOLD,20));   
        this.add(save);
}}
