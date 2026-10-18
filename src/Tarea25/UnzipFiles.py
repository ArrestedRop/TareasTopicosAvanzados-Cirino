""" UnzipFiles.py
TEcnologico Nacional de Mexico
Instituto Tecnologico de Leon
ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Ejercicio 24:
Fecha: 4 de Septiembre 2026
"""

import os
import zipfile

def unzip(zip_file_path, dest_dir):
    # Crear el directorio de salida si no existe
    if not os.path.exists(dest_dir):
        os.makedirs(dest_dir)

    with zipfile.ZipFile(zip_file_path, 'r') as zis:
        # Extraemos los nombres para poder imprimirlos simulando tu código Java
        for file_name in zis.namelist():
            new_file_path = os.path.join(dest_dir, file_name)
            # Reemplazamos barras invertidas por el separador del sistema (útil en Windows)
            new_file_path = os.path.normpath(new_file_path)
            print(f"Unzipping to {new_file_path}")

        # extractall descomprime todo automáticamente creando los subdirectorios necesarios
        zis.extractall(dest_dir)

if __name__ == "__main__":
    zip_file_path = "C:/Users/villa/OneDrive/Documentos/Pureba.zip"
    dest_dir = "C:/Users/villa/OneDrive/Documentos/Pureba"

    unzip(zip_file_path, dest_dir)