package com.zarvis.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Administrador {
    private JPanel Panel1;
    private JPanel PanelTitulo;
    private JPanel PantallaBotones;
    private JButton empleadoButton;
    private JButton actividadButton;
    private JButton clienteButton;
    private JButton volverButton;
    private JButton cerrarSesiónButton;
    private JButton metadatosButton;


    public Administrador(String centroSeleccionado) {

        JFrame frame = new JFrame("Administrador");
        frame.setContentPane(Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        // Botón Empleado
        empleadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

                AltaBajaModificacion altaBajaModificacion = new AltaBajaModificacion("Empleado");

            }
        });

        // Botón Actividad
        actividadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

                AltaBajaModificacion altaBajaModificacion = new AltaBajaModificacion("Actividad");
            }
        });

        // Botón Cliente
        clienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

                AltaBajaModificacion altaBajaModificacion = new AltaBajaModificacion("Cliente");

            }
        });

        // Botón Atrás
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
                eleccCentro eleccCentro = new eleccCentro();

            }
        });

        // Botón Cerrar sesión
        cerrarSesiónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

                // Se sale del programa
                System.exit(0);

            }
        });

        // Botón Metadatos
        metadatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

                // Depende del Centro Cívico que se haya escogido, se mostrarán los datos de un BBDD u otra
                if(centroSeleccionado == "SanMartin"){

                    // Se muestran los metadatos de
//                    // Se le pasa el nombre de la bbdd
//                    MostrarMetadatos mostrarMetadatos = new MostrarMetadatos("nombre_bbdd");
                }
                else if (centroSeleccionado == "Zabalgana"){

                    // Se muestran los metadatos de
//                    // Se le pasa el nombre de la bbdd
//                    MostrarMetadatos mostrarMetadatos = new MostrarMetadatos("nombre_bbdd");
                }
                else if (centroSeleccionado == "Arriaga"){

                    // Se muestran los metadatos de
//                    // Se le pasa el nombre de la bbdd
//                    MostrarMetadatos mostrarMetadatos = new MostrarMetadatos("nombre_bbdd");


                }

            }
        });

    }


    public Administrador(){
        JFrame frame = new JFrame("Administrador");
        frame.setContentPane(Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


