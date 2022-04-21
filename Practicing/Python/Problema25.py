import random

NUMEROS = []

def SUMA(x):
    Suma = 0
    for i in range(len(x)):
        Suma = Suma + x[i]
    return Suma

#Inicializar el vector
for i in range(10):
    NUMEROS.append(random.randint(1, 10))

print(NUMEROS)

print("Suma: ", SUMA(NUMEROS))