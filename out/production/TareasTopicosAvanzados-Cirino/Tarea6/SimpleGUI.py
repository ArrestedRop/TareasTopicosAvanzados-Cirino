# SimpleGUI.py
# Tecnologico Nacional de Mexico
# Instituto Tecnologico de Leon
# Ingenieria en Sistemas Computacionales
# Topicos Avanzados de programacion
# Alumno: Maximo Javier Villagomez Magaña
# Ejercicio 6:
# Fecha: 25 de agosto de 2026

from tkinter import *

def createGUI():
    global label, button

    window = Tk() # Create a root window
    label = Label(window, text = "Welcome to Python") # Create a label
    button = Button(window, text = "Click Me") # Create a button
    return window

def show():
    label.pack() # Display the label in the window
    button.pack() # Display the button in the window

def main():
    window = createGUI()
    show()
    window.mainloop() # Create an event loop

if __name__ == "__main__":
    main()
