#Se importa libreria de tkinter
from tkinter import *

#Se diseña la interfaz grafica
interfaz = Tk()
interfaz.title("Ventana de Prueba 2")
interfaz.resizable(True, False)
interfaz.iconbitmap("icono.ico")
interfaz.geometry("600x500")
interfaz.config(bg = "black")

#Diseño de Frame
frame = Frame()
frame.pack()
frame.config(bg = "white")
frame.config(width = "100", height = "100")
frame.config(bd = 35)
frame.config(relief = "sunken")
frame.config(cursor = "hand2")

#Diseño de un Label
label = Label(text = "Ingresa tu nombre de Usuario", fg ="white", bg = "black", font = ("Arial", 18)).place(x = 145, y = 150)

interfaz.mainloop()