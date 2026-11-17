package Tarea59;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class EscucharTeclas extends JFrame {

    // 2.- EVENT SOURCE
    private JButton bAceptar;

    public EscucharTeclas() {
        add(getbAceptar());
        inicializador();
    }

    private void inicializador() {
        setLayout(null);
        setTitle("Prueba con Teclas");
        setVisible(true);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private JButton getbAceptar() {
        bAceptar = new JButton("Aceptar");
        // 3.- EVENT LISTENER (Instanciamos la clase interna)
        OyenteTeclas oyente = new OyenteTeclas();

        // 6.- EVENT SUBSCRIPTION / REGISTRATION (Se lo pasamos al botón)
        bAceptar.addKeyListener(oyente);
        bAceptar.setBounds(10, 10, 100, 20);
        return bAceptar;
    }

    // 7.- INTERFACE IMPLEMENTATION (La clase interna formal)
    private class OyenteTeclas implements KeyListener {
        // 4.- EVENT HANDLERS
        @Override
        public void keyPressed(KeyEvent e) { // 1.- EVENT
            // 5.- THREAD: Este bloque corre sobre el hilo especial de la JVM
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_ENTER){
                System.out.println("Presionó Enter!" + (char) key);
            }
            if (key == KeyEvent.VK_SPACE) {
                System.out.println("Presionó Espacio!" + (char) key);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int key;
            System.out.println("Soltó una tecla");

            key = e.getKeyCode();
            if (key == KeyEvent.VK_PRINTSCREEN) {
                System.out.println("Soy print Screen " + e.getKeyCode());
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("Escribió una tecla");
        }
    }

    public static void main(String args[]) {
        // Corremos la ventana
        new EscucharTeclas();
    }
}