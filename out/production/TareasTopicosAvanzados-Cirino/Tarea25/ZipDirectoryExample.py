""" ZipDirectoryExample.py
Tecnologico Nacional de Mexico
Instituto Tecnologico de Leon
Ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Ejercicio 25:
Fecha: 4 de Septiembre 2026
"""

import os
import zipfile

# 1.- META
def meta():
    print("Programa que comprime un directorio completo y sus subdirectorios")
    print("en un archivo .zip, utilizando el algoritmo ZIP_DEFLATED.")

# 2.- DATOS
dir_path = "C:/Users/villa/OneDrive/Documentos/GitHub/TareasTopicosAvanzados-Cirino"
zip_file = "C:/Users/villa/OneDrive/Documentos/Pureba.zip"

# 3.- PROCESOS
def compress_directory(directory, zip_file_path):
    # zipfile.ZIP_DEFLATED es el algoritmo de compresión estándar
    with zipfile.ZipFile(zip_file_path, 'w', zipfile.ZIP_DEFLATED) as zos:

        # os.walk recorre el directorio y sus subdirectorios automáticamente
        for root, dirs, files in os.walk(directory):
            for file in files:
                # Ruta completa del archivo original
                file_path = os.path.join(root, file)

                # 4.- SALIDAS (Integradas en el ciclo para mostrar progreso)
                print(f"Compressing: {file_path}")

                # Nombre del archivo dentro del ZIP (ruta relativa)
                zip_entry_name = os.path.relpath(file_path, directory)

                # Escribe el archivo en el zip
                zos.write(file_path, zip_entry_name)

# 5.- NAVEGACION
if __name__ == "__main__":
    meta()
    compress_directory(dir_path, zip_file)