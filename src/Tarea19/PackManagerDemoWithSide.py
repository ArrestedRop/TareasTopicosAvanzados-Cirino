""" PackManagerDemoWithSide.py
TEcnologico Nacional de Mexico
Instituto Tecnologico de Leon
ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Ejercicio 19:
Fecha: 1 de Septiembre 2026
"""

from tkinter import * # Import all definitions from tkinter

class PackManagerDemoWithSide:
    window = Tk() # Create a window
    window.title("Pack Manager Demo 2") # Set title

    Label(window, text = "Blue", bg = "blue").pack(side = LEFT)
    Label(window, text = "Red", bg = "red").pack(
    side = LEFT, fill = BOTH, expand = 1)
    Label(window, text = "Green", bg = "green").pack(
    side = LEFT, fill = BOTH)

    window.mainloop() # Create an event loop

PackManagerDemoWithSide() # Create GUI