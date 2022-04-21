#Problema 4.11
#Primero se crean los arreglos que estaran recibiendo los datos de los paises
#Se piden las cantidades de los paises
N_norte = int(input("¿Cuantos paises del norte seran ingresados?  "))
N_centro = int(input("¿Cuantos paises del centro seran ingresados?  "))
N_sur = int(input("¿Cuantos paises del sur seran ingresados?  "))

NOR = ["" for i in range(N_norte)]
CEN = ["" for i in range(N_centro)]
SUR = ["" for i in range(N_sur)]
AMERICA = [] #Se crea el arreglo para todos los paises

#Llenado de los arreglos
for i in range(len(NOR)):
    print("Dame nombre el pais N°", (i + 1), " del Norte:", end=" ")
    NOR[i] = input()

for i in range(len(CEN)):
    print("Dame nombre el pais N°", (i + 1), " del Centro:", end=" ")
    CEN[i] = input()

for i in range(len(SUR)):
    print("Dame nombre el pais N°", (i + 1), " del Sur:", end=" ")
    SUR[i] = input()

#Impresion de los arreglos ordenados independientemente
NOR.sort()
CEN.sort()
SUR.sort()

print()
print("Norteamerica: ", end="")
print(NOR)
print("Centroamerica: ", end="")
print(CEN)
print("Sudamerica: ", end="")
print(SUR)

#Se llena el arreglo america con los demas arreglos
for i in range(len(NOR)):
    AMERICA.append(NOR[i])

for i in range(len(CEN)):
    AMERICA.append(CEN[i])

for i in range(len(SUR)):
    AMERICA.append(SUR[i])

#Se imprime ya una vez ordenada
AMERICA.sort()

print()
print("America: ", end="")
print(AMERICA)