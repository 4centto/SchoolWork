import random as rd
lista = []
def GenerarLista(x):
    for i in range(x):
        lista.append(rd.randint(50, 101))
    return lista