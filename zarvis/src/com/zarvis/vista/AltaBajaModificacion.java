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


    public AltaBajaModificacion(int tipoUsuario, String nombreUsuario, String centroSeleccionado, String elemento) {

        JFrame frame = new JFrame("AltaBajaModificacion");
        frame.setContentPane(Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        // Botón Alta
        AltaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

                // Se controla que elemento se quiere dar de alta
                if(elemento == "Empleado")
                {
                    AltaEmpleado altaEmpleado = new AltaEmpleado(tipoUsuario, nombreUsuario, centroSeleccionado);

                }
                else if(elemento == "Actividad")
                {
                    AltaActividad altaActividad = new AltaActividad(tipoUsuario, nombreUsuario, centroSeleccionado);
                }
                else if(elemento == "Cliente")
                {
                    AltaCliente altaCliente = new AltaCliente(tipoUsuario, nombreUsuario, centroSeleccionado);
                }

            }
        });

        // Botón Baja
        bajaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

                // Se controla que elemento se quiere dar de baja
                if(elemento == "Empleado")
                {
                    BajaEmpleado bajaEmpleado = new BajaEmpleado(tipoUsuario, nombreUsuario, centroSeleccionado);

                }
                else if(elemento == "Actividad")
                {
                    BajaActividad bajaActividad = new BajaActividad(tipoUsuario, nombreUsuario, centroSeleccionado);

                }
                else if(elemento == "Cliente")
                {
                    BajaCliente bajaCliente = new BajaCliente(tipoUsuario, nombreUsuario, centroSeleccionado);
                }

            }
        });

        // Botón Modificar
        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

                // Se controla que elemento se quiere modificar
                if(elemento == "Empleado")
                {
                    ModificarEmpleado modificarEmpleado = new ModificarEmpleado(tipoUsuario, nombreUsuario, centroSeleccionado);

                }
                else if(elemento == "Actividad")
                {
                    ModificarActividad modificarActividad = new ModificarActividad(tipoUsuario, nombreUsuario, centroSeleccionado);

                }
                else if(elemento == "Cliente")
                {
                    ModificarCliente modificarCliente = new ModificarCliente(tipoUsuario, nombreUsuario, centroSeleccionado);
                }

            }
        });
    }

}


