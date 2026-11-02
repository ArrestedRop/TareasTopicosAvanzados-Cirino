""" UnzipFiles.py
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
    print("Programa que extrae el contenido de un archivo .zip a un")
    print("directorio destino, mostrando en consola la ruta de cada archivo.")

# 2.- DATOS
zip_file_path = "C:/Users/villa/OneDrive/Documentos/Pureba.zip"
dest_dir = "C:/Users/villa/OneDrive/Documentos/Pureba"

# 3.- PROCESOS
def unzip(zip_file_path, dest_dir):
    # Crear el directorio de salida si no existe
    if not os.path.exists(dest_dir):
        os.makedirs(dest_dir)

    with zipfile.ZipFile(zip_file_path, 'r') as zis:

        # 4.- SALIDAS (Integradas en el proceso para mantener el código intacto)
        # Extraemos los nombres para poder imprimirlos simulando el código Java
        for file_name in zis.namelist():
            new_file_path = os.path.join(dest_dir, file_name)
            # Reemplazamos barras invertidas por el separador del sistema
            new_file_path = os.path.normpath(new_file_path)
            print(f"Unzipping to {new_file_path}")

        # extractall descomprime todo automáticamente
        zis.extractall(dest_dir)

# 5.- NAVEGACION
if __name__ == "__main__":
    meta()
    unzip(zip_file_path, dest_dir)