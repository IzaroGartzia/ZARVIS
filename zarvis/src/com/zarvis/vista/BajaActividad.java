package com.zarvis.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BajaActividad {
    private JPanel PanelPrincipal;
    private JPanel PanelTItulo;
    private JComboBox ActividadComboBox;
    private JPanel PanelBotones;
    private JButton AtrasButton;
    private JButton GuardarButton;


        public BajaActividad(int tipoUsuario, String nombreUsuario, String centroSeleccionado) {

            JFrame frame = new JFrame("BajaActividad");
            frame.setContentPane(PanelPrincipal);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

            // Se accede a la base de datos para rellenar el ComboBox con las actividades
            // que corresponden al CentroCivico
            // Cuando se haga el acceso a la bbdd para recuperar las actividades, hay que introducirlas
            // en el array actividades, y se rellenará el ComboBox

//            // Se rellena el array con las actividades
//             Actividad[] actividades = new Actividad[]{};
//
//            // Se deshabilita el JComboBox
//             ActividadComboBox.setEditable(false);
//
//            // Se rellena el JComboBox
//                for (int i = 0; i < actividades.length; i++) {
//
//                    ActividadComboBox.addItem(actividades[i].getNombre());
//
//                }


        // Botón Atrás
        AtrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

                Administrador administrador = new Administrador(tipoUsuario, nombreUsuario, centroSeleccionado);


            }
        });

        // Botón Guardar
            GuardarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();

                    Administrador administrador = new Administrador(tipoUsuario, nombreUsuario, centroSeleccionado);

                    String actividadSeleccionada = (String) ActividadComboBox.getSelectedItem();

                    // SE ACCEDE A LA BBDD Y SE ELIMINA LA ACTIVIDAD
                    // IMPORTANTE! --> actividadSeleccionada tiene el nombre de la actividad

                }
            });
        }
}
