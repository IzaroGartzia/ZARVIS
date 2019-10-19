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



    public VentanaCliente(String centroCivico, String nombreUsuario) {
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


        // Se rellena el JComboBox con las actividades del centro civico seleccioando

        // SE ACCEDE A LA BBDD con el CENTROCIVICO que se pasa como parámetro y se recogen
        // todas las actividades

        // Se rellena el array con las actividades
//        Actividad[] actividades = new Actividad[]{};
//
//            // Se deshabilita el JComboBox
//             comboActividades.setEditable(false);
//
//            // Se rellena el JComboBox con los nombres de las actividades
//                for (int i = 0; i < actividades.length; i++) {
//
//                    comboActividades.addItem(actividades[i].getNombre());
//
//                }


        // Botón Buscar Actividades
        butBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

                // Se muestra la pantalla BuscarActividades
                BuscarActividades buscarActividades = new BuscarActividades();

            }
        });

        // Botón Apuntarse
        butApuntarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // En nombre usuario tenemos el nombre de cliente
//                nombreUsuario

                String actividad = (String) comboActividades.getSelectedItem();

                // SE ACCEDE A LA BASE DE DATOS PARA HACER UN INSERT DEL CLIENTE EN ESA ACTIVIDAD

            }
        });

        // Botón Ver mis actividades
        verMisActividadesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                VerMisActividades verMisActividades = new VerMisActividades(nombreUsuario);

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


    public VentanaCliente(){
        frame.setContentPane(PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
