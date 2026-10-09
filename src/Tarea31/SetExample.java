package Tarea31;
/* SetExample.java
TEcnologico Nacional de Mexico
Instituto Tecnologico de Leon
ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Ejercicio 31:
Fecha: 4 de septiembre de 2026
 */

import java.util.*;

public class SetExample {
  public static void main(String[] args) {
    Set set = new HashSet();
    set.add("one");
    set.add("second");
    set.add("3rd");
    set.add(new Integer(4));
    set.add(new Float(5.0F));
    set.add("second");
    set.add(new Integer(4));
    System.out.println(set);
  }
}
