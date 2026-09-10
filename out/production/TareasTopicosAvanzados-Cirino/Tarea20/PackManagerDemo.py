""" PackManagerDemo.py
TEcnologico Nacional de Mexico
Instituto Tecnologico de Leon
ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Ejercicio 20:
Fecha: 1 de Septiembre 2026
"""

from tkinter import * # Import all definitions from tkinter

class PackManagerDemo:
    def __init__(self):
        window = Tk() # Create a window
        window.title("Pack Manager Demo 1") # Set title

        Label(window, text = "Blue", bg = "blue").pack()
        Label(window, text = "Red", bg = "red").pack(
        fill = BOTH, expand = 1)
        Label(window, text = "Green", bg = "green").pack(
        fill = BOTH)

        window.mainloop() # Create an event loop

PackManagerDemo() # Create GUI
