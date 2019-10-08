package com.zarvis.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eleccCentro {
    private JPanel contenedorPrincipal;
    private JPanel tituloForm;
    private JPanel contenedorBotones;
    private JPanel boton1;
    private JPanel boton2;
    private JPanel boton3;
    private JPanel footer;
    private JButton bsalir;
    private JButton bVolver;
    private JButton bCerrarSesion;

    private JPanel botonesControl;
    private JTextArea TAInformacion;
    private JLabel LTitulo;
//    private Inicio inicio;
    private JButton butSanmartin;
    private JButton butZabalgana;
    private JButton butArriaga;
    private Inicio inicio;
    JFrame frame = new JFrame("eleccCentro");

//    public eleccCentro(Inicio inicio) {
//        JFrame frame = new JFrame("eleccCentro");
//        frame.setContentPane(contenedorPrincipal);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//    }
    public eleccCentro() {
        frame.setContentPane(contenedorPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        butSanmartin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                VentanaCliente ventanaCliente = new VentanaCliente();
                frame.dispose();
            }
        });
    }
}
