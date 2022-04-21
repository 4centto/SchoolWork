import CrearLista as Crear
import SumMax as sm
import ResMin as rm

#Metodo para generar la lista
print("Que tamaño tendra la lista: ", end="")
x = int(input())

#Se crea la lista
lista = Crear.GenerarLista(x)
print("Esta es tu lista: ", lista)

#Se imprime la suma y el valor maximo de la lista
lista_dos = sm.SumarYMaximo(lista)
print(lista_dos)

#Se imprime la resta y el valor menor de la lista
lista_tres = rm.RestarYMinimo(lista)
print(lista_tres)
