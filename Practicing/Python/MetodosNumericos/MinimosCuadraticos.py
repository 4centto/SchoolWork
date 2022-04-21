'''
Este programa se trata de resolver los problemas de minimos cuadraticos, dandonos su funcion, y obteniendo los demas datos
'''
from numpy import sqrt
import pandas as pd, os, numpy as np

def mostrarCoordenadas(coordenadas):
    if len(coordenadas) != 0:
        print(" * Estas son tus coordenadas: ")
        for i in range(len(coordenadas)):
            print(f"\t({coordenadas[i][0]}, {coordenadas[i][1]})")
        

N = 0
opcion = 0
arreglo = [["i", "x", "y", "x*y", "x^2", "y^2", "(b+mx-y)^2"]]
coords = []

while opcion != 2:
    os.system("cls")
    print("\t1. Agregar coordenadas.")
    print("\t2. Calcular.")
    print()
    mostrarCoordenadas(coords)
    print()

    opcion = int(input(" -> Que deseas hacer: "))

    if opcion == 1:
        os.system("cls")
        x = float(input(" -> Dame x: "))
        y = float(input(" -> Dame y: "))
        N += 1

        coords.append([x, y])
        arreglo.append([ N, x, y, x * y, x * x, y * y, "?" ])
os.system("cls")

#Calculamos (b + mx - y)^2
#Calculamos la suma de cada columna menos de la 1ra
aux = [N]
for j in range(1, 6):
    valor = 0
    for i in range(1, len(arreglo)):
        valor += arreglo[i][j]
    aux.append(valor)
aux.append("?")
arreglo.append(aux)

#Ahora calculamos m, b y r
'''
m = ( N * Sxy - SxSy ) / ( N * Sx^2 - Sxx)
b = ( Sy * Sx^2 - Sx * Sxy ) / ( N * Sx^2 - Sx * Sx )
r = ( N * Sxy - SxSy ) / ( sqrt( N * Sx^2 - SxSx ) * sqrt( N * Sy^2 - Sy * Sy ) )
'''
sumas = arreglo[len(arreglo) - 1]

m = ( N * sumas[3] - sumas[1] * sumas[2] ) / ( N * sumas[4] - pow(sumas[1], 2) )
b = ( ( sumas[2] * sumas[4] - sumas[1] * sumas[3] ) / ( N * sumas[4] - sumas[1] * sumas[1] ) )
r = ( ( N * sumas[3] - sumas[1] * sumas[2] ) / ( sqrt( N * sumas[4] - pow(sumas[1], 2) ) * sqrt( N * sumas[5] - pow(sumas[2], 2) ) ) )

print()
print(" -> m:", m)
print(" -> b:", b)
print(" -> r:", r)

#Por casi ultimo aplicamos la formula para cada fila ( b + mx - y )^2
for i in range(1, len(arreglo)):
    arreglo[i][6] = pow(( b + m * arreglo[i][1] - arreglo[i][2] ), 2)

#Hacemos la suma de la columna para las formulas
suma = 0
for i in range(1, len(arreglo) - 1):
    suma += arreglo[i][6]

signoRaro = suma
arreglo[len(arreglo) - 1][6] = suma

print(" -> Signo Raro:", signoRaro)
print()
print()

#Creamos la tabla para que se vea mas presentable nuestra tabla
tabla = np.array(arreglo)
tabla = pd.DataFrame(columns=tabla[0, 0: ], index=tabla[1: , 0], data=tabla[1: , 0:])
print(tabla)

#Calculamos el error de m y de b

errorM = sqrt( ( N / ( N * pow(sumas[1], 2) - pow(sumas[1], 2) ) ) * (signoRaro / ( N - 2 )) )
errorB = sqrt( ( sumas[4] / ( N * sumas[4] - pow(sumas[1], 2) ) ) * ( signoRaro / ( N - 2 ) ) )

print()
print(" * El error para m es de:", errorM)
print(" * El error para b es de:", errorB)
print()
print(" **********************************")
print()
print(" * y = mx + b")
print(f" * y = {round(m, 2)}x + ({round(b, 2)})")
print(f" * y = ({round(m, 2)} \u00B1 {round(errorM, 2)})x + ({round(b, 2)} \u00B1 {round(errorB, 2)})")

os.system("pause")