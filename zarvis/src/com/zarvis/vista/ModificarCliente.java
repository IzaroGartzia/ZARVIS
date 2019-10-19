package com.zarvis.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ModificarCliente {
    private JPanel panel1;
    private JLabel labModificar;
    private JTextField textNombre;
    private JTextField textApelldos;
    private JTextField textEdad;
    private JTextField textCargo;
    private JTextField textProfesion;
    private JTextField textFechabja;
    private JButton butGuardar;
    private JButton butCancelar;
    private JPanel panel2;
    private JPanel panel3;
    private JComboBox DNIcomboBox;

    public ModificarCliente() {

        JFrame frame = new JFrame("ModificarCliente");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        // Se deshabilita el ComboBox DNIComboBox para que no se pueda modificar el dni del cliente
        DNIcomboBox.setEnabled(false);

        // Se rellena el DNIcomboBox con los dni de los clientes
        // HAY QUE ACCEDER A LA BBDD

        // Se rellena el array con los dnis
//             Cliente[] clientes = new Cliente[]{};
//
//            // Se rellena el JComboBox
//                for (int i = 0; i < clientes.length; i++) {
//
//                    DNIcomboBox.addItem(clientes[i].getDni());
//
//                }

        // Botón Guardar
        butGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

                // Se recoge el dni del cliente que se ha seleccionado
                String dniSelec = (String) DNIcomboBox.getSelectedItem();

                // Se recogen los datos que se han introducido
                String nombre = textNombre.getText();
                String ape = textApelldos.getText();
                String edad = textEdad.getText();
                String cargo = textCargo.getText();
                String profe = textProfesion.getText();
                String fchBaja = textFechabja.getText();

                // SE ACCEDE A LA BBDD con el DNI del cliente y se hace la modificación

            }

        });

        // Botón Atrás
        butCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

                eleccCentro eleccCentro = new eleccCentro();


            }
        });

        // Cuando se cambia de ID en el JCombobox
        DNIcomboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {


                // Se recoge el dni del cliente que se ha seleccionado
                String dniSelec = (String) DNIcomboBox.getSelectedItem();

                // SE ACCEDE A LA BBDD para recoger los datos del cliente que corresponde a ese DNI

                // DESCOMENTAR ESTO Y RELLENAR LOS SETTEXT CON EL VALOR QUE SE HAYA RECOGIDO DE LA BBDD
//                textNombre.setText();
//                textApelldos.setText();
//                textEdad.setText();
//                textCargo.setText();
//                textProfesion.setText();
//                textFechabja.setText();


            }
        });
    }
}
