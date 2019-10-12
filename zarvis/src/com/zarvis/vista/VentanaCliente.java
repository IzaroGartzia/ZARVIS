package com.zarvis.vista;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
// Codigo para insertar una imagen en un jpane
        try {
            BgBorder borde = new BgBorder(ImageIO.read(new File("Imagenes\\images.jpg")));
            // Nombre del panel
            panelSuperior.setBorder(borde);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        butBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
                BuscarActividades buscarActividades = new BuscarActividades();
            }
        });
    }

    //Clase para insertar imagen
    public class BgBorder implements Border {

        private BufferedImage mImagen = null;

        public BgBorder(BufferedImage pImagen) {
            mImagen = pImagen;
        }
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            if (mImagen != null) {
                g.drawImage(mImagen, 0, 0, width, height, null);
            }
        }
        public Insets getBorderInsets(Component c) {
            return new Insets(0, 0, 0, 0);
        }
        public boolean isBorderOpaque() {
            return true;
        }
    }
}
