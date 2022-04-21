filas_Uno, filas_Dos, columnas_Uno, columnas_Dos = 0, 0, 0, 0
matriz_Uno, matriz_Dos = [], []

print("")
filas_Uno = int(input("Filas de la matriz A: "))
columnas_Uno = int(input("Columnas de la matriz A: "))
print("")
filas_Dos = int(input("Filas de la matriz B: "))
columnas_Dos = int(input("Columnas de la matriz B: "))
print("")
print("")

if columnas_Uno == filas_Dos:

    #Llenado de la matriz uno
    print("Matriz A: ")
    for i in range(filas_Uno):
        aux = []
        for j in range(columnas_Uno):
            aux.append(int(input(f"Valor de la fila {i+1} columna {j+1}: ")))
        matriz_Uno.append(aux)
    print("")

    #Llenado de la matriz dos
    print("Matrtiz B: ")
    for i in range(filas_Dos):
        aux = []
        for j in range(columnas_Dos):
            aux.append(int(input(f"Valor de la fila {i+1} columna {j+1}: ")))
        matriz_Dos.append(aux)
    print("")

    #Impresion de las matrices
    #A
    print(" ** MATRIZ A **")
    for i in range(filas_Uno):
        for j in range(columnas_Uno):
            print(f"[{matriz_Uno[i][j]}]", end="")
        print("")
    print("")
    
    #B
    print(" ** MATRIZ B **")
    for i in range(filas_Dos):
        for j in range(columnas_Dos):
            print(f"[{matriz_Dos[i][j]}]", end="")
        print("")
    print("")

    #Calculo para las multiplicaciones para obtener la nueva matriz
    matriz_Tres = []
    for i in matriz_Uno:
        fila_aux = i;
        aux = []
        for j in range(columnas_Dos):
            for z in range(filas_Dos):
                

    print(f"{filas_Uno}x{columnas_Dos}")
else:
    print("Matrices incompatibles")