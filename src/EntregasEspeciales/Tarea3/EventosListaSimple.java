package EntregasEspeciales.Tarea3;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class EventosListaSimple {
    Frame v;
    List lista;
    ManejaEventosListaSimple oyeLista;
    OnClosedButtonEvent closedButtonEvent;

    //1.- META
    public void Goal() {
        String meta = "Programa simple que pretende poner a prueba";

        meta += " el manejo de eventos producidos por un componente ";
        meta += " de la clase list";
        System.out.println(meta);
    }

    //2.-DATOS - NO SE MANEJAN EN ESTE EJERCICIO
    //3.-PROCESOS - NO SE MANEJAN EN ESTE EJERCICIO

    //4.-SALIDAS
    public void forma() {
        v = new Frame();
        v.setLayout(new FlowLayout());
        lista = new List(4, false);
        lista.add("lunes");
        lista.add("martes");
        lista.add("miercoles");
        lista.add("jueves");
        lista.add("viernes");
        lista.add("sabado");
        lista.add("domingo");
        lista.addItemListener(oyeLista = new ManejaEventosListaSimple());
        v.addWindowListener(closedButtonEvent = new OnClosedButtonEvent());
        v.add(lista);
        v.pack();
        v.setVisible(true);
    }

    private void listPrinting(String selectedItem) {
        System.out.println(selectedItem);;
    }

    private void exitMessageToPrint() {
        System.out.println("Saliendo del programa...");
    }

    //5.-NAVEGACIOM
    class ManejaEventosListaSimple implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == lista) listPrinting(lista.getSelectedItem());
        }
    }

    class OnClosedButtonEvent extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            exitMessageToPrint();
            System.exit(0);
        }
    }
}
