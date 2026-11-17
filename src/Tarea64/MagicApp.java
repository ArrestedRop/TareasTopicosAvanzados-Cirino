package Tarea64;
import javax.swing.*;
import java.awt.*;

// 7.- INTERFACE IMPLEMENTATION
public class MagicApp implements MagicListener {
    private final JLabel statusLabel;


    public MagicApp() {
        JFrame frame = new JFrame("Custom Event Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 150);

        // 2.- EVENT SOURCE
        MagicButton magicButton = new MagicButton("Click for Magic!");
        // 6.- EVENT SUBSCRIPTION / REGISTRATION
        // 3.- EVENT LISTENER (el 'this' que representa a la instancia de MagicApp)
        magicButton.addMagicListener(this);

        statusLabel = new JLabel("Waiting for magic...");

        frame.add(magicButton);
        frame.add(statusLabel);
        frame.setVisible(true);
    }

    // 4.- EVENT HANDLER
    @Override
    public void onMagicAction(MagicEvent event) {// 1.- EVENT
        // 5.- THREAD: Este bloque corre sobre el hilo especial de la JVM
        statusLabel.setText(event.getMessage());
        System.out.println("Event received: " + event.getMessage());
    }

    public static void main(String[] args) {
        // Run the GUI creation on the Event Dispatch Thread (EDT) for safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MagicApp();
            }
        });
    }
}

