package Tarea64;

import javax.swing.*;
import javax.swing.event.EventListenerList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MagicButton extends JButton {
  private final EventListenerList listeners = new EventListenerList();

  public MagicButton(String label) {
    super(label);
    // Add a standard ActionListener to the button itself to trigger
    // our custom event
    this.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String msg = "The magic button was clicked!";
        
        fireMagicEvent(new MagicEvent(MagicButton.this, msg ));
      }
    });
  }

  // Method to add a custom listener
  public void addMagicListener(MagicListener listener) {
    listeners.add(MagicListener.class, listener);
  }

  // Method to remove a custom listener
  public void removeMagicListener(MagicListener listener) {
    listeners.remove(MagicListener.class, listener);
  }

  // Method to notify all registered listeners
  protected void fireMagicEvent(MagicEvent event) {
    Object[] listenerList = listeners.getListenerList();
    // Iterate backwards over the listener list, which is the 
    //standard Swing practice
    for (int i = listenerList.length - 2; i >= 0; i -= 2) 
      if (listenerList[i] == MagicListener.class) 
        ((MagicListener) listenerList[i + 1]).onMagicAction(event);
  }
}

