/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.ActiveEvent;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import model.Pasien;

/**
 *
 * @author Tom
 */
public class DaftarAntrianDialog extends JDialog implements ActionListener {

    private JLabel JudulLabel;
    private JLabel noRekamMedisLabel;
    private JLabel alamatlabel;
    private JLabel namaLabel;
    private JLabel tgllabel;
    private JComboBox tgl;
    private JLabel blnlabel;
    private JComboBox bln;
    private JLabel thnlabel;
    private JComboBox thn;
    private JButton daftar;
    private JTextField noRekamMedistext;
    private JTextField namaText;
    private JTextField alamatText;

    public DaftarAntrianDialog() {
        init();
    }

    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

   private void init() {

//        noRMText = new javax.swing.JTextField();
//        jLabel1 = new javax.swing.JLabel();
//        jLabel2 = new javax.swing.JLabel();
//        namaText = new javax.swing.JTextField();
//        jButton1 = new javax.swing.JButton();
//        jLabel3 = new javax.swing.JLabel();

        JudulLabel = new JLabel("DAFTAR ANTRIAN PASIEN");
        JudulLabel.setFont(new Font(null, Font.BOLD, 18));
        JudulLabel.setBounds(50, 10, 250, 20);
        this.add(JudulLabel);

        noRekamMedisLabel = new JLabel("NoRM");
        noRekamMedisLabel.setFont(new Font(null, Font.BOLD, 14));
        noRekamMedisLabel.setBounds(50, 70, 50, 30);
        this.add(noRekamMedisLabel);

        namaLabel = new JLabel("NAMA");
        namaLabel.setFont(new Font(null, Font.BOLD, 14));
        namaLabel.setBounds(300, 70, 50, 30);
        this.add(namaLabel);

        alamatlabel = new JLabel("ALamat");
        alamatlabel.setFont(new Font(null, Font.BOLD, 14));
        alamatlabel.setBounds(300, 120, 50, 30);
        this.add(alamatlabel);

        JudulLabel = new JLabel("TANGGAL ANTRIAN :");
        JudulLabel.setBounds(50, 110, 150, 30);
        this.add(JudulLabel);

        this.setLayout(null);
        alamatText = new JTextField();
        alamatText.setFont(new Font(null, Font.BOLD, 14));
        alamatText.setBounds(390, 120, 100, 30);
        this.add(alamatText);

        this.setLayout(null);
        namaText = new JTextField();
        namaText.setFont(new Font(null, Font.BOLD, 14));
        namaText.setBounds(390, 70, 100, 30);
        this.add(namaText);

        this.setLayout(null);
        noRekamMedistext = new JTextField();
        noRekamMedistext.setBounds(130, 70, 100, 30);
        noRekamMedistext.setFont(new Font(null, Font.PLAIN, 18));
        this.add(noRekamMedistext);

        this.setLayout(null);
        tgllabel = new JLabel("TANGGAL");
        tgllabel.setFont(new Font(null, Font.BOLD, 14));
        tgllabel.setBounds(50, 130, 100, 50);
        this.add(tgllabel);

        this.setLayout(null);
        blnlabel = new JLabel("BULAN");
        blnlabel.setFont(new Font(null, Font.BOLD, 14));
        blnlabel.setBounds(50, 170, 100, 50);
        this.add(blnlabel);

        this.setLayout(null);
        thnlabel = new JLabel("TAHUN");
        thnlabel.setFont(new Font(null, Font.BOLD, 14));
        thnlabel.setBounds(50, 220, 100, 30);
        this.add(thnlabel);

        this.setLayout(null);
        tgl = new JComboBox();
        for (int i = 1; i <= 31; i++) {
            tgl.addItem(i);
        }
        tgl.setBounds(130, 140, 100, 30);
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
        bln.setBounds(130, 180, 100, 30);
        this.add(bln);

        this.setLayout(null);
        thn = new JComboBox();
        for (int i = 1990; i <= 2018; i++) {
            thn.addItem(i);
        }
        thn.setBounds(130, 220, 100, 30);
        this.add(thn);

        this.setLayout(null);
        daftar = new JButton("daftar");
        daftar.setBounds(100, 300, 100, 30);
        daftar.setFont(new Font(null, Font.BOLD, 20));
        this.add(daftar);

        daftar.addActionListener(this);
    }
    private void noRMTextActionPerformed(java.awt.ActiveEvent evt){
        Pasien pas = Pasien.cariPasien(noRekamMedistext.getText());
        namaText.setText(pas.getNama());
        alamatText.setText(pas.getAlamat());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == daftar) {
//            dispose();
        }
    }
    

}
