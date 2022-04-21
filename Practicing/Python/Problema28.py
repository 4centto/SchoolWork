import random

A = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
N = 0
V = 0

def Eliminar(x):
    A.remove(x)
    return print(A)

def Insertar(x):
    A.append(x)
    return print(A)

print(A)
print()
print("1. Eliminar")
print("2. Insertar")
print()
N = int(input("Que accion deseas realizar? "))

if N == 1:
    V = int(input("Valor a eliminar: "))
    print(Eliminar(V))
elif N == 2:
    V = int(input("Valor a insertar: "))
    print(Insertar(V))