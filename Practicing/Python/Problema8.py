A, B = 0, 0

def Operaciones(A, B):
    if (A % B) == 0:
        print("B es divisor de A")
    elif (B % A) == 0:
        print("A es divisor de B")
    else:
        print("Ningun numero es divisor de ninguno")

A = int(input("Dame el valor de A: "))
B = int(input("Dame el valor de B: "))
print()

Operaciones(A, B)