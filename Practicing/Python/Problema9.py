A, N = 0, 0

def Operaciones(A, N):
    if (A ** -N) == (1 / (A ** N)):
        print("La iguadad se cumple")
    else:
        print("La igualdad no se cumple")

A = int(input("Dame el valor de A: "))
N = int(input("Dame el valor de N: "))

if A != 0:
    Operaciones(A, N)
else:
    print("A debe de ser diferente de 0")