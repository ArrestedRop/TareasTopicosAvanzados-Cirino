
import tkinter as tk

class GreetingApp(tk.Tk):
    def __init__(self):
        super().__init__()
        # Definimos las variables de la clase
        self.label = None
        self.text_field = None

        # Llamamos a los métodos igual que en tu Java
        self.init_components()
        self.create_gui()
        self.add_widgets()

    def init_components(self):
        # Define variables del programa
        msg = "Para mostrar un campo de texto en una ventana simple"
        self.label = tk.Label(self, text=msg)

    def create_gui(self):
        # Define el contexto gráfico (ventana)
        self.title("Greeting Python")
        self.geometry("300x200") # Mismo tamaño que el original

    def add_widgets(self):
        # Despliega la vista
        self.text_field = tk.Entry(self, width=30)
        self.text_field.insert(0, "Hello! primera GUI")

        # pack() es el equivalente de Tkinter al FlowLayout de Java
        self.label.pack(pady=5)
        self.text_field.pack(pady=5)

if __name__ == "__main__":
    app = GreetingApp()
    app.mainloop() # Esto equivale al setVisible(true)