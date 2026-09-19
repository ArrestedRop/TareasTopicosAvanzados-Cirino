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
    //1.- META
    private void goal() {
        String meta = "Programa que busca poner a prueba botones," +
                " headers, frames y paneles de control usando" +
                " las prestaciones de la biblioteca perteneciente" +
                " a java de nombre Swing.";
        System.out.println(meta);
    }
    //2.-DATOS
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
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

        // Uso de Lambdas para reducir espacio y llamadas estaticas
        okButton.addActionListener(e -> JOptionPane.showMessageDialog(
                mainFrame, "Welcome to TutorialsPoint.com"));
        javaButton.addActionListener(e -> {
            int out = JOptionPane.showConfirmDialog(mainFrame,
                    "Click any button", "TutorialsPoint.com",
                    JOptionPane.YES_NO_OPTION);
            switch(out) {
                case YES_OPTION -> statusLabel.setText("Yes selected.");
                case NO_OPTION -> statusLabel.setText("No selected.");
            }
        });
        cancelButton.addActionListener(e -> {
            int out = JOptionPane.showConfirmDialog(mainFrame,
                    "Click any button", "TutorialsPoint.com",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            switch (out) {
                case YES_OPTION -> statusLabel.setText("Yes selected.");
                case NO_OPTION -> statusLabel.setText("No selected.");
                case CANCEL_OPTION -> statusLabel.setText("Cancel");
            }
        });
        controlPanel.add(okButton);
        controlPanel.add(javaButton);
        controlPanel.add(cancelButton);
        mainFrame.setVisible(true);
    }
    //5.-NAVEGACION
    public SwingControlDemo(){ prepareGUI(); }

    public static void main(String[] args){
        SwingControlDemo demo = new SwingControlDemo();
        demo.goal();
        demo.showDialogDemo();
    }
}