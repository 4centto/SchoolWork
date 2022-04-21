from tkinter import *

interfaz = Tk()

opcion = IntVar()

def imprimir():
    if opcion.get() == 1:
        etiqueta.config(text = "Has elegido Masculino")
    else:
        etiqueta.config(text = "Has elegido Femenino")

label2 = Label(interfaz, text = "Seleccione su genero").pack()

Radiobutton(interfaz, text = "Masculino", variable = opcion, value = 1, command = imprimir).pack()
Radiobutton(interfaz, text = "Femenino", variable = opcion, value = 0, command = imprimir).pack()

etiqueta = Label(interfaz)
etiqueta.pack()

interfaz.mainloop()