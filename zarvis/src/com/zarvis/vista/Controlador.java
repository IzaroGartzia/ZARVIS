package com.zarvis.vista;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class Controlador {


    public static void ConexionBBDD (){

        String BDZAzarvis = "BBDDzarvis.yap";
        ObjectContainer db= Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),BDZAzarvis);



    }
}
