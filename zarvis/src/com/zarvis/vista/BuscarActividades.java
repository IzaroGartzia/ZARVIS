package com.zarvis.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BuscarActividades {
    private JPanel PanelPrincipal;
    private JLabel jLabActividades;
    private JList list1;
    private JTextField textBusqueda;
    private JButton buscarButton;
    private JPanel pane3;
    private JPanel pane2;
    private JButton butVolver;

    public BuscarActividades() {
        JFrame frame = new JFrame("BuscarActividades");
        frame.setContentPane(PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        // Botón buscar
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String actividad = textBusqueda.getText();

                // SE ACCEDE A LA BBDD con la actividad introducida


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
                list1.setModel(modelo);

            }
        });

        // Botón Volver
        butVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

                VentanaCliente ventanaCliente = new VentanaCliente();
            }
        });
    }
}
