""" PackManagerDemo.py
TEcnologico Nacional de Mexico
Instituto Tecnologico de Leon
ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Ejercicio 19:
Fecha: 1 de Septiembre 2026
"""



1 from tkinter import * # Import all definitions from tkinter
2
3 class PackManagerDemo:
4 def _ _init_ _(self):
5 window = Tk() # Create a window
6 window.title("Pack Manager Demo 1") # Set title
7
8 Label(window, text = "Blue", bg = "blue").pack()
9 Label(window, text = "Red", bg = "red").pack(
10 )
11 Label(window, text = "Green", bg = "green").pack(
12 )
13
14 window.mainloop() # Create an event loop
15
16 PackManagerDemo() # Create GUI