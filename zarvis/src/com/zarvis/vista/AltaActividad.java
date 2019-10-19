package com.zarvis.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AltaActividad {
    private JPanel PanelPrincipal;
    private JPanel PanelTItulo;
    private JTextField IDTextField;
    private JTextField NombreTextField;
    private JTextField PrecioTextField;
    private JTextField DiaTextField;
    private JTextField HoraTextField;
    private JPanel PanelBotones;
    private JButton AtrasButton;
    private JButton GuardarButton;
    private JPanel PanelDatos;
    private JPanel PanelCentrosCivicos;
    private JCheckBox SanMartinCheckBox;
    private JCheckBox ArriagaCheckBox;
    private JCheckBox ZabalganaCheckBox;


    public AltaActividad() {

        JFrame frame = new JFrame("AltaActividad");
        frame.setContentPane(PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

         // Botón Atrás
        AtrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

                eleccCentro eleccCentro = new eleccCentro();


            }
        });

        // Botón Guardar
        GuardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

                // Se crea un array para recoger los Centros Civicos al que pertenece la actividad
                CentroCivico[] centrosCivicos = new CentroCivico[3];

                // Creo un arrayList de centrosCívicos
                ArrayList<CentroCivico> listCentros = new ArrayList<CentroCivico>();

                // Contador de vueltas
                int v_cont = 0;

                // Se dan 3 vueltas para controlar los centros cívicos que se han seleccionado
                while  (v_cont < 3 ||
                        SanMartinCheckBox.isSelected() == true ||
                        ArriagaCheckBox.isSelected() == true ||
                        ZabalganaCheckBox.isSelected() == true)
                {


                    // Se controlan que Centros Cívicos se han seleccionado
                    if (SanMartinCheckBox.isSelected() == true) {

                        // Se introduce en el array
                        // SE HACE UNA SELECT A LA BBDD DEL CENTRO CIVICO SAN MARTIN, Y SE RECOGEN TODOS SUS DATOS
                        // EN UN OBJETO DE CENTRO CIVICO


                        // YO AQUI LO VOY A METER A MANO
                        CentroCivico centroSan = new CentroCivico(1, "San Martin", null, null, null);
                        listCentros.add(centroSan);

                        // Se quita el tick del checkbox
                        SanMartinCheckBox.setSelected(false);


                    } else if (ArriagaCheckBox.isSelected() == true) {

                        // Se introduce en el array
                        // SE HACE UNA SELECT A LA BBDD DEL CENTRO CIVICO SAN MARTIN, Y SE RECOGEN TODOS SUS DATOS
                        // EN UN OBJETO DE CENTRO CIVICO


                        // YO AQUI LO VOY A METER A MANO
                        CentroCivico centroArr = new CentroCivico(2, "Arriaga", null, null, null);
                        listCentros.add(centroArr);

                        // Se quita el tick del checkbox
                        ArriagaCheckBox.setSelected(false);

                    } else if (ZabalganaCheckBox.isSelected() == true) {
                        // Se introduce en el array
                        // SE HACE UNA SELECT A LA BBDD DEL CENTRO CIVICO SAN MARTIN, Y SE RECOGEN TODOS SUS DATOS
                        // EN UN OBJETO DE CENTRO CIVICO


                        // YO AQUI LO VOY A METER A MANO
                        CentroCivico centroZab = new CentroCivico(3, "Zabalgana", null, null, null);
                        listCentros.add(centroZab);

                        // Se quita el tick del checkbox
                        ZabalganaCheckBox.setSelected(false);

                    }

                    v_cont = v_cont + 1;
                }

                // Se crea una actividad
                Actividad actividad = new Actividad(Integer.parseInt(IDTextField.getText()), NombreTextField.getText(), null,
                                                    Double.parseDouble(PrecioTextField.getText()), DiaTextField.getText(), HoraTextField.getText(),
                                                    centrosCivicos);

                System.out.println(actividad.getId() + actividad.getNombre() + actividad.getDia() + actividad.getHora() + actividad.getPrecio());

                System.out.println("Centros cívicos donde se realiza la actividad:");

                // Pasar de ArrayList a array

                centrosCivicos = listCentros.toArray(centrosCivicos);

                for (int i = 0; i < centrosCivicos.length; i++) {

                    System.out.println(centrosCivicos[i].getName());

                }

            }
        });
    }
}
