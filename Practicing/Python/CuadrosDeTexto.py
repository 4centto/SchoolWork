from tkinter import *

#Se diseña la interfaz de la ventana
interfaz = Tk()
interfaz.title("Cuadros de Texto")
interfaz.resizable(False, False)
interfaz.iconbitmap("icono.ico")
interfaz.config(bg ="#5d5d5d")

#Se diseña el frame que contendra a los elementos de un "Grupo"
frame = Frame(interfaz, width = 800, height = 400)
frame.config(bg = "black")
frame.config(bd = 10)
frame.config(relief = "sunken")
frame.pack(fill = "both", expand = "True")

#El frame que esta dendro del frame normal
frame2 = Frame(frame, width = 800, height = 400)
frame2.config(bg = "black")
frame2.pack(expand = "True")

Nombre = StringVar()

#Se diseñan los cuadros de texto
cuadroNombre = Entry(frame2, textvariable = Nombre)
cuadroNombre.grid(row = 0, column = 1)
cuadroNombre.config(bg = "#5d5d5d")

cuadroApellido = Entry(frame2)
cuadroApellido.grid(row = 1, column = 1)
cuadroApellido.config(bg = "#5d5d5d")

cuadroDireccion = Entry(frame2)
cuadroDireccion.grid(row = 2, column = 1)
cuadroDireccion.config(bg = "#5d5d5d")

cuadroPass = Entry(frame2)
cuadroPass.grid(row = 3, column = 1)
cuadroPass.config(bg = "#5d5d5d")
cuadroPass.config(show = "*")

#Se diseñan los textos de nombres, etc.
label = Label(frame2, text = "Nombre: ")
label.grid(row = 0, column = 0, sticky = "e", pady = "10", padx = "5")
label.config(bg = "black", fg = "white")

label2 = Label(frame2, text = "Apellido: ")
label2.grid(row = 1, column = 0, sticky = "e", pady = "10", padx = "5")
label2.config(bg = "black", fg = "white")

label3 = Label(frame2, text = "Direccion: ")
label3.grid(row = 2, column = 0, sticky = "e", pady = "10", padx = "5")
label3.config(bg = "black", fg = "white")

label4 = Label(frame2, text = "Password: ")
label4.grid(row = 3, column = 0, sticky = "e", pady = "10", padx = "5")
label4.config(bg = "black", fg = "white")

#Se crea una caja de comentarios o de cuadros de texto multilineas
cuadroComentario = Text(frame2, width = "16", height = "5")
cuadroComentario.grid(row = 4, column = 1, sticky = "e", pady = "10", padx = "5")
cuadroComentario.config(bg = "#5d5d5d")

#Se agrega un Scrollbar al cuadro de texto
scrollVertical = Scrollbar(frame2, command = cuadroComentario.yview)
scrollVertical.grid(row = 4, column = 2, sticky = "nsew")

#Establecer la posicion del Scrollbar
cuadroComentario.config(yscrollcommand = scrollVertical.set)

comentarioTexto = Label(frame2, text = "Comentarios: ")
comentarioTexto.grid(row = 4, column = 0, sticky = "e", pady = "10", padx = "5")
comentarioTexto.config(bg = "#000000", fg = "white")

def codigoBoton():
    Nombre.set("Ivan")

#Se crea un boton
botonEnvio = Button(interfaz, text = "ENVIAR", command = codigoBoton)
botonEnvio.pack()

interfaz.mainloop()