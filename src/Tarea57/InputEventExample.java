package Tarea57;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class InputEventExample {
    public static void main(String args[]) {
        Frame frame = new Frame("InputEventExample");
        // 2.- EVENT SOURCE
        Button button = new Button("A");
        // 3.- EVENT LISTENER (Declaración)
        MouseHandler mouseHandler;

        frame.add(button, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);

        // 6.- EVENT SUBSCRIPTION / REGISTRATION (Se instancia y se registra)
        button.addMouseListener(mouseHandler = new MouseHandler());
        frame.addWindowListener(new WindowCloseAction());
    }

    // 7.- INTERFACE IMPLEMENTATION
    private static class MouseHandler extends MouseAdapter {
        // 4.- EVENT HANDLER
        @Override
        public void mousePressed(MouseEvent me) { // 1.- EVENT
            // 5.- THREAD: Este bloque corre sobre el hilo especial de la JVM
            int mode = me.getModifiers();

            if ((mode & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK){
                System.out.println("Left button pressed.");
            }
            if ((mode & InputEvent.BUTTON2_MASK) == InputEvent.BUTTON2_MASK) {
                System.out.println("Middle button pressed.");
            }
            if ((mode & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK) {
                System.out.println("Right button pressed.");
            }
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            System.out.println("mouseReleased " + me.getX());
        }
    }
}