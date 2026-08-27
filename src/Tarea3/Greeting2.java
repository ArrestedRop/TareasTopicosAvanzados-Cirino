package Tarea3;
/* Greeting2.java
TEcnologico Nacional de Mexico
Instituto Tecnologico de Leon
ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: __________________________
Ejercicio 2: 
Fecha: 18 de agosto de 2022

Algoritmo:

1.- Meta: Favor de escribir una aplicacion de programa que 
          solo emita un saludo en una GUI usando swing
2.- Datos: no hay
3.- Calculos: no hay
4.- Resultados: Escribe en un campo de texto el saludo: 
                 "Hola esta es mi primera aplicacion grafica"
5.- Navegabilidad: Debera permitir cerrar la ventana con los botones de 
                   navegación
*/

import java.awt.*;
import javax.swing.*;

public class Greeting2 extends JFrame {
  JTextField textField;
  JLabel label;

  void init() {   // define variables del programa y despliegue de meta
    String msg = "Para mostrar un campo de texto en una ventana simple";

    label = new JLabel(msg);
  }

  public static void main (String[] args) {
    Greeting2 frame = new Greeting2();

    frame.init();
    frame.createGUI();
    frame.addWidgets();
    frame.setVisible(true); 
  }

  void addWidgets() {    // despliega la vista
    textField = new JTextField("Hello! primera GUI");
    add(label);
    add(textField);   
  }

  void createGUI() {  // define contexto grafico de la vista
    setSize(300, 200);           
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout() );
  }
}

