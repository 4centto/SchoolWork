class Datos:
    def __init__(self, lista):
        self.lista = lista

class SumMax(Datos):
    def Sumar(self):
        return sum(self.lista)
    def Mayor(self):
        return max(self.lista)

class ResMin(Datos):
    def Restar(self):
        return RestarLista(lista)
    def Menor(self):
        return min(self.lista)

def PedirDatos():
    lista = []
    for i in range(10):
        print("Dame el numero " , (i+1), ":", end="")
        lista.append(int(input()))

    return lista

def RestarLista(x):
    aux = 0
    for i in x:
        if aux == 0:
            aux = i
        else:
            aux -= i
    return aux

lista = PedirDatos()

#Se imprime la lista ingresada por el usuario
print("Tu lista es: ", lista)
print()

#Ahora se manda a llamar a la clase de sumas y maximas
Suma = SumMax(lista)
print("La suma de tu lista es: ", Suma.Sumar())
print("El numero mayor es: ", Suma.Mayor())

#Ahora se manda a llamar a la clase de restas y menores
Resta = ResMin(lista)
print("La resta de tu lista es: ", Resta.Restar())
print("El numero menor es: ", Resta.Menor())