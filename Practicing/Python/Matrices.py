#Creacion de matrices

#Matriz 2x3
from random import *

m = [[1,2],[3,4],[5,6]]

for i in range(3):
    for j in range(2):
        print(m[i][j], end=" ")
    print()

print("")
print("SEGUNDA MATRIZ (POR INDEXACION)")
print("")

#Metodo por indexacion
a = []
f = 3
c = 2
for i in range(f):
    a.append([]) #Metodo .append para adicionar una fila, es necesario
    for j in range(c):
        a[i].append(None) #Metodo .append para adicionar columnas dentro de la fila existente

for i in range(f):
    for j in range(c):
        print(m[i][j], end=" ")
    print()

print("")
print("TERCER MATRIZ (RANDOM)")
print("")

#Llenado por numeros random
f = 3
c = 3
a = [[randint(1, 100) for i in range(f)] for j in range(c)]

for i in range(f):
    for j in range(c):
        print(a[i][j], end=" ")
    print()

print("")

#Forma iterativa
for f in a:
    print(f)
print("")
c = int(input("Columa a mostrar"))
b = []
for f in range(len(a)):
    b.append(a[f][c])
print(f)