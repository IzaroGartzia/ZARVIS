package com.zarvis.vista;

import javax.naming.directory.InitialDirContext;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;

public class ModificarActividad {
    private JPanel PanelPrincipal;
    private JPanel PanelTItulo;
    private JPanel PanelBotones;
    private JButton AtrasButton;
    private JButton ModificarButton;
    private JPanel PanelDatos;
    private JTextField NombreTextField;
    private JTextField PrecioTextField;
    private JTextField DiaTextField;
    private JTextField HoraTextField;
    private JPanel PanelCentrosCivicos;
    private JCheckBox SanMartinCheckBox;
    private JCheckBox ArriagaCheckBox;
    private JCheckBox ZabalganaCheckBox;
    private JComboBox IDcomboBox;


    public ModificarActividad() {

            JFrame frame = new JFrame("ModificarActividad");
            frame.setContentPane(PanelPrincipal);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

            // Se deshabilita el ComboBox idComboBox para que no se pueda modificar el ID de la actividad
            IDcomboBox.setEnabled(false);

            // Se rellena el IDcomboBox con los ID de las actividad
            // HAY QUE ACCEDER A LA BBDD

                // Se rellena el array con las actividades
//             Actividad[] actividades = new Actividad[]{};
//
//            // Se rellena el JComboBox
//                for (int i = 0; i < actividades.length; i++) {
//
//                    IDcomboBox.addItem(actividades[i].getId());
//
//                }

            // Botón Atrás
        AtrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                eleccCentro eleccCentro = new eleccCentro();


            }
        });

            // Botón Modificar
            ModificarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    frame.dispose();

                    String idSeleccionado = (String) IDcomboBox.getSelectedItem();

                    // SE ACCEDE A LA BBDD con el ID de la actividad y se modifica

                }
            });

        // Cuando se cambia de ID en el JCombobox
        IDcomboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {


                // Se recoge el id de la actividad que se ha seleccionado
                String idSelec = (String) IDcomboBox.getSelectedItem();

               // SE ACCEDE A LA BBDD para recoger los datos de la actividad que corresponde a ese ID

                // DESCOMENTAR ESTO Y RELLENAR LOS SETTEXT CON EL VALOR QUE SE HAYA RECOGIDO DE LA BBDD
//                NombreTextField.setText();
//                PrecioTextField.setText();
//                DiaTextField.setText();
//                HoraTextField.setText();
//
//                // Se marca el checkbox del centro civico al que pertenece la actividad
//                String centroCivico;
//                if(centroCivico == "SanMartin"){
//
//                    SanMartinCheckBox.setSelected(true);
//                }
//                else if (centroCivico == "Zabalgana")
//                {
//                    ZabalganaCheckBox.setSelected(true);
//                }
//                else if (centroCivico == "Arriaga")
//                {
//                    ArriagaCheckBox.setSelected(true);
//                }

            }
        });
        }
}
