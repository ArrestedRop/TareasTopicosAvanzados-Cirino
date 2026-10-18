package Tarea9.mvc;
/* Main.java
Tecnologico Nacional de Mexico
Instituto Tecnologico de Leon
Ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Ejercicio 9:
Fecha: 25 de agosto de 2022
*/
import Tarea9.mvc.models.*;
import Tarea9.mvc.view.*;
import Tarea9.mvc.controllers.*;

import javax.swing.*;

public class Main
{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Model model = new Model(0);
                View view = new View("-");
                Controller controller = new Controller(model,view);
                controller.contol();
            }
        });
    }
}
