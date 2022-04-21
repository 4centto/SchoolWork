

X = 0

def Funcion(x):
    Resultado = 0
    if (x % 4) == 0:
        Resultado = x ** 2
        print("f(x) = ", Resultado)
    elif (x % 4) == 1:
        Resultado = x / 6
        print("f(x) = ", Resultado)
    elif (x % 4) == 2:
        Resultado = x ** (1/2)
        print("f(x) = ", Resultado)
    elif (x % 4) == 3:
        Resultado = (x ** 3) + 5
        print("f(x) = ", Resultado)

x = int(input("Dame el valor de x: "))
print()

Funcion(x)