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

class GridManagerDemo:
    window = Tk() # Create a window
    window.title("Grid Manager Demo") # Set title

    message = Message(window, text =
    "This Message widget occupies three rows and two columns")
    message.grid(row = 1, column = 1, , columnspan = 2)
    Label(window, text = "First Name:").grid(row = 1, column = 3)
    Entry(window).grid(row = 1, column = 4, , pady = 5)
    Label(window, text = "Last Name:").grid(row = 2, column = 3)
    Entry(window).grid(row = 2, column = 4)
    Button(window, text = "Get Name").grid(row = 3,
    padx = 5, pady = 5, column = 4, )

    window.mainloop() # Create an event loop

GridManagerDemo() # Create GUI
