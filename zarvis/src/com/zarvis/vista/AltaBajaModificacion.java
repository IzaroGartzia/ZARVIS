package com.zarvis.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AltaBajaModificacion {
    private JPanel Panel1;
    private JPanel PanelTitulo;
    private JPanel PanelBotones;
    private JButton AltaButton;
    private JButton modificarButton;
    private JButton bajaButton;
    private AltaEmpleado alta;

    public AltaBajaModificacion() {

        JFrame frame = new JFrame("AltaBajaModificacion");
        frame.setContentPane(Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        // Botón ALta Empleado
        AltaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        // Botón Baja Empleado
        bajaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Se va a la pantalla BajaEmpleado
                BajaEmpleado bajaEmpleado = new BajaEmpleado();

            }
        });

        // Botón Modificar Empleado
        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}


