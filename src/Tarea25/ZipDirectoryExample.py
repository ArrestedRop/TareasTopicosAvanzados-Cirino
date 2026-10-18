""" ZipDirectoryExample.py
TEcnologico Nacional de Mexico
Instituto Tecnologico de Leon
ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Ejercicio 23:
Fecha: 4 de Septiembre 2026
"""

import os
import zipfile

def compress_directory(directory, zip_file_path):
    # zipfile.ZIP_DEFLATED es el algoritmo de compresión estándar
    with zipfile.ZipFile(zip_file_path, 'w', zipfile.ZIP_DEFLATED) as zos:
        # os.walk recorre el directorio y sus subdirectorios automáticamente
        for root, dirs, files in os.walk(directory):
            for file in files:
                # Ruta completa del archivo original
                file_path = os.path.join(root, file)
                print(f"Compressing: {file_path}")

                # Nombre del archivo dentro del ZIP (ruta relativa para no incluir 'C:/...')
                zip_entry_name = os.path.relpath(file_path, directory)

                # Escribe el archivo en el zip
                zos.write(file_path, zip_entry_name)

if __name__ == "__main__":
    dir_path = "C:/Users/villa/OneDrive/Documentos/GitHub/TareasTopicosAvanzados-Cirino"
    zip_file = "C:/Users/villa/OneDrive/Documentos/Pureba.zip"

    compress_directory(dir_path, zip_file)