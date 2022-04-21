from Gauss import GaussJordan
import os

'''
Para comenzar, este tipo de problemas siempre nos tienen que dar 3 puntos del plano cartesiano
A, B, C y en base a ellos, calculamos la funcion que pasa por los 3 puntos.

    1. Primero pedimos cuales son los tres puntos A, B, C
    2. Ahora sustituimos las 3 funciones en la ecuacion cuadratica a^2+bx+c de la siguiente manera:
        A(1, 2) -> 2 = a(1)^2 + b(1) + c
    3. Luego resolvemos el sistema de ecuaciones resultante para hallar los valores de a, b y c.
    4. Luego en nuestra ecuacion cuadrática a^2 + bx + c reemplazamos los valores de las literales
       por los valores encontrados de la solucion de la matriz.
    5. Si fuera el caso de inter o extra polar algunos valores en x, solo sustituimos x por el valor dado
       en nuestra ecuacion resultante de todo el procedimiento y hacer sus respectivas operaciones.
'''

def mostrarEcuacion(Punto, matriz):
    print(f"\ta({Punto[0]})^2 + b({Punto[0]}) + c = {Punto[1]}")
    print(f"\ta({Punto[0] * Punto[0]}) + b({Punto[0]}) + c = {Punto[1]}")
    matriz.append([Punto[0] * Punto[0], Punto[0], 1, Punto[1]])

A, B, C = [], [], []
matriz = []

#Pedimos los datos de las coordenadas A, B, C
for i in range(3):
    if i == 0:
        os.system("cls")
        print("* Punto A:")
        x = int(input("\t-> Coordenada X: "))
        y = int(input("\t-> Coordenada Y: "))

        A = [x, y]
    elif i == 1:
        os.system("cls")
        print("* Punto B:")
        x = int(input("\t-> Coordenada X: "))
        y = int(input("\t-> Coordenada Y: "))

        B = [x, y]
    elif i == 2:
        os.system("cls")
        print("* Punto C:")
        x = int(input("\t-> Coordenada X: "))
        y = int(input("\t-> Coordenada Y: "))

        C = [x, y]
os.system("cls")

#Ahora hacemos la ecuacion con los puntos
print("Ecuacion 1: ")
mostrarEcuacion(A, matriz)
print()
print("Ecuacion 2: ")
mostrarEcuacion(B, matriz)
print()
print("Ecuacion 3: ")
mostrarEcuacion(C, matriz)
print()

gaussJordan = GaussJordan(matriz)
gaussJordan.imprimirMatriz()

resultado = gaussJordan.calcular()

a = resultado["x"]
b = resultado["y"]
c = resultado["z"]

print()
if b < 0:
    if c < 0:
        print(f"\t * y = {a}x^2 - {abs(b)}x - {abs(c)} * ")
    else:
        print(f"\t * y = {a}x^2 - {abs(b)}x + {c} * ")
else:
    if c < 0:
        print(f"\t * y = {a}x^2 + {b}x - {abs(c)} * ")
    else:
        print(f"\t * y = {a}x^2 + {b}x + {c} * ")

os.system("pause")