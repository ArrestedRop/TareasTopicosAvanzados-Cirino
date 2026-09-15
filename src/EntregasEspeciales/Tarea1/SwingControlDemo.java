package EntregasEspeciales.Tarea1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.YES_OPTION;
import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.CANCEL_OPTION;

public class SwingControlDemo {
    //1.- META
    private void goal() {

    }
    //2.-DATOS
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    //3.-DESARROLLO
    //4.-RESULTADOS
    //5.-NAVEGACION
    private void prepareGUI(){
        mainFrame = new JFrame("Java Swing Examples");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){System.exit(0);}
        });

        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350,100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showDialogDemo(){
        headerLabel.setText("Control in action: JOptionPane");
        JButton okButton = new JButton("OK");
        JButton javaButton = new JButton("Yes/No");
        JButton cancelButton = new JButton("Yes/No/Cancel");

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(mainFrame, "Welcome to TutorialsPoint.com");
            }
        });

        javaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int output = JOptionPane.showConfirmDialog(mainFrame
                        , "Click any button"
                        ,"TutorialsPoint.com"
                        ,JOptionPane.YES_NO_OPTION);
                switch(output) {
                    case YES_OPTION -> statusLabel.setText("Yes selected.");
                    case NO_OPTION -> statusLabel.setText("No selected.");
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int output = JOptionPane.showConfirmDialog(mainFrame
                        , "Click any button"
                        ,"TutorialsPoint.com"
                        ,JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);
                switch (output) {
                    case YES_OPTION -> statusLabel.setText("Yes selected.");
                    case NO_OPTION -> statusLabel.setText("No selected.");
                    case CANCEL_OPTION -> statusLabel.setText("Cancel");
                }
            }
        });

        controlPanel.add(okButton);
        controlPanel.add(javaButton);
        controlPanel.add(cancelButton);
        mainFrame.setVisible(true);
    }

    public SwingControlDemo(){
        prepareGUI();
    }

    public static void main(String[] args){
        SwingControlDemo swingControlDemo = new SwingControlDemo();
        swingControlDemo.showDialogDemo();
    }
}