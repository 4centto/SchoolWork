i = 1
x = 0

def Ventas(x):
    if x == -1:
        print("TOTAL VENTAS: $", round(ACUM, 2))
    else:
        if x > 2500:
            x = x - (x * 0.08)
            print("TOTAL: $", x)
        else:
            print("TOTAL: $", x)

while i != 0:
    print("¿Cuanto compro el cliente?", end=" $")
    x = int(input())
    if x == -1:
        i = 0
    else:
        Ventas(x)