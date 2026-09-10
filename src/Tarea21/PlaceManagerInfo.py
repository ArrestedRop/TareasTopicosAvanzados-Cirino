""" PlaceManagerDemo.py
TEcnologico Nacional de Mexico
Instituto Tecnologico de Leon
ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Ejercicio 21:
Fecha: 10 de Septiembre 2026
"""

from tkinter import * # Import all definitions from tkinter

class PlaceManagerDemo:
    def __init__(self):
        window = Tk() # Create a window
        window.title("Place Manager Demo") # Set title

        Label(window, text = "Blue", bg = "blue").place(
        x = 20, y = 20)
        Label(window, text = "Red", bg = "red").place(
        x = 50, y = 50)
        Label(window, text = "Green", bg = "green").place(
        x = 80, y = 80)

        window.mainloop() # Create an event loop

PlaceManagerDemo() # Create GUI