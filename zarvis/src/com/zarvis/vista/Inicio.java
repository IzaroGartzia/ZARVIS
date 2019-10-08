package com.zarvis.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Inicio {
    private JPasswordField passwordCon;
    private JTextField textUsuario;
    private JLabel labelContr;
    private JLabel labelUsuario;
    private JPanel pane2;
    private JPanel panelPrincipal;
    private JPanel pane3;
    private JPanel panelCentral;
    private JButton butSalir;
    private JButton butEntrar;
    private Inicio inicio;
    JFrame frame = new JFrame("Inicio");


    public Inicio() {

        butEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
                eleccCentro ventanaPrincipal = new eleccCentro();


            }
        });
    }

    public void mostrar() {
        frame.setContentPane(panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}



