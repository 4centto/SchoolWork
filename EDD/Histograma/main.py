import re as r
arreglo = []
pattern = r"([a-zA-Z0-9áéíóú]+)"

#Primero se registra el cuento
with open("cuento.txt", encoding="utf-8") as file:
    for linea in file:
        noSpaces = linea.split()
        for j in noSpaces:
            busqueda = r.findall(pattern, j)
            arreglo.append(busqueda)

#Ahora se hace el conteo de cada palabra
for palabra in arreglo:
    contador = 0
    for i in range(len(arreglo)):
        if palabra == arreglo[i]:
            contador += 1

    print(" ->", palabra, ":", contador)
