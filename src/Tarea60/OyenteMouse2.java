package Tarea60;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 7.- INTERFACE IMPLEMENTATION
public class OyenteMouse2 implements MouseListener {
  private MouseListenerExample f;

  public OyenteMouse2(MouseListenerExample f) {  this.f = f; }

  @Override
  public void mouseClicked(MouseEvent event) {}  // 1.- EVENT
  @Override
  public void mouseEntered(MouseEvent event) {}  // 1.- EVENT
  @Override
  public void mouseExited(MouseEvent event) {}  // 1.- EVENT

  // 4.- EVENT HANDLER
  @Override
  public void mousePressed(MouseEvent event) {   // 1.- EVENT
    // 5.- THREAD: Este bloque corre sobre el hilo especial de la JVM
    f.red_col = Color.RED;
    f.startX = f.endX = event.getX();
    f.startY = f.endY = event.getY();
    f.repaint();
  }

  // 4.- EVENT HANDLER
  @Override  
  public void mouseReleased(MouseEvent event) { // 1.- EVENT
    // 5.- THREAD: Este bloque corre sobre el hilo especial de la JVM
    f.red_col = Color.BLACK;
    f.repaint();
  }
}

