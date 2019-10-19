package com.zarvis.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarMetadatos {
    private JPanel PanelPrincipal;
    private JPanel PanelTItulo;
    private JPanel PanelBotones;
    private JButton AtrasButton;
    private JTextPane datosMetadatos;

    public MostrarMetadatos() {


        // HAY QUE RELLENAR EL JTEXTPANE DATOSMETADOS

        // Página donde se muestra como se rellena...
//        https://codigo--java.blogspot.com/2014/05/uso-basico-de-elementos-swing-con_28.html

        // Botón Atrás
        AtrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                eleccCentro eleccCentro = new eleccCentro();


            }
        });
    }
}
