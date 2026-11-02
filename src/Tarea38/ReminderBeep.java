package Tarea38;
/* ReminderBeep.java
TEcnologico Nacional de Mexico
Instituto Tecnologico de Leon
ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Ejercicio 38:
Fecha: 4 de septiembre de 2026
 */

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Simple demo that uses java.util.Timer to schedule a task to execute once 5
 * seconds have passed.
 */

public class ReminderBeep {
    Toolkit toolkit;

    Timer timer;

    public ReminderBeep(int seconds) {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
    }

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Time's up!");
            toolkit.beep();
            //timer.cancel(); //Not necessary because we call System.exit
            System.exit(0); //Stops the AWT thread (and everything else)
        }
    }

    public static void main(String args[]) {
        System.out.println("About to schedule task.");
        new ReminderBeep(5);
        System.out.println("Task scheduled.");
    }
}
