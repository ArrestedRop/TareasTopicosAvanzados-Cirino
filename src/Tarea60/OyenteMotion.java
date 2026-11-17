package Tarea60;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 7.- INTERFACE IMPLEMENTATION
public class OyenteMotion implements MouseMotionListener{
  MouseListenerExample f;

  public OyenteMotion (MouseListenerExample f) {  this.f = f;  }

  // 4.- EVENT HANDLER
  @Override
  public void mouseDragged(MouseEvent event) { // 1.- EVENT
    // 5.- THREAD: Este bloque corre sobre el hilo especial de la JVM
    f.endX = event.getX();
    f.endY = event.getY();
    f.repaint();
  }

  @Override
  public void mouseMoved(MouseEvent event) { // 1.- EVENT
    }
}

 
