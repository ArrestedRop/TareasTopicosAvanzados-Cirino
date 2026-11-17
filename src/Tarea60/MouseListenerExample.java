package Tarea60;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;


public class MouseListenerExample extends JFrame {
  int startX, startY, endX, endY;
  Color red_col = Color.red;
  // 2.- EVENT SOURCE
  final JPopupMenu popMenu = new JPopupMenu();
  // 3.- EVENT LISTENER
  MouseListener popup = new OyenteMouse(popMenu);
  MouseListener drawing1 = new OyenteMouse2(this);
  MouseMotionListener drawing2 = new OyenteMotion(this);

  public MouseListenerExample() {
    super();
    popMenu.add(new JMenuItem("Cut"));
    popMenu.add(new JMenuItem("Copy"));
    popMenu.add(new JMenuItem("Paste"));
    popMenu.addSeparator();
    popMenu.add(new JMenuItem("Select All"));
    popMenu.setInvoker(this);
    // 6.- EVENT SUBSCRIPTION / REGISTRATION
    addMouseListener(popup);
    addMouseListener(drawing1);
    addMouseMotionListener(drawing2);
  }

  @Override
  public void paint(Graphics graphic) {
    super.paint(graphic);
    graphic.setColor(red_col);
    graphic.drawLine(startX, startY, endX, endY);
  }

  public static void main(String args[]) {
    JFrame jFrame = new MouseListenerExample();
  
    jFrame.setSize(600, 400);
    jFrame.setVisible(true);
  }
}

