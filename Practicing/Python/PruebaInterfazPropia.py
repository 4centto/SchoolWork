from tkinter import *

interfaz = Tk()
interfaz.title("Pruebas de Interfaz Propias")
interfaz.resizable(False, False)
interfaz.geometry("500x500")
interfaz.iconbitmap("icono.ico")
interfaz.config(bg = "#000000")

frame = Frame(interfaz)
frame.config(bg = "black")
frame.config(bd = "10")
frame.config(relief = "sunken")
frame.pack(fill = "both", expand = "True")

interfaz.mainloop()