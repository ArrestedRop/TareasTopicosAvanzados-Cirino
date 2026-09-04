""" GridManagerDemo.py
TEcnologico Nacional de Mexico
Instituto Tecnologico de Leon
ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Ejercicio 18:
Fecha: 1 de Septiembre 2026
"""

from tkinter import * # Import all definitions from tkinter
2
3 class GridManagerDemo:
4 window = Tk() # Create a window
5 window.title("Grid Manager Demo") # Set title
6
7 message = Message(window, text =
8 "This Message widget occupies three rows and two columns")
9 message.grid(row = 1, column = 1, , columnspan = 2)
10 Label(window, text = "First Name:").grid(row = 1, column = 3)
11 Entry(window).grid(row = 1, column = 4, , pady = 5)
12 Label(window, text = "Last Name:").grid(row = 2, column = 3)
13 Entry(window).grid(row = 2, column = 4)
14 Button(window, text = "Get Name").grid(row = 3,
15 padx = 5, pady = 5, column = 4, )
16
17 window.mainloop() # Create an event loop
18
19 GridManagerDemo() # Create GUI
