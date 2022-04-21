A = ['Mexico', 'Toluca', 'Nayarit', 'Cuernavaca', 'Durango']
C = ""

def Validacion(x, arreglo):
    y = 0
    for i in range(len(arreglo)):
        if arreglo[i] == x:
            y = 1
    if y == 1:
        return x, " existe en el arreglo"
    else:
        return x, " no existe en el arreglo"
print(A)
C = input("¿Cual es la ciudad que buscas? ")
print()
print(Validacion(C, A))