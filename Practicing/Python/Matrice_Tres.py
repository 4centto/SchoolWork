#Pruebas de matrices
A = []
i = 1
x = 0

while i != 0:
    print("Valor ", i, ": ", end="")
    x = int(input())
    if x != 0:
        A.append(x)
        i = i + 1
    else:
        i = 0

print("")
print(A)
print(".count() = ", A.count(5))
print(".len() = ", len(A))
print(".index() = ", A.index(5))
print(". insert = ", A.insert(6, 9), end="Matriz: ")
print(A)
print(A.remove(2), end="Matriz: ")
print(A)
print(max(A))
print(min(A))
print(A.reverse())