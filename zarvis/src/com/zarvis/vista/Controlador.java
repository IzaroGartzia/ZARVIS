package com.zarvis.vista;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.Db4oException;

import java.util.ArrayList;

public class Controlador {

    //DB4O
    String BDZAzarvis = "BBDDzarvis.yap";
    ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BDZAzarvis);


    public static void ConexionBBDD() {


    }

    //función para guardar datos en la bbdd de db4o
    public void guardarenBBDD(Object objeto) {

        try {

            db.store(objeto);

        } finally {
            db.close();
        }
    }

    public void borrardelaBBDD(Object objeto) throws Db4oException {

        ObjectSet<Object> result = db.queryByExample(objeto);
        db.delete(result);

    }

    public void consultaBBDD(Object objeto, String nombre) {

        //Diferentes arrays para devolver
        ArrayList<Actividad> consActividades = new ArrayList<>();
        ArrayList<Cliente> consClientes = new ArrayList<>();
        ArrayList<Empleado> consEmpleados = new ArrayList<>();
        ArrayList<Sancion> consSanciones = new ArrayList<>();
        ArrayList<Usuario> consUsuario = new ArrayList<>();

        ObjectSet<Object> result = db.queryByExample(objeto);

        if (result.size() == 0) {
            System.out.println("No existe");
        }

        while (result.hasNext()) {


            switch (nombre) {
                case "Actividad":

                    Actividad p = (Actividad) result.next();
                    consActividades.add(p);
                    //return consActividades;

                case "Cliente":
                    Cliente a = (Cliente) result.next();
                    consClientes.add(a);
                    //return consClientes;
                case "Empleado":
                    Empleado b = (Empleado) result.next();
                    consEmpleados.add(b);

                case "Sancion":
                    Sancion c = (Sancion) result.next();
                    consSanciones.add(c);

                case "Usuario":
                    Usuario d = (Usuario) result.next();
                    consUsuario.add(d);

                default:
            }


        }

    }
}
