N = 0

def Operaciones(N):
    imp, par, num = 0, 0, 0
    cadena = ""
    for i in range(N):
        print("Numero ", (i + 1), ":", end=" ")
        num = int(input())
        if (num % 2) == 0:
            par += 1
        else:
            imp += 1
    cadena = "Pares: ", par, "    Impares: ", imp
    return cadena

N = int(input("¿Cuantos valores enteros son? "))

print(Operaciones(N))