package Tarea62;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowCloseAction extends WindowAdapter {
    private void exitMesssageToPrint() {
        System.out.println("Saliendo del program...");
    }
    public void windowClosing(WindowEvent windowEvent) {
        exitMesssageToPrint();
        System.exit(0);
    }
}
