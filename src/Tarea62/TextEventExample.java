package Tarea62;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextComponent;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class TextEventExample {

    public static void main(String args[]) {
        Frame frame = new Frame("TextEventExample");
        // 2.- EVENT SOURCE
        TextField textField = new TextField();
        // 3.- EVENT LISTENER
        MyTextListener myTextListener;
        frame.add(textField, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);

        // 6.- EVENT SUBSCRIPTION / REGISTRATION
        textField.addTextListener(myTextListener = new MyTextListener("Text Field"));
        frame.addWindowListener(new WindowCloseAction());
    }
}

// 7.- INTERFACE IMPLEMENTATION
class MyTextListener implements TextListener {
    String preface;

    public MyTextListener(String source) {
        preface = source + " text value changed.\n"
                + "   First 10 characters: \"";
    }


    // 4.- EVENT HANDLER
    public void textValueChanged(TextEvent e) { // 1.- EVENT
        // 5.- THREAD: Este bloque corre sobre el hilo especial de la JVM
        TextComponent tc = (TextComponent) e.getSource();
        System.out.println("Typed value in TextComponent " + tc.getText());
    }
}