import random

ARREGLO =[]

def Operaciones(ARREGLO):
    pos, neg, neu = 0, 0, 0
    for i in range(len(ARREGLO)):
        if ARREGLO[i] > 0:
            pos += 1
        elif ARREGLO[i] < 0:
            neg += 1
        elif ARREGLO[i] == 0:
            neu += 1
    return "Positivos: ", pos, "     Negativos: ", neg, "     Neutros: ", neu

for i in range(100):
    ARREGLO.append(random.randint(-50, 50))
print()
print(ARREGLO)
print()
print(Operaciones(ARREGLO))
