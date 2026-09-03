package Tarea14;
/* GridExample.java
TEcnologico Nacional de Mexico
Instituto Tecnologico de Leon
ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Ejercicio 14:
Fecha: 1 de Septiembre 2026
*/
import java.awt.*;

public class GridExample {
  private Frame f;
  private Button b[] = new Button[6];

  public GridExample() {
    f = new Frame("Grid Example");
    for (int i = 0; i < b.length; i++) 
      b[i] = new Button(Integer.toString(i+1));
  }

  public void launchFrame() {
    f.setLayout (new GridLayout(3,2));
    for (Button boton:b)
      f.add(boton);
    f.pack();
    f.setVisible(true);
  }

  public static void main(String args[]) {
    GridExample grid = new GridExample();
    grid.launchFrame();
  }
}

