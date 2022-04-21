N = 50

def Suma():
    Pares = 0
    for i in range(10, 51):
        print(i, end=" ")
        if (i % 2) == 0:
            Pares += 1
    return Pares

print()
print("Pares: ", Suma())