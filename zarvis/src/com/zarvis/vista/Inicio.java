package com.zarvis.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Inicio {
    private JPasswordField passwordCon;
    private JTextField textUsuario;
    private JLabel labelContr;
    private JLabel labelUsuario;
    private JPanel pane2;
    private JPanel panelPrincipal;
    private JPanel pane3;
    private JPanel panelCentral;
    private JButton butSalir;
    private JButton butEntrar;
    private Inicio inicio;

    private int tipoUsuario;


    public Inicio() {

        JFrame frame = new JFrame("Inicio");
        frame.setContentPane(panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        // CREO 2 USUARIOS, UN ADMIN Y UN CLIENTE PARA HACER PRUEBAS. AQUI HAY QUE RECOGERLOS DE LA BBDD
        Usuario admin = new Usuario("Admin", "admin", 1);
        Usuario cliente = new Usuario("Cliente", "cliente", 2);

        // Botón entrar
        butEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();


                // Hay que saber que tipo de usuario ha accedido(admin/cliente)
                /*
                Administrador --> 1
                Cliente --> 2
                 */

                // Se recogen los datos introducidos
                String usuario = textUsuario.getText();
                char[] passArray = passwordCon.getPassword();
                String pass = new String(passArray);

                if(usuario.equals(admin.getId()) && pass.equals(admin.getPassword()))
                {
                    tipoUsuario = 1;
                }
                else if(usuario.equals(cliente.getId()) && pass.equals(cliente.getPassword()))
                {
                    tipoUsuario = 2;
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Usuario o contraseña erróneo...");
                }

                eleccCentro ventanaPrincipal = new eleccCentro(tipoUsuario, usuario);

            }
        });

        // Botón Salir
        butSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Cerrar programa
                System.exit(0);
            }
        });
    }




}



