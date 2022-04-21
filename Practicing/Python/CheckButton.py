from tkinter import *

interfaz = Tk()

arroz = IntVar()
fideos = IntVar()
azucar = IntVar()
frijoles = IntVar()

frame = Frame(interfaz)
frame.pack()

label = Label(frame, text = "Elige que quieres comprar: ", width = 50).pack()

def opcionCompras():
    opcionElegida = ""

    if arroz.get() == 1:
        opcionElegida += " Arroz,"
    if fideos.get() == 1:
        opcionElegida += " Fideos,"
    if azucar.get() == 1:
        opcionElegida += " Azucar,"
    if frijoles.get() == 1:
        opcionElegida += " Frijoles,"

    textoFinal.config(text = opcionElegida)


Checkbutton(frame, text = "Arroz", variable = arroz, onvalue = 1, offvalue = 0, command = opcionCompras).pack()
Checkbutton(frame, text = "Fideos", variable = fideos, onvalue = 1, offvalue = 0, command = opcionCompras).pack()
Checkbutton(frame, text = "Azucar", variable = azucar, onvalue = 1, offvalue = 0, command = opcionCompras).pack()
Checkbutton(frame, text = "Frijoles", variable = frijoles, onvalue = 1, offvalue = 0, command = opcionCompras).pack()

textoFinal = Label(frame)
textoFinal.pack()

interfaz.mainloop()