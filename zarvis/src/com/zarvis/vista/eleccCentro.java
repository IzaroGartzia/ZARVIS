package com.zarvis.vista;

import javax.swing.*;

public class eleccCentro {
    private JPanel contenedorPrincipal;
    private JPanel tituloForm;
    private JPanel contenedorBotones;
    private JPanel boton1;
    private JPanel boton2;
    private JPanel boton3;
    private JPanel footer;
    private JButton bsalir;
    private JButton bVolver;
    private JButton bCerrarSesion;

    private JPanel botonesControl;
    private JTextArea TAInformacion;
    private JLabel LTitulo;
    private Inicio inicio;

    public eleccCentro(Inicio inicio) {
        JFrame frame = new JFrame("eleccCentro");
        frame.setContentPane(contenedorPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
