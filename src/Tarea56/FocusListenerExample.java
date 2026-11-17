package Tarea56;

import javax.swing.*;
import java.awt.event.*;

public class FocusListenerExample {
    // Lo sacamos del main para que no choque el static
    public JLabel label = new JLabel("Esperando foco...", SwingConstants.CENTER);
    // 2.- EVENT SOURCE
    public JFrame frame;

    public FocusListenerExample() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame = new JFrame("FocusListener Example");
        // 3.- EVENT LISTENER (Instanciamos tu clase interna con un nombre distinto)
        OyenteFoco focusListener = new OyenteFoco();

        frame.setSize(300,150);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 6.- EVENT SUBSCRIPTION / REGISTRATION
        frame.addFocusListener(focusListener);
        frame.setVisible(true);
    }

    // 7.- INTERFACE IMPLEMENTATION (Usando clase Adaptadora para ahorrar métodos)
    private class OyenteFoco extends FocusAdapter {
        // 4.- EVENT HANDLER
        @Override
        public void focusGained(FocusEvent fe){ // 1.- EVENT
            // 5.- THREAD: Este bloque corre sobre el hilo especial de la JVM
            label.setText("Focus Gained");
        }
        @Override
        public void focusLost(FocusEvent fe){
            label.setText("Focus Lost");
        }
    }

    public static void main(String [] args) {
        // Solo instanciamos la clase principal para arrancar el programa
        new FocusListenerExample();
    }
}