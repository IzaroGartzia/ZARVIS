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

    public static void main(String[] args) {
        JFrame frame = new JFrame("AltaEmpleado");
        frame.setContentPane(new AltaEmpleado().Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public AltaEmpleado() {

        // Se rellena el JList de actividades
        String[] nombreActividad = {"Futbol" , "Baloncesto", "Ping-Pong", "Billar", "Escalada", "Tenis"};
        DefaultListModel modelo = new DefaultListModel();


        for (int i = 0; i < nombreActividad.length; i++) {

            modelo.addElement(nombreActividad[i]);

        }
        ActividadesList.setModel(modelo);


        GuardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Se crea una lista de Actividades
                ArrayList<Actividad> actividades = new ArrayList<Actividad>();

                // Se crea un array de Actividades
                Actividad[] actividadesArray = new Actividad[actividades.size()];

                // Se recogen las actividades seleccionadas
                for (int i = 0; i < ActividadesList.getModel().getSize(); i++) {
                    Actividad actividad = (Actividad) ActividadesList.getModel().getElementAt(i);
                    actividades.add(actividad);
                    
                }

                // Convierto de ArrayList a Array
                actividadesArray = actividades.toArray(actividadesArray);

                // Se convierte de String a Int
                int edadInt = Integer.parseInt(EdadTextField.getText());

                // Dar de alta al empleado
                Empleado empleado = new Empleado(DniTextField.getText(), NombreTextField.getText(), ApellidoTextField.getText(),
                        edadInt, CargoTextField.getText(), FechaAltaTextField.getText(), FechaBajaTextField.getText(),
                        actividadesArray);

            }
        });
    }
}
