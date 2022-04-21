A, B, C = 0, 0, 0

def Mayor(A, B, C):
    if A > B and A > C:
        print("El numero mayor es A")
    elif B > A and B > C:
        print("El numero mayor es B")
    elif C > A and C > B:
        print("El numero mayor es C")

A = int(input("Dame el valor de A:  "))
B = int(input("Dame el valor de B:  "))
C = int(input("Dame el valor de C:  "))
print()

Mayor(A, B, C)