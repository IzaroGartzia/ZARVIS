package com.zarvis.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ModificarEmpleado {
    private JPanel PanelPrincipal;
    private JPanel PanelTItulo;
    private JTextField DniTextField;
    private JTextField NombreTextField;
    private JTextField ApellidoTextField;
    private JTextField EdadTextField;
    private JTextField CargoTextField;
    private JTextField FechaAltaTextField;
    private JTextField FechaBajaTextField;
    private JPanel PanelBotones;
    private JButton AtrasButton;
    private JButton ModificarButton;
    private JList ActividadesList;
    private JList NuevasList;
    private JButton agregarButton;
    private JButton eliminarButton;
    private JPanel PanelActividades;

    // MAIN PARA QUE SE EJECUTE LA PANTALLA MODIFICAREMPLEADO
    // LUEGO HAY QUE BORRAR ESTE MAIN
    public static void main(String[] args) {
        JFrame frame = new JFrame("ModificarEmpleado");
        frame.setContentPane(new ModificarEmpleado().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public ModificarEmpleado() {

        // Se deshabilita el textfield del DNI para que no se pueda modificar
        DniTextField.setEnabled(false);

        // Se rellena el ActividadesList con las actividades del empleado
        Actividad a1 = new Actividad(1, "Futbol", null, 10, null, null, null);
        Actividad a2 = new Actividad(2, "Baloncetos", null, 20, null, null, null);
        Actividad[] actividades = new Actividad[]{a1, a2};

        // Se rellena el NuevasList con todas las demás actividades del centro que pertenece el empleado
        Actividad a3 = new Actividad(3, "Ping-Pong", null, 20, null, null, null);
        Actividad a4 = new Actividad(4, "Zumba", null, 20, null, null, null);
        Actividad a5 = new Actividad(5, "Aerobic", null, 20, null, null, null);
        Actividad a6 = new Actividad(6, "Tenis", null, 20, null, null, null);
        Actividad[] todasActividades = new Actividad[]{a3, a4, a5, a6};


        // Se define el modelo que va a tener el Jlist del formulario
        DefaultListModel modelo = new DefaultListModel();
        DefaultListModel modeloNuevas = new DefaultListModel();

        // Se asignan los modelos a los JList
        ActividadesList.setModel(modelo);
        NuevasList.setModel(modeloNuevas);

        // Se rellena el JList de las actividades del empleado
        for (int i = 0; i < actividades.length; i++) {

            modelo.addElement(actividades[i].getNombre());

        }

        // Se rellena el JList de TODAS LAS ACTIVIDADES (menos las que ya tiene el empleado...)
        for (int i = 0; i < todasActividades.length; i++) {

            modeloNuevas.addElement(todasActividades[i].getNombre());

        }


        // Botón Atrás
        AtrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Se vuelve a la pantalla AltaBajaModificacion
                AltaBajaModificacion altaBajaModificacion = new AltaBajaModificacion();
            }
        });

        // Botón Modificar
        ModificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Se crea un ArrayList para recoger las actividades del empleado
                ArrayList<Object> listaActividades = new ArrayList<>(ActividadesList.getModel().getSize());
                for (int i = 0; i < ActividadesList.getModel().getSize(); i++) {
                    listaActividades.add(ActividadesList.getModel().getElementAt(i));
                }

                // SE TIENE QUE RECORRER LISTAACTIVIDADES, Y HACER UNA SELECT A LA BBDD PARA OBTENER
                // LOS OBJETOS ENTEROS PARA METERLOS EN EL ARRAY ACTIVEMPLEADO
                // DESPUÉS SE PASARÁ AL CONSTRUCTOR DE EMPLEADO (empleadoModif)
                // Se crea un Array para pasarle los datos del ArrayList
                Actividad[] activEmpleado = new Actividad[listaActividades.size()];
                activEmpleado = listaActividades.toArray(activEmpleado);


                // Se recoge los datos del empleado para hacer la modificación
                Empleado empleadoModif = new Empleado(DniTextField.getText(), NombreTextField.getText(),
                                                      ApellidoTextField.getText(), Integer.parseInt(EdadTextField.getText()),
                                                      CargoTextField.getText(), FechaAltaTextField.getText(),
                                                      FechaBajaTextField.getText(), null,null);

            }
        });

        // Botón agregar actividad
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Tiene que pasar de TODASACTIVIDADES a ACTIVIDADES

                // Se obtiene la nueva actividad que se ha selecionado
                String actividadSelec = (String) NuevasList.getSelectedValue();

                if(NuevasList.getSelectedIndex() == -1)
                {
                    JOptionPane.showMessageDialog(null,"No se ha seleccionado nada...");
                }
                else
                {
                    int indiceSelec = NuevasList.getSelectedIndex();

                    // Se borra el elemento seleccionado
                    if(modeloNuevas.getSize() != 0) {
                        modeloNuevas.remove(indiceSelec);
                        NuevasList.setModel(modeloNuevas);
                    }

                    // Se agrega el elemento a la lista de Actividades del empleado
                    modelo.addElement(actividadSelec);
                    ActividadesList.setModel(modelo);
                }

            }
        });

        // Botón Eliminar actividad
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Tiene que pasar de ACTIVIDADES A TODASACTIVIDADES

                // Se obtiene la actividad del empleado que se ha selecionado
                String actividadSelec = (String) ActividadesList.getSelectedValue();

                if(ActividadesList.getSelectedIndex() == -1)
                {
                    JOptionPane.showMessageDialog(null,"No se ha seleccionado nada...");
                }
                else {
                    int indiceSelec = ActividadesList.getSelectedIndex();

                    // Se borra el elemento seleccionado
                    if(modelo.getSize() != 0) {
                        modelo.remove(indiceSelec);
                        ActividadesList.setModel(modelo);
                    }

                    // Se agrega el elemento a la lista de Actividades Todas
                    modeloNuevas.addElement(actividadSelec);
                    NuevasList.setModel(modeloNuevas);

                }

            }
        });
    }
}
