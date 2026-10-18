# controller.py
# Tecnologico Nacional de Mexico
# Instituto Tecnologico de Leon
# Ingenieria en Sistemas Computacionales
# Topicos Avanzados de programacion
# Alumno: Maximo Javier Villagomez Magaña
# Ejercicio 4:
# Fecha: 25 de agosto de 2026

# Source - https://stackoverflow.com/q/38042632
# Posted by Kesto, modified by community. See post 'Timeline' for change history
# Retrieved 2026-09-01, License - CC BY-SA 3.0

from models.model import Person
from views import view

def showAll():
    #gets list of all Person objects
    people_in_db = Person.getAll()
    #calls view
    return view.showAllView(people_in_db)

def start():
    view.startView()
    respuesta = input()
    if respuesta == 'y':
        return showAll()
    else:
        return view.endView()

if __name__ == "__main__":
    #running controller function
    start()
