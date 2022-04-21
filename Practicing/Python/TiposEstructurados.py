#Listas
print("------ Listas ------")
Lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
for i in range(len(Lista)):
    print("Elemento ", (i + 1), ": ", Lista[i])

print("--------------------")
print()

#Diccionarios
print("------ Diccionarios ------")
Diccionario = {"Nombre":"Ivan Michel Garcia", "Edad":"18", "Grado":"Universidad"}
for i in Diccionario:
    print(i, end=": ")
    print(Diccionario[i])

print("--------------------")
print()

#Tuplas
print("------ Tuplas ------")
Tupla = ("Ivan", "Michel", 18, 250, 40, "Mexico")

for i in Tupla:
    print(i)

print("--------------------")
print()

#Conjuntos o Colecciones
print("------ Conjuntos ------")
Conjunto = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

for i in Conjunto:
    print(i)

print("--------------------")
print()