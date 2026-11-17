package Tarea61;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JFrame;

public class MouseWheelListenerExample extends JFrame {

    // 2.- EVENT SOURCE
    private Container cPane;
    private static final Color colorArray[] = {Color.BLACK, Color.BLUE, Color.CYAN,
            Color.DARK_GRAY, Color.GRAY, Color.GREEN,
            Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE,
            Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};

    public MouseWheelListenerExample() {
        super();
        // 3.- EVENT LISTENER
        MouseWheelManager mouseWheelManager = new MouseWheelManager();

        cPane = getContentPane();

        // 6.- EVENT SUBSCRIPTION / REGISTRATION
        cPane.addMouseWheelListener(mouseWheelManager);
    }

    // 7.- INTERFACE IMPLEMENTATION
    private class MouseWheelManager implements MouseWheelListener {
        int cnt = 0;
        private static final int up_color = 1;
        private static final int down_col = 2;

        // 4.- EVENT HANDLER
        @Override
        public void mouseWheelMoved(MouseWheelEvent event) { // 1.- EVENT
            // 5.- THREAD: Este bloque corre sobre el hilo especial de la JVM
            int stps = event.getWheelRotation();

            // CORRECCIÓN: stps < 0 detecta el giro hacia arriba.
            // Si usas Math.abs siempre será positivo.
            int dir = (stps < 0) ? up_color : down_col;

            changeBackground(dir);
        }

        public void changeBackground(int dir) {
            cPane.setBackground(colorArray[cnt]);

            if (dir == up_color) cnt++;
            else --cnt;

            if (cnt == colorArray.length) cnt = 0;
            else if (cnt < 0) cnt = colorArray.length - 1;
        }
    }

    public static void main(String args[]) {
        JFrame jFrame = new MouseWheelListenerExample();

        jFrame.setSize(600, 400);
        jFrame.setVisible(true);
    }
}