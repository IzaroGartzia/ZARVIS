package com.zarvis.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BajaCliente {
    private JPanel PanelPrincipal;
    private JPanel PanelTItulo;
    private JPanel PanelBotones;
    private JButton AtrasButton;
    private JButton GuardarButton;
    private JComboBox ClienteComboBox;


        public BajaCliente(int tipoUsuario, String nombreUsuario, String centroSeleccionado) {

            JFrame frame = new JFrame("BajaCliente");
            frame.setContentPane(PanelPrincipal);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

            // Se accede a la base de datos para rellenar el ComboBox con los dnis de los clientes
            // que corresponden al CentroCivico
            // Cuando se haga el acceso a la bbdd para recuperar los dnis, hay que introducirlas
            // en el array dnis, y se rellenará el ComboBox

//            // Se rellena el array con los dnis
//            Cliente[] clientes = new Cliente[]{};
//
//            // Se deshabilita el JComboBox
//             ClienteComboBox.setEditable(false);
//
//            // Se rellena el JComboBox
//                for (int i = 0; i < clientes.length; i++) {
//
//                    ClienteComboBox.addItem(clientes[i].getDni());
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

                    String dniSeleccionado = (String) ClienteComboBox.getSelectedItem();

                    // SE ACCEDE A LA BBDD Y SE ELIMINA EL CLIENTE filtrando por su DNI


                }
            });
        }
}
