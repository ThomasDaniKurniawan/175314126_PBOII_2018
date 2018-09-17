/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
    private JLabel tgllabel;
    private JComboBox tgl;
    private JLabel blnlabel;
    private JComboBox bln;
    private JLabel thnlabel;
    private JComboBox thn;
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
        JudulLabel.setFont(new Font(null,Font.BOLD,14));
        JudulLabel.setBounds(50, 10, 150, 10);
        this.add(JudulLabel);
        
        namaLabel = new JLabel("NAMA");
        namaLabel.setFont(new Font(null,Font.BOLD,14)); 
        namaLabel.setBounds(20, 50, 50, 30);
        this.add(namaLabel);
        
        alamatLabel= new JLabel("ALAMAT");
        alamatLabel.setFont(new Font(null,Font.BOLD,14));
        alamatLabel.setBounds(20, 90, 150, 30);
        this.add( alamatLabel);
      
        TTLLabel= new JLabel("TANGGAL LAHIR PASIEN");
        TTLLabel.setFont(new Font(null,Font.BOLD,14));
        TTLLabel.setBounds(20, 140, 130, 30);
        this.add( TTLLabel);
        
        this.setLayout(null);
        tgllabel = new JLabel("TANGGAL");
        tgllabel.setFont(new Font(null,Font.BOLD,14)); 
        tgllabel.setBounds(50, 180, 100, 50);
        this.add(tgllabel);
              
        this.setLayout(null);
        blnlabel = new JLabel("BULAN");
        blnlabel.setFont(new Font(null,Font.BOLD,14)); 
        blnlabel.setBounds(250, 180, 100, 50);
        this.add(blnlabel);        
           
        this.setLayout(null);
        thnlabel = new JLabel("TAHUN");
        thnlabel.setFont(new Font(null,Font.BOLD,14)); 
        thnlabel.setBounds(430, 190, 100, 30);
        this.add(thnlabel);
        
        this.setLayout(null);
        tgl = new JComboBox();
        for (int i = 1; i <=31; i++) {
        tgl.addItem(i);
        }
        tgl.setBounds(120, 190, 100, 30);
        this.add(tgl);
        
        this.setLayout(null);
        bln = new JComboBox();
        bln.addItem("January");
        bln.addItem("February");
        bln.addItem("March");
        bln.addItem("April");
        bln.addItem("May");
        bln.addItem("June");
        bln.addItem("July");
        bln.addItem("august");
        bln.addItem("September");
        bln.addItem("October");
        bln.addItem("November");
        bln.addItem("December");
        bln.setBounds(310, 190, 100, 30);
        this.add(bln);
        
        this.setLayout(null);
        thn = new JComboBox();
        for (int i = 1990; i <=2018; i++) {
        thn.addItem(i);
        }
        thn.setBounds(490, 190, 100, 30);
        this.add(thn);
        
        namaText= new JTextField();
        namaText.setFont(new Font(null,Font.TRUETYPE_FONT,16)); 
        namaText.setBounds(90, 50, 150, 30);
        this.add(namaText);
        
        alamatText= new JTextField();
        alamatText.setFont(new Font(null,Font.PLAIN,16));
        alamatText.setBounds(90, 90, 150, 30);
        this.add( alamatText);
         
        this.setLayout(null);
        save = new JButton("SAVE");
        save.setBounds(100, 350, 100, 30);
        save.setFont(new Font(null,Font.BOLD,20));   
        this.add(save);
}}
