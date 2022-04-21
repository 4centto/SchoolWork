N = 0

def Funcion(N):
    ACUM = 0
    for i in range(1, N + 1):
        ACUM = ACUM + (1 / i)

    return ACUM

N = int(input("Damel el valor de N: "))
print()

print("Resultado: ", Funcion(N))