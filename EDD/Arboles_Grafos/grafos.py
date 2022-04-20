[3:40 p. m., 6/12/2021] Sebastian Trejo: grafo = {}
grafo["A"] = ["B","C","D"]
grafo["B"] = ["A","D"]
grafo["C"] = ["A","D","E"]
grafo["D"] = ["A","B","C"]
grafo["E"] = ["C"]

print(grafo)

vertices = list(grafo.keys())
print(vertices)

#calcular
longitud = len(vertices)

matriz_ady = [[0 for j in range(longitud)]for i in range(longitud)]
for renglon in matriz_ady:
  print(renglon)

print("Construir la lista de adyacencia partir del dict")
lista_ady = []
for key in vertices:
  for vecino in grafo[key]:
    lista_ady.append((key,vecino))
print(lista_ady)
print("Llenar la matriz de ady")

index1_v = 0
index2_v = 0
for par in lista_ady:
  index1_v = vertices.index(par[0])
  index2_v = vertices.index(par[1])
  matriz_ady[index1_v][index2_v] = 1

print("Matriz de adyacencia")
for renglon in matriz_ady:
  print(renglon)
[3:40 p. m., 6/12/2021] Sebastian Trejo: numeros = [[0 for i in range(longitud)]for i in range(longitud)]
for renglon in matriz_ady:
  print(ren)