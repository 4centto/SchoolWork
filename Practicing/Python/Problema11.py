Y = 0

def Operaciones(Y):
    Resultado = 0
    if Y > 0 and Y <= 11:
        print("Funcion que nose como se hace")
    elif Y > 11 and Y <= 33:
        Resultado = (Y ** 2) - 10
        print("Resultado = ", Resultado)
    elif Y > 33 and Y <= 64:
        Resultado = ((Y ** 3) + (Y ** 2)) - 1
        print("Resultado = ", Resultado)
    else:
        print("0")

Y = int(input("Dame el valor de Y: "))
print()

Operaciones(Y)