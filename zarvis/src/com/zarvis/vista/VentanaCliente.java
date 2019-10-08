package com.zarvis.vista;

import javax.swing.*;

public class VentanaCliente {
    private JPanel PanelPrincipal;
    private JLabel labelAreaclientext;
    private JPanel panelInferior;
    private JPanel panelCentral;
    private JPanel panelSuperior;
    private JButton butBuscar;
    private JLabel textMisActivi;
    private JPanel panel3;
    private JComboBox comboActividades;
    private JButton butApuntarse;
    private JButton verMisActividadesButton;
    JFrame frame = new JFrame("VentanaCliente");

    public VentanaCliente() {
        frame.setContentPane(PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
