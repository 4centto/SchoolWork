from Array import Array

lista = Array(10)

lista.setItem(10, 0)
lista.setItem(20, 1)
lista.setItem(30, 2)
lista.setItem(40, 3)
lista.setItem(50, 4)
lista.setItem(60, 5)
lista.setItem(70, 6)
lista.setItem(80, 7)
lista.setItem(90, 8)
lista.setItem(100, 9)

for indice in range(lista.getLength()):
    print(lista.getItem(indice))

#lista.clear(-1)
#lista.toString()

#Metodos de busqueda y ordenamiento
'''
BUSQUEDA LINEAL
    1.- Recorrido desde la posicion 0 hasta la posicion n-1 buscando un valor dado por el usuario o por el programador.
    2.- Es un algoritmo simple pero ineficiente.
    3.- No se sabe la complejidad por que depende de los datos internos.

METODO DE LA BURBUJA
    
'''

valor_a_buscar = int(input("¿Que valor deseas buscar?  -> "))
encontrado = False

for indice in range(lista.getLength()):
    if valor_a_buscar == lista.getItem(indice):
        encontrado = True
        print("El elemento se encuentra en la posicion:", indice)
        break

if not encontrado:
    print("El valor no existe")