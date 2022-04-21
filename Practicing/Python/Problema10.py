A, B, N = 0, 0, 0

def Operaciones(A, B, N):
    res1 = (A / B) ** N
    res2 = (A ** N) / (B ** N)

    if res1 == res2:
        print("La igualdad se cumple")
    else:
        print("La igualdad no se cumple")

A = int(input("Dame el valor de A: "))
B = int(input("Dame el valor de B: "))
N = int(input("Dame el valor de N: "))
print()

if B == 0:
    print("B debe de ser diferente de 0")
else:
    Operaciones(A, B, N)