package Tarea35;
/* ForEachMain.java
TEcnologico Nacional de Mexico
Instituto Tecnologico de Leon
ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Ejercicio 35:
Fecha: 4 de septiembre de 2026
 */

// Java program to demonstrate working of nested for-each
import java.util.*;
public class ForEachMain
{
    public static void main(String args[])
    {
        // Create a link list which stores integer elements
        List<Integer> l=new LinkedList<Integer>();

        // Now add elements to the Link List
        l.add(2);
        l.add(3);
        l.add(4);

        // Make another Link List which stores integer elements
        List<Integer> s=new LinkedList<Integer>();
        s.add(2);
        s.add(4);
        s.add(5);
        s.add(6);

        // Iterator to iterate over a Link List
        for (int a:l)
            for (int b:s)
                if (a<b) System.out.print(a + " ");
    }
}
