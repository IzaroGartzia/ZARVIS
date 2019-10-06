package com.zarvis.vista;

import javax.swing.*;

public class AltaBajaModificacion {
    private JPanel Panel1;
    private JPanel PanelTitulo;
    private JPanel PanelBotones;
    private JButton AltaButton;
    private JButton modificarButton;
    private JButton bajaButton;
    private AltaEmpleado alta;

    public AltaBajaModificacion(AltaEmpleado altaEmpleado) {
        JFrame frame = new JFrame("AltaBajaModificacion");
        frame.setContentPane(Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


