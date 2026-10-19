/* SwingControlDemo.java
Tecnologico Nacional de Mexico
Instituto Tecnologico de Leon
Ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Tarea 1
Fecha: 22 de septiembre del 2026
*/
package EntregasEspeciales.Tarea1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.*;

public class SwingControlDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    //1.- META
    private void goal() {
        String meta = "Demostración práctica de interfaces gráficas " +
                "con Java Swing. El programa ilustra el manejo de " +
                "eventos de usuario (ActionListeners), el principio " +
                " y la invocación de diálogos modales (JOptionPane)" +
                " con retroalimentación visual.";
        System.out.println(meta);
    }

    //2.-DATOS
    //3.-PROCESOS
    private String textPerOption(int option) {
        return switch (option) {
            case 0 -> "Yes selected.";
            case 1 -> "No selected.";
            case 3 -> "Cancel";
            default -> "";
        };
    }

    //4.-SALIDA
    private void prepareGUI(){
        mainFrame = new JFrame("Java Swing Examples");

        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){ System.exit(0); }
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

        // Conectamos los botones directamente a sus clases Listener
        okButton.addActionListener(new OkButtonHandler());
        javaButton.addActionListener(new JavaButtonHandler());
        cancelButton.addActionListener(new CancelButtonHandler());

        controlPanel.add(okButton);
        controlPanel.add(javaButton);
        controlPanel.add(cancelButton);
        mainFrame.setVisible(true);
    }

    // METODO DRY PARA MENSAJES DE SALIDA
    private void executeDialog(String jopTitle, String jopMessage,
                               int optionType, int messageType) {

        int out = JOptionPane.showConfirmDialog(mainFrame,jopMessage,jopTitle,
                optionType,messageType);

        statusLabel.setText(textPerOption(out));
    }

    // MENSAJES DE SALIDA
    private void OkButtonMessage() {
        JOptionPane.showMessageDialog(mainFrame, "Welcome to TutorialsPoint.com");
    }

    private void JavaButtonMessage() {
        executeDialog("Click any button", "TutorialsPoint.com",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

    private void CancelButtonMessage() {
        executeDialog("Click any button", "TutorialsPoint.com",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

    //5.-NAVEGACION
    private class OkButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {OkButtonMessage();}
    }

    private class JavaButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {JavaButtonMessage();}
    }

    private class CancelButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {CancelButtonMessage();}
    }

    public SwingControlDemo(){prepareGUI();}

    // Main
    public static void main(String[] args){
        SwingControlDemo demo = new SwingControlDemo();
        demo.goal();
        demo.showDialogDemo();
    }
}