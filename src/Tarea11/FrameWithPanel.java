/* FrameWithPanel.java
TEcnologico Nacional de Mexico
Instituto Tecnologico de Leon
ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Ejercicio 11:
Fecha: 29 Agosto 2026
*/
package Tarea11;
import java.awt.*;

public class FrameWithPanel {
  private Frame f;

  public FrameWithPanel(String title) {
    f = new Frame(title);
  }
  
  public void launchFrame() {
    f.setSize(200,200);
    f.setBackground(Color.blue);
    f.setLayout(null);  // Override default layout mgr

    Panel pan = new Panel();
    pan.setSize(100,100);
    pan.setBackground(Color.yellow);

    f.add(pan);
    f.setVisible(true);
  }

  public static void main(String args[]) {
    FrameWithPanel guiWindow =
        new FrameWithPanel("Frame with Panel");
    guiWindow.launchFrame();
  }
}
