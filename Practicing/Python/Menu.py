from tkinter import *
from tkinter import messagebox
from tkinter import filedialog

interfaz = Tk()

#Se crea la funcion del mensaje emergente
def infoAdicional():
    messagebox.showinfo("Programa de Ivan", "Licencia Valida para el 2020")

def infoLicencia():
    messagebox.showwarning("Licencia", "Licencia activada hasta el 2022")

def salir():
    valor = messagebox.askokcancel("Salir", "¿Estas seguro que quieres salir?")
    if valor == True:
        interfaz.destroy()

def cerrarDocumento():
    valor = messagebox.askretrycancel("Reintentar", "No es posible cerrar el documento")
    if valor == False:
        interfaz.destroy()

def abreArchivo():
    archivo = filedialog.askopenfilename(title = "Abrir", initialdir = "/")
    print(archivo)

#Se crea el menu
barraMenu = Menu(interfaz)

#Se configura la interfaz para el menu
interfaz.config(menu = barraMenu)

#Elementos y sub-elementos de los menus
archivoMenu = Menu(barraMenu, tearoff = 0)
archivoMenu.add_command(label = "Nuevo")
archivoMenu.add_command(label = "Abrir", command = abreArchivo)
archivoMenu.add_command(label = "Guardar")
archivoMenu.add_command(label = "Guarda como")
archivoMenu.add_separator()
archivoMenu.add_command(label = "Cerrar", command = cerrarDocumento)
archivoMenu.add_command(label = "Salir", command = salir)

edicionMenu = Menu(barraMenu, tearoff = 0)
edicionMenu.add_command(label = "Copiar")
edicionMenu.add_command(label = "Cortar")
edicionMenu.add_command(label = "Pegar")
edicionMenu.add_command(label = "Recortar")

herramientaMenu = Menu(barraMenu, tearoff = 0)
herramientaMenu.add_command(label = "Reemplazar")
herramientaMenu.add_command(label = "Girar")
herramientaMenu.add_command(label = "Filtrar")

ayudaMenu = Menu(barraMenu, tearoff = 0)
ayudaMenu.add_command(label = "Preguntas", command = infoLicencia)
ayudaMenu.add_command(label = "Foros")
ayudaMenu.add_command(label = "Intereses", command = infoAdicional)

#Se añadel al menu
barraMenu.add_cascade(label = "Archivo", menu = archivoMenu)
barraMenu.add_cascade(label = "Edicion", menu = edicionMenu)
barraMenu.add_cascade(label = "Herramienta", menu = herramientaMenu)
barraMenu.add_cascade(label = "Ayuda", menu = ayudaMenu)

interfaz.mainloop()