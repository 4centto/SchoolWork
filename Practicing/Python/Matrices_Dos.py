#ARREGLOS
#Declaracion de variables
n = int(input("Ingrese el tamaño del arreglo: "))
m = int(input("Ingrese el numero de multiplos: "))
A = []

#Ciclo para llenar el arreglo
for i in range(0, n): # Se establece el tamaño del arreglo, que empieza en o y va hasta n que es el valor digitado por el usuario
    A.append(i * m) # Se llena el arreglo con i por m

print(A) # Se imprime el arreglo

print()
print("2do EJERCICIO")
print()

#[1,5,8,9,30,9,13]
#Imprimir en pantalla los numeros impares a 3
B = [1,5,8,9,30,9,13]
C = []
for i in B:
    if i > 3 and i % 2 != 0:
        C.append(i)
print(C)