package EntregasEspeciales.Tarea3;

import java.awt.*;
import java.awt.event.*;

class EventosListaSimple {
    Frame v;
    List lista;
    ManejaEventosListaSimple oyeLista;

    class ManejaEventosListaSimple implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            Object fuente = e.getSource();

            if (fuente == lista) {
                System.out.println(lista.getSelectedItem());
            }
        }
    }

    void forma() {
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
        v.add(lista);
        v.pack();
        v.setVisible(true);
    }
}

public class PruebaEventosListaSimple {
    public static void main(String args[]) {
        EventosListaSimple pagina = new EventosListaSimple();
        pagina.forma();
    }
}