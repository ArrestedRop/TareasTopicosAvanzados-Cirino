# Source - https://stackoverflow.com/q/38042632
# Posted by Kesto, modified by community. See post 'Timeline' for change history
# Retrieved 2026-09-01, License - CC BY-SA 3.0

import json

class Person:
    def __init__(self, first_name=None, last_name=None):
        self.first_name = first_name
        self.last_name = last_name

    def name(self):
        return "%s %s" % (self.first_name, self.last_name)

    @classmethod
    def getAll(cls):
        # Usamos 'with' para asegurar que el archivo se cierre correctamente al terminar
        with open('db.txt', 'r') as database:
            # json.load convierte directamente el archivo de texto a una lista de Python
            json_list = json.load(database)

        result = []
        for item in json_list:
            # Extraemos los datos y creamos el objeto Person
            person = Person(item['first_name'], item['last_name'])
            result.append(person)

        return result
