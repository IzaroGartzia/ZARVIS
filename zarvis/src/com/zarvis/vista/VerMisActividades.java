package com.zarvis.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VerMisActividades {
    private JPanel panelPrincipal;
    private JPanel PanelTItulo;
    private JButton volverButton;
    private JList listActividades;


    public VerMisActividades(String nombreUsuario) {

        JFrame frame = new JFrame("VerMisActividades");
        frame.setContentPane(panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        // HAY QUE ACCEDER A LA BBDD con el usuario y recoger todas sus actividades

        // CON LOS DATOS DE ESA ACTIVIDAD, se muestran los datos en Jlist
        // Se crea un ArrayList de actividades para meter los datos obtenidos de la bdd
        ArrayList<Actividad> listActividad = new ArrayList<Actividad>();


        // Se crea un Array de actividades, poniendole el tamaño que tiene el listActividad
        Actividad[] actividades = new Actividad[listActividad.size()];

        // Se convierte el ArrayList a Array
        actividades = listActividad.toArray(actividades);

        // Se define el modelo que va a tener el Jlist del formulario
        DefaultListModel modelo = new DefaultListModel();

        // Se rellena el JList de las actividades
        for (int i = 0; i < actividades.length; i++) {

            modelo.addElement(actividades[i].getNombre());

        }

        // Se asigna el modelo al Jlist
        listActividades.setModel(modelo);


        // Botón Volver
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

                VentanaCliente ventanaCliente = new VentanaCliente();

            }
        });
    }
}
