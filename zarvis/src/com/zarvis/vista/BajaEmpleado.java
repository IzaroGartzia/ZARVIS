package com.zarvis.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BajaEmpleado {
    private JPanel PanelPrincipal;
    private JPanel PanelTItulo;
    private JPanel PanelBotones;
    private JButton AtrasButton;
    private JButton GuardarButton;
    private JComboBox EmpleadoComboBox;


    // MAIN PARA QUE SE EJECUTE LA PANTALLA BAJAEMPLEADO
    // LUEGO HAY QUE BORRAR ESTE MAIN
    public static void main(String[] args) {
        JFrame frame = new JFrame("BajaEmpleado");
        frame.setContentPane(new BajaEmpleado().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

        public BajaEmpleado () {

            // Mostrar la pantalla BajaEmpleado
            JFrame frame = new JFrame("BajaEmpleado");
            frame.setContentPane(PanelPrincipal);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);


            // EMPLEADOS DE PRUEBA
         /*   Empleado e1 = new Empleado("123", "Izaro", "Garcia", 23, "Jefa", "07.10.2019", "31.12.9999", null);
            Empleado e2 = new Empleado("222", "Isabel", "Montero", 12, "Profesor", "23.10.2019", "31.12.9999", null);
            Empleado e3 = new Empleado("333", "David", "Rajado", 27, "Secretario", "09.10.2019", "31.12.9999", null);
            Empleado e4 = new Empleado("444", "Markel", "Perez", 25, "Entrenador", "10.10.2019", "31.12.9999", null);
            Empleado e5 = new Empleado("555", "Lorena", "Gomez", 19, "Jefa Superior", "01.10.2019", "31.12.9999", null);
*/
            // Se rellena el array con los empleados
           // Empleado[] empleados = new Empleado[]{e1, e2, e3, e4, e5};

                // Se deshabilita el JComboBox
       //         EmpleadoComboBox.setEditable(false);

                // Se rellena el JComboBox
          /*      for (int i = 0; i < empleados.length; i++) {

                    EmpleadoComboBox.addItem(empleados[i].getDni() + " - " + empleados[i].getNombre());

                }
*/

            // Botón Atrás
            AtrasButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    // Se vuelve a la pantalla AltaBajaModificacion
                    AltaBajaModificacion altaBajaModificacion = new AltaBajaModificacion();

                }
            });

            // Botón Guardar
            GuardarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    // Se obtiene el Empleado que se ha seleccionado en el JComboBox
                    String empleadoSeleccionado = (String) EmpleadoComboBox.getSelectedItem();

                   // EMPLEADOSELECCIONADO: Aqui se recoge el DNI - NOMBRE_DEL_EMPLEADO
                    // CON ESTO HAY QUE HACER UNA SELECT A LA BASE DE DATOS, SELECCIONAR
                    // EL DNI DEL EMPLEADO Y DARLE DE BAJA (ELIMINARLO)


                }
            });
        }
    }
