package com.zarvis.vista;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDController {

    private String driver = "com.mysql.cj.jdbc.Driver";
    // Nombre de la base de datos
    private String database = "centrocivico";
    // Host
    private String hostname = "localhost";
    // Puerto
    private String port = "3306";
    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    private String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";
    // Nombre de usuario
    private String username = "root";
    // Clave de usuario
    private String password = "";
    // Base de datos [Mysql=1 o sqlite=2]
    private int bd=0;
    //Ruta de la bd embebida
    private String ruta ="";

    /*
    *
    *
    Parte de la bd sqlite falta por construir.
    querys en principio iguales, solo cambia la forma de conectarse.

    *
    *
    Cuando se crea un objeto BDController hay que elegir que conexion vamos a usar, si la de mysql o la de sqlite.
    Por eso el int no va a tener ni getters ni setters en principio, al igual que el resto de variables.
    En principio no van a cambiarse.[Falta definir la ruta de sqlite]

    *
    *
    */

    public BDController(int bd) {
        this.bd = bd;
    }

    private Connection conectarMySQL() {
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            //Prueba de conexión
            // conn.close();
            // JOptionPane.showMessageDialog(null,conn.isClosed());
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }


}
