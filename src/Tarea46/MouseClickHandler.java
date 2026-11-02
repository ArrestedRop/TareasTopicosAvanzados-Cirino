package Tarea46;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseClickHandler implements MouseListener { 

	// We just need the mouseClick handler, so we use
	// the Adapter to avoid having to write all the
	// event handler methods

	public void mouseClicked (MouseEvent e) {
		// Do stuff with the mouse click...
           JOptionPane.showMessageDialog(null, "Se hizo click en el mouse");
	}

	public void mouseExited (MouseEvent e){}
	public void mouseEntered (MouseEvent e){}
	public void mouseReleased (MouseEvent e){}
	public void mousePressed (MouseEvent e){}
}

