package com.zarvis.vista;

import javax.swing.*;

public class Inicio {
    private JPanel background;
    private JPanel panelPrincipal;
    private JPanel PanelSuperior;
    private JPanel PanelMedio;
    private JLabel NombreEmpresa;
    private JTextField textUsuario;
    private JTextField textPass;
    private JButton but_entrar;
    private JButton but_salir;


    public static void main (String[] args)
    {
        JFrame frame=new JFrame("Inicio");
        frame.setContentPane(new Inicio().background);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

