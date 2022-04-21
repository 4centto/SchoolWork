#Esta es una prueba para poder realizar interfaces graficas en Python
#Se importa la libreria tkinter
from tkinter import *

#Crear objeto para las interfaces
raiz = Tk()

#Cambiar el titulo de la interfaz
raiz.title("Ventana de prueba")

#Bloquear el tamaño de ventana (ancho, alto)
raiz.resizable(False, False)

#Cambiar el icono de la ventana
raiz.iconbitmap("icono.ico")

#Establecer las dimensiones de la interfaz
raiz.geometry("650x350")

#Cambiar color de fondo
raiz.config(bg = "green")

#Siempre al final de la interfaz para poder ejecutar la interfaz
raiz.mainloop()
