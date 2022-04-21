import random

N = 0
Long = 0
M = []

def Operacion(x, arreglo):
    Valor = arreglo.count(x)

    return Valor

#Inicializacion
for i in range(100):
    M.append(random.randint(1, 50))

N = int(input("¿Cual numero quieres buscar? "))
print()
print(M)
print()
print(Operacion(N, M))