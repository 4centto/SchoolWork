#Proposito: Hacer una biblioteca que pueda almacenar libros
from builtins import print

espacio = 10
libros = []
seleccion = 0

class Libro:
    datos_Libro = {"nombre":"",
                   "paginas":0,
                   "costo":0.0,
                   "autor":""}

def Añadir(espacio):
    if espacio >= 1:
        nombre, paginas, coste, autor = "", 0, 0.0, ""

        print("Nombre del Libro: ", end="")
        nombre = input()
        print("Paginas: ", end="")
        paginas = int(input())
        print("Costo: ", end="")
        coste = float(input())
        print("Autor: ", end="")
        autor = input()

        #Ahora se envian los datos al dicionario
        objeto = Libro.datos_Libro
        for i in objeto:
            if i == "nombre":
                objeto[i] = nombre
            elif i == "paginas":
                objeto[i] = paginas
            elif i == "costo":
                objeto[i] = coste
            else:
                objeto[i] = autor

        libros.append(objeto)
        espacio -= 1
        print("**********************************************")
        print("* Tienes {} slots disponibles en la libreria * ".format(espacio))
        print("**********************************************")
        print()
        Principal()
    else:
        print("Debes tener una nueva libreria :(")
        Principal()

def Consultar():
    if len(libros) != 0:
        for i in range(len(libros)):
            print("<---------------------> ", end="")
            aux = libros[i]
            for j in aux:
                print("{}".format(aux[j]))
            print("<---------------------> \n")
    else:
        print("No tienes libros aun :(")

def Principal():
    print("¿Que deseas hacer?")
    print(" 1. Consultar Libros")
    print(" 2. Añadir libro")
    print()
    seleccion = int(input(" -->"))
    print()

    if seleccion == 1:
        Consultar()
        print()
        Principal()
    elif seleccion == 2:
        Añadir(espacio)
    else:
        print("La opcion no existe")
        Principal()

Principal()