/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Tom
 */
public class MainFrame extends JFrame  {

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem TambahPasienBaruDialog;
    private JMenuItem DaftarAntrianDialog;

    public MainFrame() throws HeadlessException {
        init();
    }

    public void init() {

        // buat menu bar
        menuBar = new JMenuBar();
        // set Titile
        this.setTitle("Main Frame");
        // buat menu
        fileMenu = new JMenu("File");
        exitMenuItem = new JMenuItem("exit");
        TambahPasienBaruDialog = new JMenuItem("Tambah Pasien");
        DaftarAntrianDialog = new JMenuItem("Daftar Antrian");

        fileMenu.add(TambahPasienBaruDialog);
        fileMenu.add(DaftarAntrianDialog);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 System.exit(0);
            }
        });
        TambahPasienBaruDialog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TambahPasienBaruDialog test = new TambahPasienBaruDialog();
                test.setSize(700, 400);
                test.setVisible(true);

            }
        });

        DaftarAntrianDialog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DaftarAntrianDialog daftar = new DaftarAntrianDialog();
                daftar.setSize(700, 600);
                daftar.setVisible(true);

            }
        });

        this.setJMenuBar(menuBar);

    
    }
}
