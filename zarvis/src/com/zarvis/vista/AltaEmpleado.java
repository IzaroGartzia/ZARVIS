package com.zarvis.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AltaEmpleado {
    private JPanel Panel1;
    private JTextField DniTextField;
    private JTextField NombreTextField;
    private JTextField ApellidoTextField;
    private JTextField EdadTextField;
    private JTextField CargoTextField;
    private JTextField FechaAltaTextField;
    private JTextField FechaBajaTextField;
    private JList ActividadesList;
    private JPanel PanelBotones;
    private JButton AtrasButton;
    private JButton GuardarButton;
    private JPanel PanelTItulo;
    private AltaEmpleado altaEmpleado;

    public static void main(String[] args) {
        JFrame frame = new JFrame("AltaEmpleado");
        frame.setContentPane(new AltaEmpleado().Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public AltaEmpleado() {

        altaEmpleado = this;

        // Se crea un ArrayList de actividades
        ArrayList<Actividad> listActividad = new ArrayList<Actividad>();

        // Se rellena el listActividad de actividades
        Actividad a1 = new Actividad(1, "Futbol", 10.5, "Martes", "23:00");
        Actividad a2 = new Actividad(2, "Baloncesto", 11.5, "Jueves", "21:00");
        Actividad a3 = new Actividad(3, "Ping-Pong", 12, "Miercoles", "13:00");
        Actividad a4 = new Actividad(4, "Billar", 9, "Martes", "08:00");
        Actividad a5 = new Actividad(5, "Escalada", 9.5, "Lunes", "10:00");
        Actividad a6 = new Actividad(6, "Tenis", 7.5, "Viernes", "11:00");

        listActividad.add(a1);
        listActividad.add(a2);
        listActividad.add(a3);
        listActividad.add(a4);
        listActividad.add(a5);
        listActividad.add(a6);

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
        ActividadesList.setModel(modelo);


        // GUARDAR EMPLEADO
        GuardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Se crea un array que recoja las actividades que se han seleccionado
                Object[] activString = new Object[ActividadesList.getSelectedIndices().length];

                // Se recogen los índices de las actividades seleccionadas
               int[] selectedIndices = ActividadesList.getSelectedIndices();

                for (int i = 0; i < selectedIndices.length; i++) {

                    // Se meten en el array las actividades seleccionadas
                     activString[i] = ActividadesList.getModel().getElementAt(selectedIndices[i]);

                }

                // IMPORTANTE: HAY QUE CONVERTIR ACTIVSTRING[] A UN ARRAY DE TIPO ACTIVIDAD. YA QUE
                // ACTIVSTRING[] ES UN ARRAY DE OBJECT. Entonces, habrá que hacer una query para obtener
                // todos los datos de las actividades que se han seleccionado y pasarselas al constructor
                // del empleado

                Actividad[] actividadesSelecciondas = new Actividad[activString.length];


                // Se convierte de String a Int
                int edadInt = Integer.parseInt(EdadTextField.getText());

                // Dar de alta al empleado
                Empleado empleado = new Empleado(DniTextField.getText(), NombreTextField.getText(), ApellidoTextField.getText(),
                        edadInt, CargoTextField.getText(), FechaAltaTextField.getText(), FechaBajaTextField.getText(),
                        actividadesSelecciondas);

                System.out.println(empleado.getDni() + empleado.getNombre() + empleado.getApellido() + empleado.getEdad() +
                        empleado.getCargo() + empleado.getFechaalta() + empleado.getFechabaja());

                for (int i = 0; i < activString.length; i++) {

                    System.out.println("Actividades:" + activString[i]);

                }

            }
        });

        // VOLVER A LA PANTALLA AltaBajaModificacion
        AtrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                AltaBajaModificacion pantallaAnterior = new AltaBajaModificacion();

            }
        });
    }
}
