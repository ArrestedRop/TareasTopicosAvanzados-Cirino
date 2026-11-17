package Tarea55;

// IMPORT FALTANTE
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContainerListenerExample {
    ActionListener actiListener;

    public void run() {
        // 3.- EVENT LISTENER (Instanciamos tu clase interna con un nombre distinto)
        actiListener = new OnActionEvent();
        // 3.- EVENT LISTENER (Instanciamos tu clase interna con un nombre distinto)
        OnContainerEvent onContainerEvent = new OnContainerEvent();
        JFrame jFrame = new JFrame();
        Container cPane = jFrame.getContentPane();


        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 6.- EVENT SUBSCRIPTION / REGISTRATION
        cPane.addContainerListener(onContainerEvent);
        cPane.setLayout(new GridLayout(3, 2));
        cPane.add(new JButton("First"));
        cPane.add(new JButton("Second"));
        cPane.add(new JButton("Third"));
        cPane.add(new JButton("Fourth"));
        cPane.add(new JButton("Fifth"));
        jFrame.setSize(400, 300);
        jFrame.setVisible(true);
    }

    // 7.- INTERFACE IMPLEMENTATION (Usando clase Adaptadora para ahorrar métodos)
    public class OnActionEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) { // 1.- EVENT
            // 5.- THREAD: Este bloque corre sobre el hilo especial de la JVM
            System.out.println("Select: " + event.getActionCommand());
        }
    }

    // 7.- INTERFACE IMPLEMENTATION (Usando clase Adaptadora para ahorrar métodos)
    public class OnContainerEvent extends ContainerAdapter {
        @Override
        public void componentAdded(ContainerEvent event) { // 1.- EVENT
            // 5.- THREAD: Este bloque corre sobre el hilo especial de la JVM
            Component compChild = event.getChild();

            if (compChild instanceof JButton) {
                JButton jButton = (JButton) compChild;
                // 6.- EVENT SUBSCRIPTION / REGISTRATION
                jButton.addActionListener(actiListener);
            }
        }

        @Override
        public void componentRemoved(ContainerEvent event) { // 1.- EVENT
            // 5.- THREAD: Este bloque corre sobre el hilo especial de la JVM
            Component compChild = event.getChild();

            if (compChild instanceof JButton) {
                JButton Jbutton = (JButton) compChild;
                // 6.- EVENT SUBSCRIPTION / REGISTRATION
                Jbutton.removeActionListener(actiListener);
            }
        }
    }

    public static void main(String[] args) {
        ContainerListenerExample obj = new ContainerListenerExample();
        obj.run();
    }
}