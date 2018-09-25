/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import model.Pasien;



/**
 *
 * @author Lenovo
 */
public class TambahPasienBaruDialog extends JDialog implements ActionListener{

    private JRadioButton male;
    private JRadioButton female;
    private JLabel jeniskelammin;
    private JLabel JudulLabel;
    private JLabel NoRMLabel;
    private JLabel namaLabel;
    private JLabel alamatLabel;
    private JLabel TTLLabel;
    private JLabel tgllabel;
    private JLabel blnlabel;
    private JLabel thnlabel;
    private JTextField namaText;
    private JTextField alamatText;
//    private JTextField TTLText;
    private JTextField noRekamMedistext;
    private JComboBox tgl;
    private JComboBox bln;
    private JComboBox thn;
//    private JRadioButton tambahbutton;
    private JButton save;
    
    public TambahPasienBaruDialog() {
        Pasien pas = new Pasien();
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
        
        NoRMLabel = new JLabel("NoRM");
        NoRMLabel.setFont(new Font(null,Font.BOLD,14)); 
        NoRMLabel.setBounds(290, 70, 50, 30);
        this.add(NoRMLabel);
        
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
        TTLLabel.setBounds(20, 170, 170, 40);
        this.add( TTLLabel);
        
        this.setLayout(null);
        tgllabel = new JLabel("TANGGAL");
        tgllabel.setFont(new Font(null,Font.BOLD,14)); 
        tgllabel.setBounds(50, 210, 100, 50);
        this.add(tgllabel);
              
        this.setLayout(null);
        blnlabel = new JLabel("BULAN");
        blnlabel.setFont(new Font(null,Font.BOLD,14)); 
        blnlabel.setBounds(250, 210, 100, 50);
        this.add(blnlabel);        
           
        this.setLayout(null);
        thnlabel = new JLabel("TAHUN");
        thnlabel.setFont(new Font(null,Font.BOLD,14)); 
        thnlabel.setBounds(430, 220, 100, 30);
        this.add(thnlabel);
        
        jeniskelammin = new JLabel("Jenis Kelamin");
        // pengaturan posisi label : posisi 50,250, lebar 50, tinggi 10
        jeniskelammin.setBounds(50, 140, 150, 20);
        jeniskelammin.setFont(new Font(null,Font.BOLD,16));
        this.add(jeniskelammin);
        
        male = new JRadioButton("Lelaki");
        male.setBounds(200, 140, 150, 20);
        male.setFont(new Font(null,Font.PLAIN,14));
        male.setBackground(Color.GRAY);
        this.add(male);
        
        female = new JRadioButton("perempuan");
        female.setBounds(380, 140, 150, 20);
        female.setFont(new Font(null,Font.PLAIN,14));
        female.setBackground(Color.GRAY);
        this.add(female);
        
        ButtonGroup kelaminButtonGroup = new ButtonGroup();
        kelaminButtonGroup.add(male);
        kelaminButtonGroup.add(female);
        
        this.setLayout(null);
        noRekamMedistext = new JTextField();
        noRekamMedistext.setBounds(350, 70, 100, 30);
        this.add(noRekamMedistext);
        
        this.setLayout(null);
        tgl = new JComboBox();
        for (int i = 1; i <=31; i++) {
        tgl.addItem(i);
        }
        tgl.setBounds(120, 220, 100, 30);
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
        bln.setBounds(310, 220, 100, 30);
        this.add(bln);
        
        this.setLayout(null);
        thn = new JComboBox();
        for (int i = 1990; i <=2018; i++) {
        thn.addItem(i);
        }
        thn.setBounds(490, 220, 100, 30);
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
        save.setBounds(200, 300, 100, 30);
        save.setFont(new Font(null,Font.BOLD,20));   
        this.add(save);
    
        save.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save) {
            Pasien pas = new Pasien();
            pas.setnoRekamMedis(noRekamMedistext.getText());
            pas.setNama(namaText.getText());
            pas.setAlamat(alamatText.getText());
            Pasien.tambahPasienBaru(pas);
//            this.dispose();
        }
    }
    
 }

