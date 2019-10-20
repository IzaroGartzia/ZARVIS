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
    private JButton bVolver;
    private JButton bCerrarSesion;

    private JPanel botonesControl;
    private JTextArea TAInformacion;
    private JLabel LTitulo;
    private JButton butSanmartin;
    private JButton butZabalgana;
    private JButton butArriaga;
    private Inicio inicio;


    public eleccCentro(int tipoUsuario, String nombreUsuario) {

        JFrame frame = new JFrame("eleccCentro");
        frame.setContentPane(contenedorPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        // Botón San Martín
        butSanmartin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

                // Se controla el tipo de usuario que ha accedido
                if(tipoUsuario == 1){

                    // Se muestra la pantalla Administrador
                    Administrador admin = new Administrador(tipoUsuario, nombreUsuario, "SanMartin");
                }
                else if(tipoUsuario == 2){

                    // Se muestra la pantalla Ventana Cliente
                    VentanaCliente ventanaCliente = new VentanaCliente("SanMartin", tipoUsuario, nombreUsuario);
                }


            }
        });

        // Botón Zabalgana
        butZabalgana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

                // Se controla el tipo de usuario que ha accedido
                if(tipoUsuario == 1){

                    // Se muestra la pantalla Administrador
                    Administrador admin = new Administrador(tipoUsuario, nombreUsuario,"Zabalgana");
                }
                else if(tipoUsuario == 2){

                    // Se muestra la pantalla Ventana Cliente
                    VentanaCliente ventanaCliente = new VentanaCliente("Zabalgana", tipoUsuario, nombreUsuario);
                }

            }
        });

        // Botón Arriaga
        butArriaga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

                // Se controla el tipo de usuario que ha accedido
                if(tipoUsuario == 1){

                    // Se muestra la pantalla Administrador
                    Administrador admin = new Administrador(tipoUsuario, nombreUsuario, "Arriaga");
                }
                else if(tipoUsuario == 2){

                    // Se muestra la pantalla Ventana Cliente
                    VentanaCliente ventanaCliente = new VentanaCliente("Arriaga", tipoUsuario, nombreUsuario);
                }

            }
        });

        // Botón Atrás
        bVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
                Inicio inicio = new Inicio();

            }
        });

        // Botón Cerrar Sesión
        bCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

                // Se sale del programa
                System.exit(0);

            }
        });
    }

}
