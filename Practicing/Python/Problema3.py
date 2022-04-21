A, B, C, D = 0, 0, 0, 0

def Operaciones(A, B, C, D):
    res1, res2 = 0, 0
    res1 = ((A - C) * (A - C)) / D
    res2 = ((A - B) * (A - B) * (A - B)) / D

    print("****************************")
    print("* 1ra Operacion: ", round(res1, 2))
    print("* 2da Operacion: ", round(res2, 2))
    print("****************************")

A = int(input("Dame el valor de A: "))
B = int(input("Dame el valor de B: "))
C = int(input("Dame el valor de C: "))
D = int(input("Dame el valor de D: "))

if D != 0:
    Operaciones(A, B, C, D)
else:
    print("No su puede hacer divisiones sobre 0")
    D = int(input("Dame el valor de D: "))
    if D != 0:
        Operaciones(A, B, C, D)
    else:
        print("No su puede hacer divisiones sobre 0")