N = 0

def Tabla(N):
    tabla = ""
    for i in range(10):
        print((N, " X ", (i + 1)), " = ", (N * (i + 1)))

N = int(input("Dame el valor: "))

print(Tabla(N))