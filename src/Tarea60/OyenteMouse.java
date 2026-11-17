package Tarea60;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 7.- INTERFACE IMPLEMENTATION
public class OyenteMouse implements MouseListener{
  JPopupMenu popMenu;

  public OyenteMouse(JPopupMenu pop) {  popMenu = pop;  }
  @Override
  public void mouseClicked(MouseEvent event) {}  // 1.- EVENT
  @Override
  public void mouseEntered(MouseEvent event) {}  // 1.- EVENT
  @Override
  public void mouseExited(MouseEvent event) {}  // 1.- EVENT

  // 4.- EVENT HANDLER
  @Override
  public void mousePressed(MouseEvent event) {  // 1.- EVENT
    // 5.- THREAD: Este bloque corre sobre el hilo especial de la JVM
    if (event.isPopupTrigger()) popMenu(event);
  }

  // 4.- EVENT HANDLER
  @Override
  public void mouseReleased(MouseEvent event) { // 1.- EVENT
    // 5.- THREAD: Este bloque corre sobre el hilo especial de la JVM
    if (event.isPopupTrigger()) popMenu(event);
  }

  private void popMenu(MouseEvent event) { // 1.- EVENT
    // 5.- THREAD: Este bloque corre sobre el hilo especial de la JVM
    popMenu.show(event.getComponent(), event.getX(), event.getY());
  }
}

