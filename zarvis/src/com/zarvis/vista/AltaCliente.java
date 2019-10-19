package com.zarvis.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AltaCliente {
    private JPanel PanelPrincipal;
    private JLabel textCreacionCliente;
    private JTextField dni_text;
    private JLabel lablDni;
    private JLabel labNombre;
    private JLabel labApellidos;
    private JLabel labEdad;
    private JLabel labProfesion;
    private JLabel labCargo;
    private JLabel lab_FechaAlta;
    private JTextField nombreText;
    private JTextField apellidoText;
    private JTextField edadText;
    private JTextField cargoText;
    private JTextField profesionText;
    private JTextField fechaAltaText;
    private JTextField fechaBajaText;
    private JLabel labUsuario;
    private JTextField contraText;
    private JTextField usuarioText;
    private JLabel labContra;
    private JButton but_Atras;
    private JButton but_Guardar;
    private JPanel panelCentral;
    private JPanel panel2;


    public AltaCliente() {
        JFrame frame = new JFrame("AltaCliente");
        frame.setContentPane(PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        // Botón Atrás
        but_Atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
                eleccCentro eleccCentro = new eleccCentro();


            }
        });

        // Botón Guardar
        but_Guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

                // Se recogen los datos que se han introducido
                String dni = dni_text.getText();
                String nombre = nombreText.getText();
                String ape = apellidoText.getText();
                String edad = edadText.getText();
                String cargo = cargoText.getText();
                String profesion = profesionText.getText();
                String fchAlta = fechaAltaText.getText();
                String fchBaja = fechaBajaText.getText();
                String usuario = usuarioText.getText();
                String pass = contraText.getText();

                // LOS DATOS SE PASAN A LA BBDD

            }
        });
    }


}
