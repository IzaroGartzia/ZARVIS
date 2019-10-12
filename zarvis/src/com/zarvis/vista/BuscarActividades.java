package com.zarvis.vista;

import javax.swing.*;

public class BuscarActividades {
    private JPanel PanelPrincipal;
    private JLabel jLabActividades;
    private JList list1;
    private JTextField textBusqueda;
    private JButton buscarButton;
    private JPanel pane3;
    private JPanel pane2;
    private JButton butVolver;

    public BuscarActividades() {
        JFrame frame = new JFrame("BuscarActividades");
        frame.setContentPane(PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
