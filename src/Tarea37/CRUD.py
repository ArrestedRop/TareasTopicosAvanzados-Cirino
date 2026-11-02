# Manejo de archivos binarios (CRUD modular)
# Tecnologico Nacional de Mexico
# Instituto Tecnologico de Leon
# Ingenieria en Sistemas Computacionales
# Topicos Avanzados de programacion
# Alumno: Maximo Javier Villagomez Magaña
# Ejercicio 37:
# Fecha: 25 de agosto de 2026

import pickle
import os

# 1.- META
def meta():
    print("Demostración práctica de un CRUD en Python modo texto.")
    print("El programa ilustra el manejo de archivos binarios utilizando")
    print("la librería pickle y modularidad separando cada operación.")

# 2.- DATOS
ARCHIVO = 'datos.dat'

# 3.- PROCESOS
def cargar_datos():
    """Lee el archivo binario y retorna el diccionario de datos."""
    if os.path.exists(ARCHIVO):
        with open(ARCHIVO, 'rb') as f:
            try:
                return pickle.load(f)
            except EOFError:
                return {}
    return {}

def guardar_datos(datos):
    """Sobrescribe el archivo binario con los datos actualizados."""
    with open(ARCHIVO, 'wb') as f:
        pickle.dump(datos, f)

# 4.- SALIDAS
def create():
    datos = cargar_datos()
    id_reg = input("\nIngrese ID (unico) del registro: ")
    if id_reg in datos:
        print("Error: El ID ya existe.")
        return
    nombre = input("Ingrese Nombre: ")
    datos[id_reg] = nombre
    guardar_datos(datos)
    print("-> Registro creado exitosamente.")

def read():
    datos = cargar_datos()
    print("\n--- LISTA DE REGISTROS ---")
    if not datos:
        print("No hay registros en el archivo binario.")
        return
    for id_reg, nombre in datos.items():
        print(f"ID: {id_reg} | Nombre: {nombre}")

def update():
    datos = cargar_datos()
    id_reg = input("\nIngrese el ID del registro a actualizar: ")
    if id_reg not in datos:
        print("Error: El ID no existe.")
        return
    nuevo_nombre = input("Ingrese el nuevo Nombre: ")
    datos[id_reg] = nuevo_nombre
    guardar_datos(datos)
    print("-> Registro actualizado exitosamente.")

def delete():
    datos = cargar_datos()
    id_reg = input("\nIngrese el ID del registro a eliminar: ")
    if id_reg in datos:
        del datos[id_reg]
        guardar_datos(datos)
        print("-> Registro eliminado exitosamente.")
    else:
        print("Error: El ID no existe.")

# 5.- NAVEGACION
def menu():
    while True:
        print("\n=== MENÚ CRUD BINARIO ===")
        print("1. Crear (Create)")
        print("2. Leer (Read)")
        print("3. Actualizar (Update)")
        print("4. Eliminar (Delete)")
        print("5. Salir")

        opcion = input("Seleccione una opción: ")

        if opcion == '1':
            create()
        elif opcion == '2':
            read()
        elif opcion == '3':
            update()
        elif opcion == '4':
            delete()
        elif opcion == '5':
            print("Saliendo del programa...")
            break
        else:
            print("Opción inválida. Intente de nuevo.")

if __name__ == "__main__":
    meta()
    menu()